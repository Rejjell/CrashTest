package com.example.rummezheni.crashtest;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //String str = "PreDownloadMessage ^The device shall display the text in the Download Descriptor ^Pre Download Message Attribute. ^^If the description field text does not fit on the display, the description field shall be scrollable to allow viewing of all of the text.^^ &#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working&#13;check to see if scrolling is working";
        EditText edit = (EditText) findViewById(R.id.edit);
//        String str = "&quot;Hi &lt;username&gt;&#13;And here is a new string&quot;";
        String str = " Ololo4^h&#13;New ^list ^another &#13;^^ list ^item^^"
                .replace("&#13;","<br />")
                .replace("^^","&bull;")
                .replace("^","&bull;");
        String res;
        res = Html.fromHtml(str).toString();

        edit.append(res);


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
