package com.uas.brainwasher.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;

import com.uas.brainwasher.data.model.User;
import com.uas.brainwasher.data.repo.UserRepository;
import com.uas.brainwasher.preference.UserPreference;
import com.uas.brainwasher.view.HomeView;



public class HomePresenter {

    private HomeView view;
    private UserRepository repo;
    private UserPreference prefs;

    public HomePresenter(Context context, HomeView view) {
        this.view = view;
        repo = new UserRepository(context);
        prefs = new UserPreference(context);
    }

    public void getUserData(LifecycleOwner owner) {
        String username = prefs.userLogin();
        String password = prefs.passwordLogin();

        repo.selectUser(username, password).observe(owner, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                view.showUser(user);
            }
        });
    }

    public void signOut() {
        prefs.setIsLogin(null, null);
        view.onSignOut();
    }
}
