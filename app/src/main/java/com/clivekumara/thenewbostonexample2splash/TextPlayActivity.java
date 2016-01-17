package com.clivekumara.thenewbostonexample2splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlayActivity extends AppCompatActivity implements View.OnClickListener{

    Button btTry;
    ToggleButton tbPassword;
    EditText etCommand;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_play);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initComponents();
    }

    private void initComponents() {
        btTry = (Button) findViewById(R.id.btResult);
        tbPassword = (ToggleButton) findViewById(R.id.tbPassword);
        etCommand = (EditText) findViewById(R.id.etCommand);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btTry.setOnClickListener(this);
        tbPassword.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btResult:
                break;

            case R.id.tbPassword:
                if(tbPassword.isChecked()){
                    etCommand.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_NUMBER_VARIATION_PASSWORD );
                }else{
                    etCommand.setInputType(InputType.TYPE_CLASS_TEXT );
                }

                break;
        }
    }
}
