package fi.teemukin65.alma.controller;

import fi.teemukin65.alma.services.DefaultFunmarketApiService;
import fi.teemukin65.alma.services.FunmarketApiService;
import fi.teemukin65.alma.services.dto.AdvertisementDto;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by teemu on 27.10.2015.
 */
@RestController
@RequestMapping(value = "/api/market/")
public class FunmarketMvcController {

    @Autowired
    FunmarketApiService funmarketApiService;

    @RequestMapping(value = "ads", method = RequestMethod.GET)
    List<AdvertisementDto> listMarketAds() throws NotFoundException {
        return funmarketApiService.listAdvertisements();
    }

    @RequestMapping(value = "ads/{id}", method = RequestMethod.GET)
    AdvertisementDto getMarketAd(@PathVariable(value = "id") String id) {
        return funmarketApiService.getAdvertisement(id);
    }

    @RequestMapping(value = "ads", method = RequestMethod.POST)
    AdvertisementDto postMarketAd(@RequestBody(required = true) @Valid AdvertisementDto advertisementDto) {
        return funmarketApiService.postAdvertisement(advertisementDto);
    }
}
