package com.mrx.kampus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_EMAIL = "extra_email";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView nama = findViewById(R.id.nama);
        TextView email = findViewById(R.id.email);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String text = name ;
        nama.setText(text);

        String emails = getIntent().getStringExtra(EXTRA_EMAIL);
        String texts= emails ;
        email.setText(texts);
    }
}
