package com.example.android.quizlotus_4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;


public class QuestionActivity extends AppCompatActivity {

    int point = 0;
    String message;
    CheckBox question2_a,question2_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

    }

    // Question 1

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.question1_a:
                if (checked) {
                    point = point + 1;
                    message = "1. Correct. Look for recipes. \n";
                }
                break;
            case R.id.question1_b:
                if (checked) {
                    point = point + 0;
                    message = "1. Try again.";
                }
                break;
        }
    }

    // Question 2

    public void onRadioButtonQuestion2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question2_a:
                if (checked) {
                    point = point + 1;
                    message = message + "2. Correct.\n";
                }
                break;
            case R.id.question2_b:
            case R.id.question2_c:
            case R.id.question2_d:
                if (checked) {
                    point = point + 0;
                    message = message + "2. Try again.\n";
                }
                break;
        }
    }

    // Question 3

    public void onRadioButtonQuestion3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question3_c:
                if (checked) {
                    point = point + 1;
                    message = message + "3. Yes, Vietnam and Sri Lanka also have the lotus as their national flower.\n";
                }
                break;
            case R.id.question3_a:
            case R.id.question3_b:
            case R.id.question3_d:
                if (checked) {
                    point = point + 0;
                    message = message + "3. Try again.\n";
                }
                break;
        }
    }


    // Question 4

    public void onRadioButtonQuestion4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question4_d:
                if (checked) {
                    point = point + 1;
                    message = message + "4. Correct!\n";
                }
                break;
            case R.id.question4_a:
            case R.id.question4_c:
            case R.id.question4_b:
                if (checked) {
                    point = point + 0;
                    message = message + "4. Try again.\n";
                }
                break;
        }
    }

    // Question 5

    public void onRadioButtonQuestion5(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question5_d:
                if (checked) {
                    point = point + 1;
                    message = message + "5. Yes, correct!\n";
                }
                break;
            case R.id.question5_a:
            case R.id.question5_c:
            case R.id.question5_b:
                if (checked) {
                    point = point + 0;
                    message = message + "5. Try again.\n";
                }
                break;
        }
    }

    public String orderingAnswer() {
        String pointsAndAnswer = getResources().getString(R.string.yourscore) +" "+  point + " " + getResources().getString(R.string.numberoutof);
        pointsAndAnswer += "\nAnswer:\n" + message;

        return pointsAndAnswer;
    }

    public void submitAnswers(View view) {

        Intent myIntent = getIntent();
        String nameValue = myIntent.getStringExtra("NAME_VALUE");

        String greeting = "Hello, " + nameValue;

        TextView textView = findViewById(R.id.textViewDataUser);
        textView.setText(greeting);


        TextView answers = findViewById(R.id.textViewDisplayAnswers);
        answers.setTextColor(Color.parseColor("#ffffff"));
        answers.setText(orderingAnswer());
    }


}