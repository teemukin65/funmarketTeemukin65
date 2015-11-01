package fi.teemukin65.alma.services;

import fi.teemukin65.alma.model.funmarketApi.MarketAds;
import fi.teemukin65.alma.services.dto.AdvertisementDto;
import fi.teemukin65.alma.services.dto.FunmarketDtoConverter;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teemu on 27.10.2015.
 */
@Service
public class DefaultFunmarketApiService implements FunmarketApiService {


    @Autowired
    Validator validator;

    @Autowired
    FunmarketDtoConverter funmarketDtoConverter;


    final static String marketAdsApiUrl = "http://mepa-store-api.herokuapp.com/marketads";
    Logger logger = LoggerFactory.getLogger(this.getClass());
    RestTemplate marketAdsTempate = new RestTemplate();

    public List<AdvertisementDto> listAdvertisements() throws NotFoundException {
        try {
            ResponseEntity<List<MarketAds>> adsListResponse = marketAdsTempate.exchange(
                    marketAdsApiUrl, HttpMethod.GET, null,
                    new ParameterizedTypeReference<List<MarketAds>>() {
                    });
            List<MarketAds> marketAdsList = adsListResponse.getBody();
            List<AdvertisementDto> advertisementDtosToReturn = new ArrayList<AdvertisementDto>();
            for (MarketAds ads : marketAdsList) {
                try {

                    advertisementDtosToReturn.add(
                            funmarketDtoConverter.convert(ads, new AdvertisementDto())
                    );
                } catch (Throwable e) {
                    logger.warn("unconvertable data from mepa-market:" + ads.toString(), e);
                    continue;
                }
            }
            return advertisementDtosToReturn;
        } catch (Exception e) {
            logger.error("Problem in fetching ads list from mepa-store-api", e);
            throw new NotFoundException("No Ads found", e);
        }
    }

    @Override
    public AdvertisementDto getAdvertisement(String id) {
        MarketAds marketAds = marketAdsTempate.getForObject(marketAdsApiUrl + "/{id}", MarketAds.class, id);
        return funmarketDtoConverter.convert(
                marketAds,
                new AdvertisementDto()
        );
    }

    @Override
    public AdvertisementDto postAdvertisement(AdvertisementDto advertisementDto) {


        MarketAds newMarketAdsContent =
                funmarketDtoConverter.convert(advertisementDto, new MarketAds(), MarketAds.class),
                returnedAds = null;

        try {
            returnedAds = marketAdsTempate.postForObject(marketAdsApiUrl, newMarketAdsContent, MarketAds.class);
        } catch (Throwable e) {
            logger.warn("postAdvertisement object posting throw:", e);
        }


        return funmarketDtoConverter.convert(
                returnedAds,
                new AdvertisementDto()
        );
    }


}
