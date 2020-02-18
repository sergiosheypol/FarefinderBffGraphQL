package com.shpl.farefinderbff.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fare {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String connectingAirport;
    private String departureDate;
    private String arrivalDate;
    private Price price;
}
