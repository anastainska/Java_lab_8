package com.company.models;

import com.company.utils.Country;
import com.company.utils.Material;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MeasureInstrument {
    public int price;
    public Country country;
    public Material material;
    public String producer;
    public String measureTime;

    public MeasureInstrument(int price, Country country, Material material, String producer, String measureTime) {
        this.price = price;
        this.country = country;
        this.material = material;
        this.producer = producer;
        this.measureTime = measureTime;
    }
}
