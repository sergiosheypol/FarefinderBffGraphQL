package com.shpl.farefinderbff.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.shpl.farefinderbff.model.Fare;
import com.shpl.farefinderbff.model.Price;
import com.shpl.farefinderbff.model.PriceItem;

public class FareResolver implements GraphQLResolver<Fare> {

    public Price getPrice(Fare fare) {
        return Price.builder()
                .base(fare.getPrice().getBase())
                .adjustment(fare.getPrice().getAdjustment())
                .build();
    }

    public PriceItem getBase(Fare fare) {
        return PriceItem.builder()
                .currencyCode(fare.getPrice().getBase().getCurrencyCode())
                .value(fare.getPrice().getBase().getValue())
                .build();
    }

    public PriceItem getAdjustment(Fare fare) {
        return PriceItem.builder()
                .currencyCode(fare.getPrice().getAdjustment().getCurrencyCode())
                .value(fare.getPrice().getAdjustment().getValue())
                .build();
    }
}
