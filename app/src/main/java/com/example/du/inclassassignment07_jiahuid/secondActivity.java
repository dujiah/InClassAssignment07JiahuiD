package com.example.du.inclassassignment07_jiahuid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {
    private EditText animalName;
    private String name;
    private EditText numberOfLegs;
    private int legs;
    private EditText moreInformation;
    private String information;
    private CheckBox furOrNot;
    private boolean hasFur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // and a boolean for the CheckBox
        furOrNot = findViewById(R.id.text_fur);
        animalName = findViewById(R.id.text_name);
        numberOfLegs = findViewById(R.id.text_legs);
        moreInformation = findViewById(R.id.text_information);
        setTitle("Add Animal");
    }

    public void addAnimal(View view) {
        name = animalName.getText().toString();
        legs = Integer.parseInt(numberOfLegs.getText().toString());
        information = moreInformation.getText().toString();
        hasFur = furOrNot.isChecked();

        Animal animals = new Animal(name, legs, hasFur, information);
        Intent animalIntent = new Intent(this, MainActivity.class);
        animalIntent.putExtra(Keys.ANIMAL, animals);
        setResult(RESULT_OK, animalIntent);
        finish();
    }


}

