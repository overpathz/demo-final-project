package com.pathz.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenWeatherMapConfig {

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
