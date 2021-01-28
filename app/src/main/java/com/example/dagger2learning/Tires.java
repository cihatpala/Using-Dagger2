package com.example.dagger2learning;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject
    //Bu sınıfa sahip değiliz, bu yüzden @Inject ile açıklama yapamayız

    private static final String TAG = "CAR";

    public void inflate(){
        Log.d(TAG, "Tired inflated / Lastik şişirildi");
    }
}
