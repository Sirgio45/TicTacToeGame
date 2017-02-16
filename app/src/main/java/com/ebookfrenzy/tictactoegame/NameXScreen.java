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
    Intent goingBack;
    String userNameForX;
    String userNameForY;
    EditText xuserName;
    EditText yuserName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.namex_layout);

        goingBack = new Intent();

       // String PreviousActivity= activityThatCalled.getExtras().getString("CallingActivity");




    }

    public void onSendXName (View view)
    {
       xuserName = (EditText)findViewById(R.id.editTextEnterXName);
       yuserName = (EditText)findViewById(R.id.editTextEnterYName);

       userNameForX = String.valueOf(xuserName.getText());
        userNameForY = String.valueOf(yuserName.getText());

        Intent goingBack = new Intent();
      // Intent goingBackAgain= new Intent();

        goingBack.putExtra("UserNameForX", String.valueOf(userNameForX));
        goingBack.putExtra("UserNameForY", String.valueOf(userNameForY));
        setResult(RESULT_OK,goingBack);
        finish();

    }

}
