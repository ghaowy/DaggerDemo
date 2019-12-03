package com.imprexion.daggerandroiddemo.di.module;

import com.imprexion.daggerandroiddemo.main.view.MainActivity;
import com.imprexion.daggerandroiddemo.di.component.DaggerAndroidActSubComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author : yan
 * @date : 2019/12/2 14:30
 * @desc : TODO
 */
@Module(subcomponents = DaggerAndroidActSubComponent.class)
public abstract class AllActivityModule {


    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity provideDaggerActivityInjector();
}
