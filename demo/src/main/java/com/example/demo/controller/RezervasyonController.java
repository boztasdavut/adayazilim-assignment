package com.example.demo.controller;

import com.example.demo.dto.RezervasyonCevap;
import com.example.demo.dto.RezervasyonIstegiDto;
import com.example.demo.service.RezervasyonServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RezervasyonController {

    @Autowired
    RezervasyonServis rezervasyonServis;

    @PostMapping("/api/rezervasyon")
    public RezervasyonCevap rezervasyonKontrol(@RequestBody RezervasyonIstegiDto rezervasyonIstegiDto){

        return rezervasyonServis.rezervasyonCevap(rezervasyonIstegiDto);

    }
}
