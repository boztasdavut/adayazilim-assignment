package com.example.demo.dto;

public class VagonDto {
    private String ad;
    private int kapasite;
    private int doluKoltukAdet;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getDoluKoltukAdet() {
        return doluKoltukAdet;
    }

    public void setDoluKoltukAdet(int doluKoltukAdet) {
        this.doluKoltukAdet = doluKoltukAdet;
    }

    @Override
    public String  toString() {
        return "VagonDto{" +
                "ad='" + ad + '\'' +
                ", kapasite=" + kapasite +
                ", doluKoltukAdet=" + doluKoltukAdet +
                '}';
    }
}
