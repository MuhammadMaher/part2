package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView textViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        textViewText=findViewById(R.id.tv_text);
        //   استقبل داتا من variable واحد
        String text =getIntent().getStringExtra(Intent.EXTRA_TEXT);
        textViewText.setText(text);

        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if (Intent.ACTION_SEND.equals(action) && type != null) {
            if ("text/plain".equals(type)) {
                //   handleSendText(intent); // Handle text being sent
                String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);

            }
        }

    }
}