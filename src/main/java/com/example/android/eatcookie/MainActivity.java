package com.example.android.eatcookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Boolean plateHasCookie = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View view){
        TextView cookieText = (TextView) findViewById(R.id.cookie_text_view);
        if(plateHasCookie){
            eatCookieDisplay();
            eatCookieButtonText();
            cookieText.setText("I'm so full!");
            plateHasCookie = false;}
        else{
            cookieText.setText("I'm so hungry!");
            getCookieDisplay();
            getCookieButton();
            plateHasCookie = true;
        }
    }

    private void eatCookieDisplay(){
        ImageView cookieEater = (ImageView) findViewById(R.id.cookie_image_view);
        cookieEater.setImageResource(R.drawable.after_cookie);
    }

    private void eatCookieButtonText(){
        Button cookieButton = (Button) findViewById(R.id.cookie_button_view);
        cookieButton.setText("Get Cookie");
    }

    private void getCookieDisplay(){
        ImageView cookieEater = (ImageView) findViewById(R.id.cookie_image_view);
        cookieEater.setImageResource(R.drawable.before_cookie);
    }

    private void getCookieButton(){
        Button cookieButton = (Button) findViewById(R.id.cookie_button_view);
        cookieButton.setText("Eat Cookie");
    }
}
