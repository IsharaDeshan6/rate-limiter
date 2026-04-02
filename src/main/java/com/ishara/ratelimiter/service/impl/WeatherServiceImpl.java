package com.ishara.ratelimiter.service.impl;

import com.ishara.ratelimiter.service.WeatherService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {


    @Override
    @RateLimiter(name = "weatherServiceRateLimiter", fallbackMethod = "getWeatherFallback")
    public String getWeather(String city) {
        return String.format("Sunny in %s", city);
    }

    @Override
    @RateLimiter(name = "moreWeatherServiceRateLimiter", fallbackMethod = "getWeatherFallback")
    public String getMoreWeather(String city) {
        return String.format("Sunny in %s", city);
    }

    public String getWeatherFallback(String city, Throwable throwable) {
        return String.format("Weather service is currently unavailable for %s. Please try again later.", city);
    }


}
