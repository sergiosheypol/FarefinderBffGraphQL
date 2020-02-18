package com.shpl.farefinderbff.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.shpl.farefinderbff.dto.FarefinderBffDto;
import com.shpl.farefinderbff.model.Fare;
import com.shpl.farefinderbff.service.FareService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class QueriesResolver implements GraphQLQueryResolver {
    private final FareService fareService;

    public List<Fare> getFares(FarefinderBffDto farefinderBffDto) {
        return fareService.getFares(farefinderBffDto).collectList().block();
    }
}
