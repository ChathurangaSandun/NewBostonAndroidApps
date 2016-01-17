package com.clivekumara.thenewbostonexample2splash;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by chathuranga on 1/18/2016.
 */
public class Menu extends ListActivity {


    String classes[] = {"MainActivity","TextPlayActivity"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes)); // string class eke thiyana string value tika adapter ekak magin simple list ekakta st kaanwa. eka click kalahama ena action eka ganna onListItemClick() eka pawichchi karnawa.

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // int position returns the clicked position. get it's class
        String clickedClassName  = classes[position];

        try {
            Class listClass = Class.forName("com.clivekumara.thenewbostonexample2splash."+clickedClassName);
            Intent intent = new Intent(this,listClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
