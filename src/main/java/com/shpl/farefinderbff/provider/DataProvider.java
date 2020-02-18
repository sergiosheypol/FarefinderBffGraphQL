package com.shpl.farefinderbff.provider;

import com.shpl.farefinderbff.dto.FarefinderBffDto;
import com.shpl.farefinderbff.model.Fare;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Data
@Service
@RequiredArgsConstructor
public class DataProvider {
    private final WebClient webClient;
    private final DataProperties dataProperties;

    public Flux<Fare> getFares(final FarefinderBffDto farefinderBffDto) {

        return webClient.method(HttpMethod.GET)
                .uri(uriBuilder -> uriBuilder
                        .path(dataProperties.getSingleFares())
                        .queryParam("departureDateFrom", farefinderBffDto.getDepartureDateFrom())
                        .queryParam("departureAirport", farefinderBffDto.getDepartureAirport())
                        .queryParam("arrivalAirport", farefinderBffDto.getArrivalAirport())
                        .queryParam("departureDateTo", farefinderBffDto.getDepartureDateTo())
                        .queryParam("currencyCode", farefinderBffDto.getCurrencyCode())
                        .build())
                .retrieve()
                .bodyToFlux(Fare.class);
    }

}
