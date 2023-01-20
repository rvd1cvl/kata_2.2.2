package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("VolksWagen", 1, "Aboba1"),
            new Car("Porsche", 2, "Aboba2"),
            new Car("Ferrari", 3 ,"Aboba3"),
            new Car("Hyundai", 4, "Aboba4"),
            new Car("Lada", 5 , "Aboba5")
    ));


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getFirstNCars(int n) {
        if (n < 0) {
            n = 0;
        } else if (n > cars.size()) {
            return cars;
        }
        return cars.subList(0 , n);
    }
}
