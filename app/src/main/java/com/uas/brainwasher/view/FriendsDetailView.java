package com.uas.brainwasher.view;

import com.uas.brainwasher.data.model.Friends;

/* 10116317 - Husna Kusuma Wardani
   13 Agustus 2019
* */

public interface FriendsDetailView {
    void showDetail(Friends fr);
    void actionCall();
    void actionEmail();
    void actionInstagram();
    void onFriendDeleted();
}
