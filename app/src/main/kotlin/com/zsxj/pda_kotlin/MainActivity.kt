package com.zsxj.pda_kotlin

import kotlinx.android.synthetic.activity_main.text

public class MainActivity : android.support.v7.app.ActionBarActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText("Synthetic")
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.zsxj.pda_kotlin.R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.getItemId()

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item)
    }
}