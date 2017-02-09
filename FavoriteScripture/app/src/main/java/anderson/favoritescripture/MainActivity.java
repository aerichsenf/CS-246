package anderson.favoritescripture;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "anderson.favoritescripture.MESSAGE";
    public static final String APP_PREFS = "APPLICATION_PREFERENCES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editBook = (EditText) findViewById(R.id.bookText);
        EditText editChapter = (EditText) findViewById(R.id.chapterText);
        EditText editVerse = (EditText) findViewById(R.id.verseText);
        String scripture = editBook.getText().toString() + " "
               + editChapter.getText().toString() +":"
                + editVerse.getText().toString();

        // Sending the message to the other intent
        Log.d(getClass().getName(), "About to create intent with " + scripture);

        intent.putExtra(EXTRA_MESSAGE, scripture);
        startActivity(intent);
    }

    public void onLoadScripture(View theButton) {

        //SharedPreferences sharedPref = getSharedPreferences(APP_PREFS, Context.MODE_PRIVATE);
        Toast.makeText(this, "Loaded scripture", Toast.LENGTH_SHORT).show();

    }





}
