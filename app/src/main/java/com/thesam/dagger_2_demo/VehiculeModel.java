package com.thesam.dagger_2_demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Samir Thebti  on 6/12/16.
 * ----->> thebtisam@gmail.com <<-----
 */
@Module
public class VehiculeModel {
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicule() {
        return new Vehicle(new Motor());
    }
}
