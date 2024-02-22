package com.pathz.demo.service;

import com.pathz.demo.config.OpenWeatherMapConfig;
import com.pathz.demo.model.WeatherData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OpenWeatherMapService {
    private final OpenWeatherMapConfig config;
    private final RestTemplate restTemplate;

    public WeatherData getWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + config.getApiKey();
        return restTemplate.getForObject(url, WeatherData.class);
    }
}
