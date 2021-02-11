package com.example.dagger2learning.dagger;

import com.example.dagger2learning.car.Rims;
import com.example.dagger2learning.car.Tires;
import com.example.dagger2learning.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {
    //Bu sınıfa Wheels'in elemanlarına da erişebilmek için ihtiyaç vardır.

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
