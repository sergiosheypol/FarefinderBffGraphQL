package com.shpl.farefinderbff.service;

import com.shpl.farefinderbff.dto.FarefinderBffDto;
import com.shpl.farefinderbff.model.Fare;
import com.shpl.farefinderbff.provider.DataProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class FareService {

    private final DataProvider dataProvider;

    public Flux<Fare> getFares(final FarefinderBffDto farefinderBffDto) {
        return dataProvider.getFares(farefinderBffDto);
    }
}
