package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAllCars();
    List<Car> getFirstNCars(int n);
}
