package com.company.models;

import com.company.utils.Country;
import com.company.utils.Material;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Areometer extends MeasureInstrument {
    public float height_in_cm;

    public Areometer(int price, Country country, Material material, String producer, String measureTime, float height_in_cm) {
        super(price, country, material, producer, measureTime);
        this.height_in_cm = height_in_cm;
    }
}
