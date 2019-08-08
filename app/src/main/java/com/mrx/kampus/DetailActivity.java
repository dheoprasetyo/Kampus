package com.mrx.kampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    TextView nameTxt, detailTxt,categoryTxt;
    ImageView fototxt;
    LinearLayout back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btnAbout = findViewById(R.id.about);
        btnAbout.setOnClickListener(this);

        back = findViewById(R.id.back);
        back.setOnClickListener(this);

        Intent kampus = getIntent();
        String name = kampus.getExtras().getString("name");
        String detail = kampus.getExtras().getString("detail");
        String photo = kampus.getStringExtra("foto");
        String category = kampus.getStringExtra("category");

        fototxt = findViewById(R.id.photo_kampus);
        nameTxt = findViewById(R.id.name_kampus);
        detailTxt = findViewById(R.id.detail_kampus);
        categoryTxt = findViewById(R.id.category_kampus);

        Glide.with(this).load(photo).into(fototxt);
        nameTxt.setText(name);
        detailTxt.setText(detail);
        categoryTxt.setText(category);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about:
                Intent moveWithDataIntent = new Intent(DetailActivity.this, About.class);
                moveWithDataIntent.putExtra(About.EXTRA_NAME, "Dheo Prasetyo Nugroho");
                moveWithDataIntent.putExtra(About.EXTRA_EMAIL, "dheoprasetyo.dp@gmail.com");
                startActivity(moveWithDataIntent);
                break;
            case R.id.back:
                Intent back = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(back);
                break;
        }
    }
}
