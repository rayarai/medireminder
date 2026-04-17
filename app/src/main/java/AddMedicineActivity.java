package com.example.medireminder;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class AddMedicineActivity extends AppCompatActivity {

    EditText medName, medTime;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);

        medName = findViewById(R.id.medName);
        medTime = findViewById(R.id.medTime);
        saveBtn = findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(v -> {
            String name = medName.getText().toString();
            String time = medTime.getText().toString();

            Toast.makeText(this, "Medicine Saved: " + name, Toast.LENGTH_SHORT).show();
        });
    }
}