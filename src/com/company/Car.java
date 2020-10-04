package com.company;

public class Car {
    String color;
    String gearbox;
    int horsePower;
    int volume;

    Car(String color, String gearbox, int horsePower, int volume) {
        this.color = color;
        this.gearbox = gearbox;
        this.horsePower = horsePower;
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }


    static class Sedan extends Car {
        String formFactor = "Sedan";

        Sedan(String c, String g, int h, int v) {
            super(c, g, h, v);
        }
    }


    static class Coupe extends Car {
        String formFactor = "Coupe";

        Coupe(String c, String g, int h, int v) {
            super(c, g, h, v);
        }
    }


    static class Cabriolet extends Car {
        String formFactor = "Cabriolet";

        Cabriolet(String c, String g, int h, int v){
            super(c, g, h, v);
        }
    }
}