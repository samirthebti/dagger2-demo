package com.thesam.dagger_2_demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Samir Thebti  on 6/12/16.
 * ----->> thebtisam@gmail.com <<-----
 */
@Singleton
@Component(modules = VehiculeModel.class)
public interface VehiculInterface {
    Vehicle provideVehicule();
}
