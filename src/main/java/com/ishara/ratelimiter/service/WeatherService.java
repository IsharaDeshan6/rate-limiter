package com.ishara.ratelimiter.service;

public interface WeatherService {
    String getWeather(String city);

    String getMoreWeather(String city);
}
