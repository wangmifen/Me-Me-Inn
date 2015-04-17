package com.android.memeinn.postquestion;

/**
 * Created by qingsongqi on 4/17/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.memeinn.learn.ChapterActivity;
import com.android.memeinn.R;
import com.android.memeinn.learn.MemorizationActivity;
import com.android.memeinn.learn.QuizActivity;
import com.android.memeinn.review.ReviewActivity;

public class ShowUserQuiz extends Activity{

    public static final String EXTRA_MESSAGE = "vocab.MESSAGE";
    //public int flag;//0 for review mode, 1 for learning mode

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usercreatedquizlist);
        Intent intent = getIntent();

    }

    public void gotoChapOrReview(View view) {
        Intent goToUserQuiz = new Intent(this, UserQuiz.class);
        String vocabType = ((Button) /*findViewById(R.id.gre)*/view).getText().toString();
        Log.d("MyApp", "VocabType" + vocabType);
        goToUserQuiz.putExtra(EXTRA_MESSAGE, vocabType);
        startActivity(goToUserQuiz);
    }
}
