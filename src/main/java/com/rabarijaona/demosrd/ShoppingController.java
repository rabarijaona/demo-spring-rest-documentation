package com.rabarijaona.demosrd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

import static java.util.Collections.singletonList;

@RestController
public class ShoppingController {

    @GetMapping("/products")
    public List<Product> retrieveProducts(){
        return singletonList(new Product("1", "A product 1", new Price(BigDecimal.TEN, Currency.getInstance("EUR"))));
    }

}
