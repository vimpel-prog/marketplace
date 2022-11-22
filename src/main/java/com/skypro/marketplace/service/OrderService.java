package com.skypro.marketplace.service;

import com.skypro.marketplace.component.Basket;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    private final Basket basket;

    public OrderService(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> getItems() {
        return basket.getBasketContent();
    }

    public void addToBasket(List<Integer> idsToAdd) {
        basket.addToBasket(idsToAdd);
    }
}
