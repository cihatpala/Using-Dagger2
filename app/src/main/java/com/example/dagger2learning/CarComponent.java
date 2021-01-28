package com.example.dagger2learning;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
