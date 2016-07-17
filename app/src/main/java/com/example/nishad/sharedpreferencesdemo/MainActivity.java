package com.example.nishad.sharedpreferencesdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOutputText;
    EditText etInputText;
    Button btnSave;
    Button btnRetrieve;
    Preferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutputText = (TextView) findViewById(R.id.tvOutputText);
        etInputText = (EditText) findViewById(R.id.etInputText);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnRetrieve = (Button) findViewById(R.id.btnRetrieve);
        preferences = new Preferences(this);
    }

    public void save(View view) {
        String inputData = etInputText.getText().toString();
        preferences.saveData(inputData);
        etInputText.setText("");
    }

    public void retrieve(View view) {
        String outputData = preferences.retrieveData();
        tvOutputText.setText(outputData);
    }

}
