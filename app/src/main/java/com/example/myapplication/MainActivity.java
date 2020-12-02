package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserList userList = UserList.get();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = new UserListFragment();
        fragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
    }
}