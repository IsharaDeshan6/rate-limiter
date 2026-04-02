package com.ishara.ratelimiter.controller;

import com.ishara.ratelimiter.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @GetMapping
    public  String getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

    @GetMapping("/moreWeather")
    public  String getMoreWeather(@RequestParam String city) {
        return weatherService.getMoreWeather(city);
    }

}
