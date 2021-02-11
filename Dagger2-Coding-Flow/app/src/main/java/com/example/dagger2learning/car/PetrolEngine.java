package com.example.dagger2learning.car;


import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine Started. Petrol Motor Çalıştırıldı." +
                "\nHorsepower / Beygir Gücü:"+horsePower+
                "\nEngine Capacity / Motor Kapasitesi:"+engineCapacity);
    }
}
