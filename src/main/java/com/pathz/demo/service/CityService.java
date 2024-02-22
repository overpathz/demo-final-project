package com.pathz.demo.service;

import com.pathz.demo.entity.City;
import com.pathz.demo.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;

    public List<String> getAvailableCities() {
        return cityRepository.findAll().stream().map(City::getName).collect(toList());
    }
}
