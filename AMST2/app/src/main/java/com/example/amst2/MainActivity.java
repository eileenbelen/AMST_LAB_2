package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.getbase.floatingactionbutton.FloatingActionButton;
import android.content.Intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionsMenu menu_flotante = findViewById(R.id.fab_menu);

        FloatingActionButton calendario = findViewById(R.id.fab_calendar);
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), Calendar_view.class);
                startActivityForResult(intent, 0);
            }
        });

    }

    public void showMap(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}