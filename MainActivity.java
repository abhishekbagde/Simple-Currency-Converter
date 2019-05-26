package com.abhi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    public void convertToEuro(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        Double dollarAmountDouble = Double.parseDouble(editText.getText().toString());
        Double euro = 0.89;
        Double euroAmount = dollarAmountDouble * euro ;
        Toast.makeText(MainActivity.this,"€" + String.format("%.2f" , euroAmount), Toast.LENGTH_LONG).show();
        Log.i("info",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
