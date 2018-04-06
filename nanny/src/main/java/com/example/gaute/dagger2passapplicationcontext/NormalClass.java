package com.example.gaute.dagger2passapplicationcontext;

import android.util.Log;

import javax.inject.Inject;

public class NormalClass {
    private NannyApplication nannyApplication;
    private MainActivity mainActivity;

    @Inject
    NormalClass(NannyApplication nannyApplication, MainActivity mainActivity) {
        this.nannyApplication = nannyApplication;
        this.mainActivity = mainActivity;
    }

    public void checkNannyApplication() {
        Log.i("Cls-loader 1: ", nannyApplication.getClassLoader() + "");
    }

    public void checkMainActivity() {
        Log.i("Cls-loader 2: ", mainActivity.getClassLoader() + "");
    }
}
