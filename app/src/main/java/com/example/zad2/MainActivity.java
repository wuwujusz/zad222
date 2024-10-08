package com.example.zad2;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextSurName;
    private EditText editTextEmail;
    private EditText editPhoneNumber;
    private EditText editTextPasswordAgain;
    private EditText editTextPassword;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSurName = findViewById(R.id.editTextSurName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editPhoneNumber = findViewById(R.id.editPhoneNumber);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPasswordAgain = findViewById(R.id.editTextPasswordAgain);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString().trim();
                String surname = editTextSurName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String phoneNumber = editPhoneNumber.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String paswordAgain = editTextPasswordAgain.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić imię", Toast.LENGTH_SHORT).show();
                } else if (name.length()<2) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić poprawne imię (conajmniej 2 znaki)", Toast.LENGTH_SHORT).show();
                } else if (surname.length()<2) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić poprawne nazwisko (conajmniej 2 znaki)", Toast.LENGTH_SHORT).show();
                } else if (surname.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić e-mail", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić e-mail", Toast.LENGTH_SHORT).show();
                } else if (phoneNumber.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić numer telefonu", Toast.LENGTH_SHORT).show();
                } else if (phoneNumber.length()<9) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić poprawny numer telefonu", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić hasło", Toast.LENGTH_SHORT).show();
                } else if (password.length()<6) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić poprawny hasło na conajmniej 6 znaków", Toast.LENGTH_SHORT).show();
                } else if (paswordAgain.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić hasło ponownie", Toast.LENGTH_SHORT).show();
                }else if (!password.equals(paswordAgain)) {
                    Toast.makeText(MainActivity.this, "Niepoprawne powtórzenie hasła", Toast.LENGTH_SHORT).show();
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(MainActivity.this, "Niepoprawny adres e-mail", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Formularz przeslany poprawnie", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

