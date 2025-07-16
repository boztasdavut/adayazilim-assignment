package com.example.demo.service;

import com.example.demo.dto.RezervasyonCevap;
import com.example.demo.dto.RezervasyonIstegiDto;
import com.example.demo.dto.VagonDto;
import com.example.demo.dto.YerlesimAyrintiDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RezervasyonServis {


    public RezervasyonCevap rezervasyonCevap(RezervasyonIstegiDto rezervasyonIstegiDto){
        List<YerlesimAyrintiDto> yerlesimAyrinti = new ArrayList<>();
        int rezervasyonYapilacakKisiSayisi = rezervasyonIstegiDto.getRezervasyonYapilacakKisiSayisi();
        System.out.println("Servis katmanına veri geldi");
        System.out.println(rezervasyonIstegiDto);

        if(rezervasyonIstegiDto.isKisilerFarkliVagonlaraYerlestirilebilir()){
            for(VagonDto vagonDto: rezervasyonIstegiDto.getTren().getVagonlar()){
                int kapasite = vagonDto.getKapasite();
                int dolu = vagonDto.getDoluKoltukAdet();
                int musait = (int)(kapasite*0.7)-dolu;
                if(musait <=0){
                    continue;
                }
                int yerlestirilecekKisiSayisi = Math.min(rezervasyonYapilacakKisiSayisi, musait);
                yerlesimAyrinti.add(new YerlesimAyrintiDto(vagonDto.getAd(), yerlestirilecekKisiSayisi));
                rezervasyonYapilacakKisiSayisi -= yerlestirilecekKisiSayisi;
                if(rezervasyonYapilacakKisiSayisi <= 0){
                    break;
                }

            }
            return new RezervasyonCevap(rezervasyonYapilacakKisiSayisi<=0, rezervasyonYapilacakKisiSayisi<=0 ? yerlesimAyrinti : new ArrayList<>());
        }
        else{
            for(VagonDto vagonDto: rezervasyonIstegiDto.getTren().getVagonlar()){
                int kapasite = vagonDto.getKapasite();
                int dolu = vagonDto.getDoluKoltukAdet();
                int musait = (int)(kapasite*0.7)-dolu;
                if (musait >= rezervasyonYapilacakKisiSayisi) {
                    yerlesimAyrinti.add(new YerlesimAyrintiDto(vagonDto.getAd(), rezervasyonYapilacakKisiSayisi));
                    return new RezervasyonCevap(true, yerlesimAyrinti);
                }
            }
            return new RezervasyonCevap(false, new ArrayList<>());
        }



    }

}
