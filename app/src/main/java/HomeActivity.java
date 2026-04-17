package com.example.medireminder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button addBtn = findViewById(R.id.addMedicineBtn);

        addBtn.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, AddMedicineActivity.class));
        });
    }
}