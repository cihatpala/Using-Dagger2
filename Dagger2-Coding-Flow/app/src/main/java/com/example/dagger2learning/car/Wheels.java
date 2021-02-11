package com.example.dagger2learning.car;

import javax.inject.Inject;

public class Wheels {
    //we don't own this class so we can't annotate it with @Inject
    //Bu sınıfa sahip değiliz, bu yüzden @Inject ile açıklama yapamayız

    private Rims rims;
    private Tires tires;
    @Inject
    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
