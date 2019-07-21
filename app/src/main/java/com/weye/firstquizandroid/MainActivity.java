package com.weye.firstquizandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView);
        //get string from each version (QA and production) after create folders: QA and production with different strings
        textView.setText(R.string.text);
    }

    //method 2: using string of BuildConfig
//    private String getTextFromBuildConfig(){
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(BuildConfig.text);
//        return stringBuffer.toString();
//    }
}
