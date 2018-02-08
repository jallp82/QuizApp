package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Button call to check answers
     */
    public void checkAnswers(View view) {
        /**
         * Sets score to 0 if you try again
         */
        if (score > 0) {
            score = 0;
        }
        /**
         * Checks the first question answer which is "Lincoln"
         */
        EditText questionOneAnswer = findViewById(R.id.question_one);
        String answerQuestionOne = questionOneAnswer.getText().toString();
        if (answerQuestionOne.equals("Lincoln")) {
            score = score + 1;
        }
        /**
         * Check the second question answer = March 1, 1967
         */
        RadioButton yearFoundedQuestion = findViewById(R.id.question_2_a2);
        boolean yearFoundedQuestionChecked = yearFoundedQuestion.isChecked();
        if (yearFoundedQuestionChecked) {
            score = score + 1;
        }
        /**
         * Check the third question answer = Marlon Brando and Fred Astaire
         */
        CheckBox marlonBrando = findViewById(R.id.marlon_brando);
        boolean isMarlonBrando = marlonBrando.isChecked();
        CheckBox fredAstaire = findViewById(R.id.fred_astaire);
        boolean isFredAstaire = fredAstaire.isChecked();
        if (isMarlonBrando) {
            if (isFredAstaire) {
                score = score + 1;
            }
        }
        /**
         * Check the fourth question answer = False
         */
        RadioButton numberFounded = findViewById(R.id.question_4_a2);
        boolean numberFoundedChecked = numberFounded.isChecked();
        if (numberFoundedChecked) {
            score = score + 1;
        }
        /**
         * Check the fifth question answer = McRib and Kool-Aid
         */
        CheckBox mcrib = findViewById(R.id.mcrib);
        boolean mcribChecked = mcrib.isChecked();
        CheckBox koolAid = findViewById(R.id.kool_aid);
        boolean koolAidChecked = koolAid.isChecked();
        if (mcribChecked) {
            if (koolAidChecked) {
                score = score + 1;
            }
        }
        Toast.makeText(this, "You scored " + score + " out of 5!", Toast.LENGTH_LONG).show();

    }


}
