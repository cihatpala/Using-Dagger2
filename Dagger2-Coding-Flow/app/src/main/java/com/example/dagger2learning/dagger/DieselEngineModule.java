package com.example.dagger2learning.dagger;

import com.example.dagger2learning.car.DieselEngine;
import com.example.dagger2learning.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine ){
        return engine;
    }
}
