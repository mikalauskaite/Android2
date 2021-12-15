package com.example.android2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText et;
    private TextView tv;
    private Spinner sp;
    private calculations c = new calculations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        et.setText("");
        //Spinner
        sp = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

        tv = findViewById(R.id.textView);
        tv.setText(getString(R.string.TextViewText));
        btn = findViewById(R.id.startButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et.getText().toString();
                if(input.equals("")){
                    tv.setText(getString(R.string.TextViewErrorText));
                    tv.setTextColor(Color.RED);
                    Toast.makeText(MainActivity.this,getString(R.string.TextViewErrorText), Toast.LENGTH_LONG).show();

                }
                else{
                    if(sp.getSelectedItem().toString().equals("Žodžiai")) {
                        int count = c.WordCounter(input);
                        tv.setText(MessageFormat.format("{0} {1}", count, getString(R.string.Žodžiai)));
                        tv.setTextColor(Color.GREEN);
                    }
                    else{
                        int count = c.SymbolCounter(input);
                        tv.setText(MessageFormat.format("{0} {1}", count, getString(R.string.Ženklai)));
                        tv.setTextColor(Color.BLUE);
                    }
                }
            }
        });
    }
}