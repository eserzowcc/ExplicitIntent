package edu.wcc.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras=getIntent().getExtras();
        if( extras != null ) {
            String nameString=extras.getString(FirstActivity.KEY_SECONDACTIVITY_USERNAME);
            TextView myView=(TextView)findViewById(R.id.second_activity_tv_username);
            myView.setText(nameString);
        }
    }
}
