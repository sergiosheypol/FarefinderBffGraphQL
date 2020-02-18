package com.shpl.farefinderbff.service;

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

    public Flux<Fare> getFares(final String departureDateFrom, final String departureDateTo,
                               final String arrivalAirport,
                               final String departureAirport, final String currencyCode) {
        return dataProvider.getFares(departureDateFrom, departureDateTo, arrivalAirport, departureAirport,
                currencyCode);
    }
}
