package com.shpl.farefinderbff.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FarefinderBffDto {
    private String departureDateFrom;
    private String departureDateTo;
    private String arrivalAirport;
    private String departureAirport;
    private String currencyCode;
}
