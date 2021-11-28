package ua.lviv.iot.spring.first.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.spring.first.rest.model.MeasureInstrument;
import ua.lviv.iot.spring.first.rest.utils.Country;
import ua.lviv.iot.spring.first.rest.utils.Material;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/instruments")
@RestController
public class MeasureInstrumentController {

    private Map<Integer, MeasureInstrument> instruments = new HashMap<>();

    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<MeasureInstrument> getInstruments() {
        return new LinkedList<MeasureInstrument>(instruments.values());
    }
    @GetMapping(path ="/{id}")
    public MeasureInstrument getInstrument(@PathVariable("id") Integer instrumentId) {
        return instruments.get(instrumentId);
    }

    @PostMapping
    public MeasureInstrument createInstrument(@RequestBody MeasureInstrument instrument){
        instrument.setId(idCounter.incrementAndGet());
        instruments.put(instrument.getId(), instrument);
        return instrument;
    }

    @DeleteMapping(path ="/{id}")
    public ResponseEntity<MeasureInstrument> deleteInstrument(@PathVariable("id") Integer instrumentId){
        if (instruments.remove(instrumentId) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping(path="/{id}")
    public MeasureInstrument updateInstrument(@PathVariable("id") Integer instrumentId,
                                              @RequestBody MeasureInstrument instrument) {
        instrument.setId(instrumentId);
        return instruments.put(instrumentId, instrument);
    }
}
