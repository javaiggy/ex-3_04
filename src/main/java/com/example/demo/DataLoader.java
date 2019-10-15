package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner
{
    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... strings) throws Exception
    {
        Car car;
        car = new Car("Ford", "Mustang", "2005");
        carRepository.save(car);

        car = new Car("Chevy", "Suburban", "2017");
        carRepository.save(car);

        car = new Car("Honda", "Accord", "2009");
        carRepository.save(car);
    }

}
