package anderson.favoritescripture;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String scripture = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(scripture);

        // Make sure the message is being received
        Log.d(getClass().getName(), "Received intent with " + scripture);

        ViewGroup layout =  (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }

    protected void onSaveScripture(View theButton) {
        SharedPreferences sharedPrefs = getSharedPreferences(MainActivity.APP_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();
        //Intent intent = getIntent();
        //String scripture = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //editor.putString("The scripture ", scripture);
        //editor.apply();
        Toast.makeText(this, "Scripture has been saved.", Toast.LENGTH_SHORT).show();



    }



}

