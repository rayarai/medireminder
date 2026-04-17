public class RegisterActivity package com.example.medireminder;

import android.os.Bundle;
import android.widget.*;

        import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText regEmail, regPassword;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regEmail = findViewById(R.id.regEmail);
        regPassword = findViewById(R.id.regPassword);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(v -> {
            String email = regEmail.getText().toString();
            String pass = regPassword.getText().toString();

            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
        });
    }
}{
}
