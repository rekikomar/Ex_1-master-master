package com.iit.ex1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.iit.ex1.fragment.ControllerFragment;
import com.iit.ex1.fragment.MainFragment;


public class MainActivity extends ActionBarActivity implements ControllerFragment.OnControlListener {

    private MainFragment mMainFragment;
    private ControllerFragment mControllerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.main_fragment);
        mControllerFragment = (ControllerFragment)getSupportFragmentManager().findFragmentById(R.id.controller_fragment);
mControllerFragment.setOnControlListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onControlPerformed(int controlId) {
        mMainFragment.setComponent(controlId);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
