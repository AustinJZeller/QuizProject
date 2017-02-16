package com.austinzeller.quizproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.austinzeller.quizproject.R.id.question2answer2;
import static com.austinzeller.quizproject.R.id.question2answer3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void submitScore(View view) {

        findViewById(R.id.submitScore);


        int quizScore = 0;


        RadioButton question1selected = (RadioButton) findViewById(R.id.question3answer3);
        RadioButton question3selected = (RadioButton) findViewById(R.id.question3answer1);
        TextView question7answered = (TextView) findViewById(R.id.question4answer);
        CheckBox question8answer1selected = (CheckBox) findViewById(R.id.question2answer1);
        CheckBox question8answer2selected = (CheckBox) findViewById(question2answer2);
        CheckBox question8answer3selected = (CheckBox) findViewById(question2answer3);
        CheckBox question8answer4selected = (CheckBox) findViewById(R.id.questions2answer4);
        CheckBox question8answer5selected = (CheckBox) findViewById(R.id.question2answer5);


        if (question1selected.isChecked()) {
            quizScore = quizScore + 20;
        }

        if (question3selected.isChecked()) {
            quizScore = quizScore + 20;
        }

        if (question7answered.getText().toString().toLowerCase().equals("Basketball")) {
            quizScore = quizScore + 20;
        }

        if (question8answer1selected.isChecked() && question8answer2selected.isChecked() && question8answer5selected.isChecked() && !question8answer3selected.isChecked() && !question8answer4selected.isChecked()) {
            quizScore = quizScore + 20;
        }


        Context context = getApplicationContext();
        CharSequence text = "You scored " + Integer.toString(quizScore) + "% correct";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);


        if (question7answered.getText().toString().equals("")){
            text = "Please answer Question 2";
            toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            toast.show();
        }

    }
}
