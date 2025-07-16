package com.example.demo.dto;

public class YerlesimAyrintiDto {
    private String VagonAdi;
    private int KisiSayisi;

    public YerlesimAyrintiDto(String vagonAdi, int kisiSayisi) {
        VagonAdi = vagonAdi;
        KisiSayisi = kisiSayisi;
    }

    public String getVagonAdi() {
        return VagonAdi;
    }

    public void setVagonAdi(String vagonAdi) {
        VagonAdi = vagonAdi;
    }

    public int getKisiSayisi() {
        return KisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        KisiSayisi = kisiSayisi;
    }
}
