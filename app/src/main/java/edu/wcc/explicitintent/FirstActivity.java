package edu.wcc.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    public static final String KEY_SECONDACTIVITY_USERNAME="username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button firstButton=(Button)findViewById(R.id.firstActivty_button);
        firstButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent secondActivityStarter=new Intent(view.getContext(), SecondActivity.class);
                EditText myText=(EditText)findViewById(R.id.firstActivity_et_username);

                secondActivityStarter.putExtra( KEY_SECONDACTIVITY_USERNAME, myText.getText().toString() );
                startActivity(secondActivityStarter);
            }
        });
    }
}
