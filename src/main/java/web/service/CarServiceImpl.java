package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl  implements  CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl (List<Car> cars) {
        this.cars = cars;

        Car car1 = new Car("Lada", 2022, 100);
        Car car2 = new Car("UAZ", 2001, 200);
        Car car3 = new Car("Reno", 2005, 300);
        Car car4 = new Car("Kia", 2010, 400);
        Car car5 = new Car("Jeep", 2023, 500);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }

    public List<Car> site(int count) {
        if (count>0 && count<5) {
            List<Car> sublist = cars.subList(0, count);
            return sublist;
        } else
            return cars;
    }



}


