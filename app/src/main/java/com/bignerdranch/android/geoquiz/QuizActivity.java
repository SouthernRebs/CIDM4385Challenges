package com.bignerdranch.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mPreviousButton;
    private Button mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(QuizActivity.this,R.string.correct_toast,Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(QuizActivity.this,R.string.incorrect_toast,Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(QuizActivity.this,R.string.next_toast,Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        mPreviousButton = (Button) findViewById(R.id.previous_button);
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(QuizActivity.this,R.string.previous_toast,Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });
    }
}
