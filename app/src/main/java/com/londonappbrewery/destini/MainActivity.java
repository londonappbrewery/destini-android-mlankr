package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mbuttonTop;
    Button mbuttonBottom;
    TextView mstoryTextView;

    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mbuttonTop = findViewById(R.id.buttonTop);
        mbuttonBottom = findViewById(R.id.buttonBottom);
        mstoryTextView = findViewById(R.id.storyTextView);

        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 && (mstoryTextView.getText() == getResources().getString(R.string.T1_Story))) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                } else if (mStoryIndex == 2 && (mstoryTextView.getText() == getResources().getString(R.string.T2_Story))) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex++;
                } else {
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 && (mstoryTextView.getText() == getResources().getString(R.string.T1_Story))) {
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                } else if (mStoryIndex == 2 && (mstoryTextView.getText() == getResources().getString(R.string.T2_Story))) {
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                } else {
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}
