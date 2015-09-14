package matcom.dcf.tstautocomplete;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    AutoCompleteTextView text;
    MultiAutoCompleteTextView text1;
    String[] social = {"Facebook ", "Twitter", "Google", "Pintrest"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        text1 = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);

         //myadapter = new MyAdapter(this,R.layout.customrow,social);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, social);

        text.setAdapter(adapter);
        text.setThreshold(1);

        text1.setAdapter(adapter);
        text1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
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
