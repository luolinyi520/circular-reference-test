package com.example.circularreferencetest.service.strategy;

import com.example.circularreferencetest.service.FranceCalculateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class HolidayStrategyFactory {

    @Resource
    private FranceCalculateService franceCalculateService;

    public HolidayStrategyFactory() {
        System.out.println("HolidayStrategyFactory init...");
    }

}
