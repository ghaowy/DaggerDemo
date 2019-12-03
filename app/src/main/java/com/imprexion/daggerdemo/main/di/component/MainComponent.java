package com.imprexion.daggerdemo.main.di.component;

import com.imprexion.daggerdemo.MainActivity;
import com.imprexion.daggerdemo.main.SecondActivity;
import com.imprexion.daggerdemo.main.di.module.MainModule;
import com.imprexion.daggerdemo.main.presenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author : yan
 * @date : 2019/11/30 16:52
 * @desc : TODO
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity activity);

    void inject(MainPresenter presenter);

    void inject(SecondActivity activity);
}
