package com.example.barameek.intentsample_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Created by BarameeK on 15/6/2558.
 */
public class Second extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        Button button = (Button)findViewById(R.id.buttonFirst);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // should use finish() and go back to first Activity
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                //finish();
            }
        });
    }
}
