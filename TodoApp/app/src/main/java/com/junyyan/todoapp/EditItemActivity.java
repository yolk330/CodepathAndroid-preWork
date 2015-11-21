package com.junyyan.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditItem;
    String updated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        etEditItem = (EditText)findViewById(R.id.etEditItem);
        String itemName = getIntent().getStringExtra("item");
        etEditItem.setText(itemName);
        etEditItem.setSelection(itemName.length());
        //etEditItem.setText(itemName);

        /* romove the default email button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

    }


    public void onSubmit(View view) {
        updated = etEditItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("test", "test");
        data.putExtra("updateItem", updated);
        data.putExtra("code", 200);
        setResult(RESULT_OK, data);
        //Toast.makeText(this, updated, Toast.LENGTH_SHORT).show();
        finish();
    }


}
