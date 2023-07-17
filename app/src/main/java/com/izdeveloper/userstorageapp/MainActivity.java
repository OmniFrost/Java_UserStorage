package com.izdeveloper.userstorageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CreateUser(View view) {
        Intent newIntent = new Intent(this, CreateUserActivity.class);

        startActivity(newIntent);
    }

    public void ListAllUsers(View view) {
        Intent newIntent2 = new Intent(this, ListUsersActivity.class);

        startActivity(newIntent2);
    }
}