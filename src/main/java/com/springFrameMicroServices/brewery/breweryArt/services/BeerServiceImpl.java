package com.springFrameMicroServices.brewery.breweryArt.services;

import com.springFrameMicroServices.brewery.breweryArt.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Anna's Beer")
                .beerStyle("Freestyle")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        log.debug("Beer with id: {} saved", beerDto.getId().toString());
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo: implement updateBeer
        log.debug("Beer with id: {} updated", beerId.toString());
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo: implement deleteBeer
        log.debug("Beer with id: {} deleted", beerId.toString());
    }
}
