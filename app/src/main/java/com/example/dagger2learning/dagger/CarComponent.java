package com.example.dagger2learning.dagger;

import com.example.dagger2learning.MainActivity;
import com.example.dagger2learning.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DiesellEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
