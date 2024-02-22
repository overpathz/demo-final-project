package com.pathz.demo.service;

import com.pathz.demo.model.WeatherData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
@Slf4j
public class OwnWeatherService {

    private final CityService cityService;

    public WeatherData getWeather(String city) {
        List<String> availableCities = cityService.getAvailableCities();
        if (!availableCities.contains(city)) {
            // throw some exception or return an error
            return null;
        }
        return WeatherData.builder()
                .city(city)
                .temperature(ThreadLocalRandom.current().nextDouble(35))
                .build();
    }
}
