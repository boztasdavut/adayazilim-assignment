package com.example.demo.dto;

import java.util.List;

public class RezervasyonCevap {
    private boolean RezervasyonYapilabilir;
    private List<YerlesimAyrintiDto> YerlesimAyrinti;

    public RezervasyonCevap(boolean rezervasyonYapilabilir, List<YerlesimAyrintiDto> yerlesimAyrinti) {
        RezervasyonYapilabilir = rezervasyonYapilabilir;
        YerlesimAyrinti = yerlesimAyrinti;
    }

    public boolean isRezervasyonYapilabilir() {
        return RezervasyonYapilabilir;
    }

    public void setRezervasyonYapilabilir(boolean rezervasyonYapilabilir) {
        RezervasyonYapilabilir = rezervasyonYapilabilir;
    }

    public List<YerlesimAyrintiDto> getYerlesimAyrinti() {
        return YerlesimAyrinti;
    }

    public void setYerlesimAyrinti(List<YerlesimAyrintiDto> yerlesimAyrinti) {
        YerlesimAyrinti = yerlesimAyrinti;
    }
}
