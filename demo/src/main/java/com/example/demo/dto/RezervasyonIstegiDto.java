package com.example.demo.dto;

public class RezervasyonIstegiDto {
    private TrenDto tren;
    private int rezervasyonYapilacakKisiSayisi;
    private boolean kisilerFarkliVagonlaraYerlestirilebilir;

    public TrenDto getTren() {
        return tren;
    }

    public void setTren(TrenDto tren) {
        this.tren = tren;
    }

    public int getRezervasyonYapilacakKisiSayisi() {
        return rezervasyonYapilacakKisiSayisi;
    }

    public void setRezervasyonYapilacakKisiSayisi(int rezervasyonYapilacakKisiSayisi) {
        this.rezervasyonYapilacakKisiSayisi = rezervasyonYapilacakKisiSayisi;
    }

    public boolean isKisilerFarkliVagonlaraYerlestirilebilir() {
        return kisilerFarkliVagonlaraYerlestirilebilir;
    }

    public void setKisilerFarkliVagonlaraYerlestirilebilir(boolean kisilerFarkliVagonlaraYerlestirilebilir) {
        this.kisilerFarkliVagonlaraYerlestirilebilir = kisilerFarkliVagonlaraYerlestirilebilir;
    }

    @Override
    public String toString() {
        return "RezervasyonIstegiDto{" +
                "tren=" + tren +
                ", rezervasyonYapilacakKisiSayisi=" + rezervasyonYapilacakKisiSayisi +
                ", kisilerFarkliVagonlaraYerlestirilebilir=" + kisilerFarkliVagonlaraYerlestirilebilir +
                '}';
    }
}
