package android.line.com.myfirstapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* The progress of loading UI element to screen */

        /*
        Load UI element from res folder to screen
        setContentView(R.layout.activity_main);
        Create a whole new View object
        Load your view object to screen
        */

        /*
        Load UI element from dynamic code
        */
        View contentView;
        TextView textView;
        textView = new TextView(this);
        textView.setTextColor(Color.RED);
        textView.setTextSize(45);
        textView.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        /*Create a CharSequence*/
        final CharSequence charSequence = CharSequence.class.cast("Hello world!");
        textView.setText(charSequence);
        contentView = textView;

        /* Set the textView you created to screen */
        setContentView(contentView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
