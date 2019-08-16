package com.uas.brainwasher.view;

import com.uas.brainwasher.data.model.User;

/* 10116317 - Husna Kusuma Wardani
   13 Agustus 2019
* */

public interface HomeView {
    void showUser(User user);
    void onSignOut();
}
