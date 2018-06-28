package com.rabarijaona.demosrd;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.util.Currency;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Price {
    BigDecimal amount;
    Currency currency;

    public Price(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
