package com.example.dagger2learning.dagger;

import com.example.dagger2learning.car.Engine;
import com.example.dagger2learning.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
