package com.example.dagger2learning.car;


import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine Started / Petrol Motor Çalıştırıldı");
    }
}
