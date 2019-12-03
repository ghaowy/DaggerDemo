package com.imprexion.daggerandroiddemo.main.contract;

/**
 * @author : yan
 * @date : 2019/12/2 19:46
 * @desc : TODO
 */
public interface IMainContract {

    interface IMainView {

        void doInView();
    }

    interface IMainPresenter {
        void doInPresenter();
    }

    interface IMainModel {
        void doInModel();
    }
}
