package com.example.nishad.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Nishad on 14-Jul-16.
 */
public class Preferences {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public Preferences(Context context) {
        sharedPreferences = context.getSharedPreferences("Names", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveData(String data) {
        editor.putString("name1", data);
        editor.commit();
    }

    public String retrieveData() {
        String data = sharedPreferences.getString("name1", "No data found!");
        return data;
    }

}
