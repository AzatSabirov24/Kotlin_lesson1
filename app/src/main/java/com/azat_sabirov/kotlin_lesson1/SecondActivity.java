package com.azat_sabirov.kotlin_lesson1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private Button secondBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondBtn = findViewById(R.id.sec_button);
        secondBtn.setOnClickListener(v -> {
            new AlertDialog.Builder(this).
                    setTitle("Заголовок").
                    setMessage("Описание").
                    setPositiveButton("Ok", (dialog, which) -> {
                        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                    }).show();

        });
    }
}
