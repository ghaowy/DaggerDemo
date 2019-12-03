package com.imprexion.daggerdemo.main.contract;

/**
 * @author : yan
 * @date : 2019/11/30 16:45
 * @desc : TODO
 */
public interface IMainContract {

    interface IMainView {
        void doView();
    }

    interface IMainPresenter {
        void doPresenter();
    }

    interface IMainModel {
        void doModel();
    }
}
