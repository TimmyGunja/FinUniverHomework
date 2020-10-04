package com.company;


import java.util.ArrayList;

public class Garage {
    int space;
    ArrayList<Car> cars = new ArrayList<>();

    Garage(int space){
        this.space = space;
    }

    void addCar(Car car){
        if (car.volume <= space) {
            cars.add(car);
            space -= car.volume;
        }
        else {
            System.out.println("Недостаточно места в гараже!");
            System.out.println();  // Отступ
        }
    }

    void getVolume(){
        System.out.println("Осталось " + space + " единиц места" );
        System.out.println();  // Отступ
    }

    void show(){
        System.out.println("В гараже:");
        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println();  // Отступ
        this.getVolume();
    }

    public static void main(String[] args) {
        Car tesla = new Car.Sedan("white", "auto", 400, 5000);
        Car merc = new Car.Coupe("black", "auto", 300, 4000);
        Car bmw = new Car.Cabriolet("blue", "manual", 600, 3000);

        Garage g = new Garage(10_000);
        g.addCar(tesla);
        g.addCar(merc);
        g.addCar(bmw);
        g.show();

    }
}
