package com.shpl.farefinderbff.controller;

import com.shpl.farefinderbff.model.Fare;
import com.shpl.farefinderbff.service.FareService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class Controller {

    private final FareService fareService;

    @GetMapping
    public Flux<Fare> getFares(final String departureDateFrom, final String departureDateTo,
                               final String arrivalAirport,
                               final String departureAirport, final String currencyCode) {
        return fareService.getFares(departureDateFrom, departureDateTo, arrivalAirport, departureAirport,
                currencyCode);
    }
}
