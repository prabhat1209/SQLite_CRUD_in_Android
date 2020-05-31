package com.example.firtry.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.firtry.R;

public class display_contact extends AppCompatActivity {

    TextView n, p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
        n = findViewById(R.id.name);
        p = findViewById(R.id.phone);
        Intent it = getIntent();
        String name = it.getStringExtra("Rname");
        String phone = it.getStringExtra("Rphone");
        n.setText(name);
        p.setText(phone);
    }
}
