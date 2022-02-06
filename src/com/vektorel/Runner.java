package com.vektorel;

import com.vektorel.entity.Musteri;

public class Runner {

    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        /**
         * Nesne içindeki değerleri setter methodları ile
         * değiştirirsiniz.
         */
        musteri.setAd("Muhammet");
        musteri.setSoyad("HOCA");
        musteri.setId(1);

        /**
         * Nesne içinde var olan değerleri almak için getter methodları
         * kullanılır.
         */
        System.out.println("Müşteri id......: "+ musteri.getId());
        System.out.println("Müşteri ad......: "+ musteri.getAd());
        System.out.println("Müşteri soyad...: "+ musteri.getSoyad());

    }
}
