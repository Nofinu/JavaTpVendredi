package org.example.avril14.DesignPatern;

import org.example.avril14.DesignPatern.Classes.Car;
import org.example.avril14.DesignPatern.Classes.CarData;
import org.example.avril14.DesignPatern.Classes.CarDataAdapter;
import org.w3c.dom.ls.LSOutput;

public class MainDesignPatern {

    public static void main() {
        Car nCar = new CarDataAdapter(new CarData("brand","model","2023","color",25.75d));

        System.out.println(nCar.getBrand());
        System.out.println(nCar.getColor());
        System.out.println(nCar.getModel());
        System.out.println(nCar.getPrice());
        System.out.println(nCar.getYear());

    }

}
