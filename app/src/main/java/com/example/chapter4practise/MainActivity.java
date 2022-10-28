package com.example.chapter4practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] questions = {"Bill Gates is the founder of Amazon?", "There are 9 planets in our solar system", "Java was created using Python?", "The capital of Australia is Sydney.", "There are 7 continents in the world", "The World War II began in 1939 when Germany invaded Poland."};
    private boolean [] answers = {false, false, false, false, true, true};
    private int score = 0;
    private int index = 0;
    TextView question;
    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length - 1){
                    if (answers[index] == true){
                        score++;
                    }
                    index++;
                    if (index<=questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length - 1){
                    if (answers[index] == false){
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}