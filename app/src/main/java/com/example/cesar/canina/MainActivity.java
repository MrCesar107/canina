package com.example.cesar.canina;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerText = findViewById(R.id.answer_text);
        final EditText ageEditText = findViewById(R.id.age_edit_text);
        answerText.setText("Si fus perro tu edad seria de:");

        ImageView dogImage = findViewById(R.id.dog_image);
        dogImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog));

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String ageString = ageEditText.getText().toString();
                    int ageInt = Integer.parseInt(ageString);
                    answerText.setText("Si fueras un perro, tu edad sería de: " + ( ageInt * 6 ) + " años");

                } catch (NumberFormatException e) {
                    toast.makeText(MainActivity.this, "Escribe un número válido", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
