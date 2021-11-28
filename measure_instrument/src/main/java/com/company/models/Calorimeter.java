package com.company.models;

import com.company.utils.Country;
import com.company.utils.Material;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calorimeter extends MeasureInstrument {
    public float maxHeat;

    public Calorimeter(int price, Country country, Material material, String producer, String measureTime, float maxHeat) {
        super(price, country, material, producer, measureTime);
        this.maxHeat = maxHeat;
    }
}
