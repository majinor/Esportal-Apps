package com.majinor.esportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
    @Override
    public void onBackPressed()
    {
        finish();
        AboutActivity.this.overridePendingTransition(R.anim.faded_in,R.anim.faded_out);

    }
}
