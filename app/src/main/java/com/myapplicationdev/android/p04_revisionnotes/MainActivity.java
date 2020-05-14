package com.myapplicationdev.android.p04_revisionnotes;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etNote;
    TextView tvViewNote, tvViewStars;
    RadioGroup rg;
    RadioButton rbStars;
    Button btnInsert, btnShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNote = findViewById(R.id.editTextNote);
        tvViewNote = findViewById(R.id.textViewNote);
        tvViewStars = findViewById(R.id.textView2);
        rg = findViewById(R.id.radioGroupStars);
        rbStars = findViewById(R.id.radio1);
        rbStars = findViewById(R.id.radio2);
        rbStars = findViewById(R.id.radio3);
        rbStars = findViewById(R.id.radio4);
        rbStars = findViewById(R.id.radio5);
        btnInsert = findViewById(R.id.buttonInsertNote);
        btnShowList = findViewById(R.id.buttonShowList);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the DBHelper object, passing in the
                // activity's Context
                DBHelper db = new DBHelper(MainActivity.this);

                // Insert a task
                String text = etNote.getText().toString();
                Toast.makeText(MainActivity.this, "Inserted",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the DBHelper object, passing in the
                // activity's Context
                DBHelper db = new DBHelper(MainActivity.this);

                // Insert a task
                ArrayList<String> data = db.getNoteContent();
                db.close();



            }
        });
    }
}
