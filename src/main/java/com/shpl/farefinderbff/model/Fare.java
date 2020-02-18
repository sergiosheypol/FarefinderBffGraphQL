package com.shpl.farefinderbff.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fare {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String connectingAirport;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private Price price;
}
