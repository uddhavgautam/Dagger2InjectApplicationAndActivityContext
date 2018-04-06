package com.example.gaute.dagger2passapplicationcontext.di.component;

import com.example.gaute.dagger2passapplicationcontext.MainActivity;
import com.example.gaute.dagger2passapplicationcontext.di.module.MainActivityModule;

import dagger.Subcomponent;

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent {
    MainActivity mainActivity();

    @Subcomponent.Builder
    interface Builder {
        Builder mainActivityModule(MainActivityModule mainActivityModule);

        MainActivityComponent build();
    }
}

