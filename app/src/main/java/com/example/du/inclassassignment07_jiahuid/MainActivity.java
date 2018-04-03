package com.example.du.inclassassignment07_jiahuid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public boolean first = true;
    private TextView displayText;
    private String display;
    private String name;
    private int legs;
    private boolean hasFur;
    private String information;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = findViewById(R.id.display_text);

        Intent aIntent = getIntent();
        Animal animals = (Animal) aIntent.getSerializableExtra(Keys.ANIMAL);

    }

    public void addAnimal(View view) {
        Intent intent = new Intent(this, secondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_ANIMAL);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_ANIMAL && resultCode == RESULT_OK) {
            Animal animals = (Animal) data.getSerializableExtra(Keys.ANIMAL);
            //displayText.setText(animals.toString()) ;
            //displayText.append(display);
            display = display + animals.toString() + "\n";
            displayText.setText(display);
        }
    }
}
