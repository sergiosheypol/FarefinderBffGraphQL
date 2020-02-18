package com.shpl.farefinderbff.provider;

import com.shpl.farefinderbff.model.Fare;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Date;

@Data
@Service
@RequiredArgsConstructor
public class DataProvider {
    private final WebClient webClient;
    private final DataProperties dataProperties;

    public Flux<Fare> getFares(final String departureDateFrom, final String departureDateTo,
                               final String arrivalAirport,
                               final String departureAirport, final String currencyCode) {

        return webClient.method(HttpMethod.GET)
                .uri(uriBuilder -> uriBuilder
                        .path(dataProperties.getSingleFares())
                        .queryParam("departureDateFrom", departureDateFrom)
                        .queryParam("departureAirport", departureAirport)
                        .queryParam("arrivalAirport", arrivalAirport)
                        .queryParam("departureDateTo", departureDateTo)
                        .queryParam("currencyCode", currencyCode)
                        .build())
                .retrieve()
                .bodyToFlux(Fare.class);
    }

}
