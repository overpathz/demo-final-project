package com.pathz.demo.controller;

import com.pathz.demo.model.WeatherData;
import com.pathz.demo.service.CityService;
import com.pathz.demo.service.OpenWeatherMapService;
import com.pathz.demo.service.OwnWeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/weather")
public class WeatherController {
    private final CityService cityService;
    private final OwnWeatherService ownWeatherService;
    private final OpenWeatherMapService openWeatherMapService;

    @GetMapping("/{city}")
    public WeatherData getFreeWeatherData(@PathVariable String city) {
        return ownWeatherService.getWeather(city);
    }

    @GetMapping("/available")
    public List<String> getAvailableCities() {
        return cityService.getAvailableCities();
    }

    @GetMapping("/vip/{city}")
    public WeatherData getVipWeather(@PathVariable String city) {
        return openWeatherMapService.getWeather(city);
    }
}