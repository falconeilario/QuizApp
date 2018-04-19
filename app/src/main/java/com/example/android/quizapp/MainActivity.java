package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateCorrectAnswers() {
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer1radio1);
        boolean isAnswer1radio1 = answer1.isChecked();
        if (isAnswer1radio1) {
            correctAnswers += 1;
        }
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer2radio2);
        boolean isAnswer2radio2 = answer2.isChecked();
        if (isAnswer2radio2) {
            correctAnswers += 1;
        }
        EditText answer3 = (EditText) findViewById(R.id.answer3editText);
        String ans3 = answer3.getText().toString();
        boolean isAnswer3editText = ans3.contains("peregrine falcon");
        if (isAnswer3editText) {
            correctAnswers += 1;
        }
        RadioButton answer4 = (RadioButton) findViewById(R.id.answer4radio2);
        boolean isAnswer4radio2 = answer4.isChecked();
        if (isAnswer4radio2) {
            correctAnswers += 1;
        }
        EditText answer5 = (EditText) findViewById(R.id.answer5editText);
        String ans5 = answer5.getText().toString();
        boolean isAnswer5editText = ans5.equalsIgnoreCase("one") || ans5.equalsIgnoreCase("1");
        if (isAnswer5editText) {
            correctAnswers += 1;
        }
        CheckBox answer6check1 = (CheckBox) findViewById(R.id.answer6check1);
        boolean isAnswer6check1 = answer6check1.isChecked();
        CheckBox answer6check2 = (CheckBox) findViewById(R.id.answer6check2);
        boolean isAnswer6check2 = answer6check2.isChecked();
        CheckBox answer6check3 = (CheckBox) findViewById(R.id.answer6check3);
        boolean isAnswer6check3 = answer6check3.isChecked();
        boolean isAnswer6 = isAnswer6check1 && isAnswer6check2 && !isAnswer6check3;
        if (isAnswer6) {
            correctAnswers += 1;
        }

        RadioButton answer7 = (RadioButton) findViewById(R.id.answer7radio2);
        boolean isAnswer7radio2 = answer7.isChecked();
        if (isAnswer7radio2) {
            correctAnswers += 1;
        }
    }

    public void resetNumber() {
        correctAnswers = 0;
    }

    public void showFinalResult(View view) {
        calculateCorrectAnswers();
        if (correctAnswers == 7) {
            Toast.makeText(this, correctAnswers + " correct answers! Congratulations!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Just " + correctAnswers + " correct answers. Try again!", Toast.LENGTH_LONG).show();
        }
        resetNumber();
    }
}
