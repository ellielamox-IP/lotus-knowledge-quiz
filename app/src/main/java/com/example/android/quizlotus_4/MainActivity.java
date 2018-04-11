package com.example.android.quizlotus_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.android.quizlotus_4.QuestionActivity;
import com.example.android.quizlotus_4.R;

public class
MainActivity extends AppCompatActivity {

    EditText textName, textEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public String orderMessage() {

        textName = findViewById(R.id.editTextName);
        textEmail = findViewById(R.id.editTextEmail);


        String message = "";

        message = "Name: " + textName.getText();
        message += "\nEmail: " + textEmail.getText();

        return message;

    }


    public void submit(View view){
        TextView message = findViewById(R.id.textViewDisplay);
        message.setText(orderMessage());

        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra("NAME_VALUE", textName.getText().toString());
        startActivity(intent);

    }
}

