package com.ninja.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    /*initializing the buttons , the activity was fixed on Portrait at the manifest file
    to prevent messing up the layout when the phone has been rotated*/

    Button btPopMov1, btPopMov2, btSuperDuo, btBuildB, btCapstone;

    //initialising the taost charSequence
    CharSequence toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning the buttons
        btPopMov1 = (Button) findViewById(R.id.popmov_1);
        btPopMov2 = (Button) findViewById(R.id.popmov_2);
        btSuperDuo = (Button) findViewById(R.id.super_duo);
        btBuildB = (Button) findViewById(R.id.buildb);
        btCapstone = (Button) findViewById(R.id.capstone);

        //creating listners to all the buttons
        btPopMov1.setOnClickListener(app);
        btPopMov2.setOnClickListener(app);
        btSuperDuo.setOnClickListener(app);
        btBuildB.setOnClickListener(app);
        btCapstone.setOnClickListener(app);

    }

    //switch to assign different toast message to each button
    View.OnClickListener app = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.popmov_1:
                    toastText = "This button will launch Popular Movies 1 App";
                    break;

                case R.id.popmov_2:
                    toastText = "This button will launch Popular Movies 2 App";
                    break;

                case R.id.super_duo:
                    toastText = "This button will launch Super Duo App";
                    break;

                case R.id.buildb:
                    toastText = "This button will launch Build it Bigger App";
                    break;

                case R.id.capstone:
                    toastText = "This button will launch Capstone App";
                    break;

            }
            //setting up the toast to show
            Context context = getApplicationContext();
            CharSequence text = toastText;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);

            toast.show(); // to show the toast
           // toast.cancel(); //to clear the previously displayed toast, ready to show the next

        }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

        // the following auto generated statement always came back with error, had to comment it out


   /* @Override
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
    }*/
};
}

