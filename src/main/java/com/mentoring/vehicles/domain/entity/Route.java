package com.mentoring.vehicles.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class Route {

    long id;
    String name;
    List<Stop> stops;
}

