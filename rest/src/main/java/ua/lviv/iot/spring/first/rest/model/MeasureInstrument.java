package ua.lviv.iot.spring.first.rest.model;

import ua.lviv.iot.spring.first.rest.utils.Country;
import ua.lviv.iot.spring.first.rest.utils.Material;

public class MeasureInstrument {
    public int price;
    public Country country;
    public Material material;
    public String producer;
    public String measureTime;
    public int id;

    public MeasureInstrument(){}

    public MeasureInstrument(int price, Country country, Material material, String producer, String measureTime) {
        this.price = price;
        this.country = country;
        this.material = material;
        this.producer = producer;
        this.measureTime = measureTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(String measureTime) {
        this.measureTime = measureTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
