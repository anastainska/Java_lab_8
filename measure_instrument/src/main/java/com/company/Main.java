package com.company;

import com.company.manager.Manager;
import com.company.models.Areometer;
import com.company.models.Calorimeter;
import com.company.models.MeasureInstrument;
import com.company.models.Thermometer;
import com.company.utils.Country;
import com.company.utils.Kind;
import com.company.utils.Material;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.List;

@Getter
@Setter
public class Main {

    public static void main(String[] args) {
	Manager manager = new Manager();
    List<MeasureInstrument> tempList;
    tempList = manager.getItemsList();

    MeasureInstrument Thermometer1 = new Thermometer(50, Country.UKRAINE, Material.PLASTIC, "Volodymyr INC", "7:00", 40, Kind.DIGITAL);
    MeasureInstrument Areometer1 = new Areometer(170, Country.UKRAINE, Material.PLASTIC, "Anastasiia INC", "7:00", 13);
    MeasureInstrument Calorimeter1 = new Calorimeter(150, Country.UKRAINE, Material.PLASTIC, "Dmytro INC", "7:00", 10);
    MeasureInstrument Calorimeter2 = new Calorimeter(130, Country.UKRAINE, Material.PLASTIC, "Dmytro INC", "7:00", 10);

    manager.addMachinery(Thermometer1);
    manager.addMachinery(Areometer1);
    manager.addMachinery(Calorimeter1);
    manager.addMachinery(Calorimeter2);

    System.out.print(manager.sortByPrice(manager.getItemsList(), true,
            Comparator.comparing(MeasureInstrument::getPrice)));
    System.out.println("\n");
    System.out.println(manager.findByProducer("Dmytro INC", tempList));
    }
}
