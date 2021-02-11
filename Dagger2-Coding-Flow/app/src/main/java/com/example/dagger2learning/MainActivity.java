package com.example.dagger2learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2learning.car.Car;
import com.example.dagger2learning.car.DieselEngine;
import com.example.dagger2learning.dagger.CarComponent;
import com.example.dagger2learning.dagger.DaggerCarComponent;
import com.example.dagger2learning.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);
        car.drive();
    }
}