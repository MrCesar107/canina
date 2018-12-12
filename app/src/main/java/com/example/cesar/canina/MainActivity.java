package com.example.cesar.canina;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView answerText;
    ImageView dogImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerText = findViewById(R.id.answer_text);
        answerText.setText("Si fus perro tu edad seria de:");

        dogImage = findViewById(R.id.dog_image);
        dogImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog));


    }
}
