package com.imprexion.daggerandroiddemo.di.component;

import com.imprexion.daggerandroiddemo.app.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * @author : yan
 * @date : 2019/12/2 11:16
 * @desc : TODO
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface DaggerAndroidActSubComponent extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {

    }

}
