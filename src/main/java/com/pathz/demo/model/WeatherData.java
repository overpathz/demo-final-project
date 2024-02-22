package com.pathz.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WeatherData {
    private String city;
    private double temperature;
}
