package com.company.manager;

import com.company.models.MeasureInstrument;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Manager {
    public List<MeasureInstrument> itemsList = new ArrayList<MeasureInstrument>();

    public Manager(List<MeasureInstrument> list) {
        this.itemsList = itemsList;
    }

    public Manager() {

    }

    public void addMachinery(MeasureInstrument measureInstrument) {
        itemsList.add(measureInstrument);
    }

    public List<MeasureInstrument> sortByPrice(List<MeasureInstrument> tempList,
                                               boolean ascending, Comparator<MeasureInstrument> comparator) {
        if(ascending) {
            Collections.sort(tempList, comparator);
        } else {
            Collections.sort(tempList, comparator);
        }
        return tempList;
    }

    public List<MeasureInstrument> findByProducer(String producer, List<MeasureInstrument> tempList) {
        return tempList.stream().filter(measureInstrument -> measureInstrument.getProducer().equals(producer))
                .collect(Collectors.toList());
    }
}

