package com.example.demo.dto;

import java.util.List;

public class TrenDto {
    private String ad;
    private List<VagonDto> vagonlar;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<VagonDto> getVagonlar() {
        return vagonlar;
    }

    public void setVagonlar(List<VagonDto> vagonlar) {
        this.vagonlar = vagonlar;
    }

    @Override
    public String toString() {
        return "TrenDto{" +
                "ad='" + ad + '\'' +
                ", vagonlar=" + vagonlar +
                '}';
    }
}
