package com.izdeveloper.userstorageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.view.View;

public class CreateUserActivity extends AppCompatActivity {

    private EditText name, sname, email;
    private RadioGroup rgProgramChoise, rgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        name = findViewById(R.id.txtName);
        sname = findViewById(R.id.txtSurname);
        email = findViewById(R.id.txtDefaultEmail);
        rgProgramChoise = findViewById(R.id.rgProgramChoise);
        rgAvatar = findViewById(R.id.rgAvatars);
    }

    public void addUsertoList(View view) {
        String Name, Surname, Email;
        String Degree = "";
        int Avatar = 0;

        Name = name.getText().toString();
        Surname = sname.getText().toString();
        Email = email.getText().toString();

        switch (rgProgramChoise.getCheckedRadioButtonId()) {

            case R.id.radioButton:
                Degree = "Tietotekniikka";
                break;

            case R.id.radioButton2:
                Degree = "Tuotantotalous";
                break;

            case R.id.radioButton3:
                Degree = "Laskennallinen tekniikka";
                break;

            case R.id.radioButton4:
                Degree = "Sähkötekniikka";
                break;
        }

        switch (rgAvatar.getCheckedRadioButtonId()) {

            case R.id.radioButton5:
                Avatar = 1;
                break;

            case R.id.radioButton6:
                Avatar = 2;
                break;

            case R.id.radioButton7:
                Avatar = 3;
                break;

            case R.id.radioButton8:
                Avatar = 4;
                break;
        }

        User newUser = new User(Name, Surname, Email, Degree, Avatar);
        UserStorage.getSingle().addUser(newUser);
    }
}