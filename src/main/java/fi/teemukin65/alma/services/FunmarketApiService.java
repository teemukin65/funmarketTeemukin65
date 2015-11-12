package fi.teemukin65.alma.services;

import fi.teemukin65.alma.services.dto.AdvertisementDto;
import javassist.NotFoundException;

import java.util.List;

/**
 * Created by teemu on 27.10.2015.
 */
public interface FunmarketApiService {

    List<AdvertisementDto> listAdvertisements() throws NotFoundException;

    AdvertisementDto getAdvertisement(String id);

    AdvertisementDto postAdvertisement(AdvertisementDto advertisementDto);

    void deleteAdvertisement(String id);

}
