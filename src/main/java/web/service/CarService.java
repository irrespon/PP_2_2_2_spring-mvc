package web.service;

import web.model.Car;

import java.util.List;

public class CarService {

    public static List<Car> getNumberCars(List<Car> carList, int quantityCar) {
        return carList.stream().limit(quantityCar).toList();
    }

}
