package com.company.models;

import com.company.utils.Country;
import com.company.utils.Kind;
import com.company.utils.Material;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Thermometer extends MeasureInstrument {
    public float maxTemperature;
    public Kind kind;

    public Thermometer(int price, Country country, Material material, String producer, String measureTime, float maxTemperature, Kind kind) {
        super(price, country, material, producer, measureTime);
        this.maxTemperature = maxTemperature;
        this.kind = kind;
    }
}
