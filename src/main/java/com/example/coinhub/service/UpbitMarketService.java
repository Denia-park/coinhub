package com.example.coinhub.service;

import org.springframework.stereotype.Service;

@Service
public class UpbitMarketService implements MarketService{

    @Override
    public double getCoinCurrentPrice(String coin) {

        return 1;
    }
}
