package com.example.cesar.canina;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerText = findViewById(R.id.answer_text);
        final EditText ageEditText = findViewById(R.id.age_edit_text);
        answerText.setText(R.string.answer_text);

        ImageView dogImage = findViewById(R.id.dog_image);
        dogImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dog));

        Log.d(TAG, "La app fue creada");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageString = ageEditText.getText().toString();

                try {
                    int ageInt = Integer.parseInt(ageString);
                    Log.i(TAG, "Se insertó un número entero");
                    answerText.setText(String.format(getString(R.string.answer_text), (ageInt * 6)));


                } catch (NumberFormatException e) {
                    toast.makeText(MainActivity.this, R.string.error_text, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "No se insertó un entero");
                }

            }
        });
    }
}
