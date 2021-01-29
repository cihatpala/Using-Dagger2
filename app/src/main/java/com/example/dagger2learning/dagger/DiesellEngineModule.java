package com.example.dagger2learning.dagger;

import com.example.dagger2learning.car.DieselEngine;
import com.example.dagger2learning.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiesellEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
