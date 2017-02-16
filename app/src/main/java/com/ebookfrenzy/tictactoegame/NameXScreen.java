package com.ebookfrenzy.tictactoegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by sergio on 2/14/2017.
 */

public class NameXScreen extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.namex_layout);

        Intent activityThatCalled = getIntent();

       // String PreviousActivity= activityThatCalled.getExtras().getString("CallingActivity");




    }

    public void onSendXName (View view)
    {
        EditText xuserName = (EditText)findViewById(R.id.editTextEnterXName);
        EditText yuserName = (EditText)findViewById(R.id.editTextEnterYName);

        String userNameForX = String.valueOf(xuserName.getText());
        String userNameForY = String.valueOf(yuserName.getText());

        Intent goingBack = new Intent(userNameForX + userNameForY);
      // Intent goingBackAgain= new Intent();

        goingBack.putExtra("UserNameForX",userNameForX);
        goingBack.putExtra("UserNameForY", userNameForY);

        finish();

    }

}
