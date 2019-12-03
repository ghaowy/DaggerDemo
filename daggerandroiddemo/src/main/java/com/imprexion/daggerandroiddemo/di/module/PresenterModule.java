package com.imprexion.daggerandroiddemo.di.module;

import com.imprexion.daggerandroiddemo.main.model.MainModel;

import dagger.Module;
import dagger.Provides;

/**
 * @author : yan
 * @date : 2019/12/2 20:02
 * @desc : TODO
 */
@Module
public class PresenterModule {

    @Provides
    MainModel provideModel() {
        return new MainModel();
    }
}
