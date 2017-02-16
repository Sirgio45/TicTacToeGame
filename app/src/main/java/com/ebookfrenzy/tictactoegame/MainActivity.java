package com.ebookfrenzy.tictactoegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int turn = 1;


    Button One;//Button
    Button Two; //Button
    Button Three;//Button
    Button Four;//Button
    Button Five;//Button
    Button Six;//Button
    Button Seven;//Button
    Button Eight;//Button
    Button Nine;//Button
    Button NewGameButton; //removes the x and o and starts a new game

    TextView GameMessage; //shows the message if x or o wins and the name of the players


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        One = (Button) findViewById(R.id.buttonOne);//assigns the button
        Two = (Button) findViewById(R.id.buttonTwo);//assigns the button
        Three = (Button) findViewById(R.id.buttonThree);//assigns the button
        Four = (Button) findViewById(R.id.buttonFour);//assigns the button
        Five = (Button) findViewById(R.id.buttonFive);//assigns the button
        Six = (Button) findViewById(R.id.buttonSix);//assigns the button
        Seven = (Button) findViewById(R.id.buttonSeven);//assigns the button
        Eight = (Button) findViewById(R.id.buttonEight);//assigns the button
        Nine = (Button) findViewById(R.id.buttonNine);//assigns the button

        GameMessage = (TextView) findViewById(R.id.textViewGameProgress); //assigns the message

        NewGameButton = (Button) findViewById(R.id.buttonNewGame); //assigns the new button


        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                if (One.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        One.setText("X");
                        One.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        One.setText("O");
                        One.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Two.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Two.setText("X");
                        Two.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Two.setText("O");
                        Two.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Three.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Three.setText("X");
                        Three.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Three.setText("O");
                        Three.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Four.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Four.setText("X");
                        Four.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Four.setText("O");
                        Four.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Five.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Five.setText("X");
                        Five.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Five.setText("O");
                        Five.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Six.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Six.setText("X");
                        Six.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Six.setText("O");
                        Six.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Seven.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Seven.setText("X");
                        Seven.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Seven.setText("O");
                        Seven.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Eight.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Eight.setText("X");
                        Eight.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Eight.setText("O");
                        Eight.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nine.getText().toString().equals("")) {
                    if (turn == 1) {


                        turn = 2;
                        Nine.setText("X");
                        Nine.setEnabled(false);
                    } else if (turn == 2) {
                        turn = 1;
                        Nine.setText("O");
                        Nine.setEnabled(false);
                    }

                }
                endGame();
            }
        });

        NewGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newGame();

            }
        });
    }

    public void newGame() {


        One.setEnabled(true);
        Two.setEnabled(true);
        Three.setEnabled(true);
        Four.setEnabled(true);
        Five.setEnabled(true);
        Six.setEnabled(true);
        Seven.setEnabled(true);
        Eight.setEnabled(true);
        Nine.setEnabled(true);

        One.setText("");
        Two.setText("");
        Three.setText("");
        Four.setText("");
        Five.setText("");
        Six.setText("");
        Seven.setText("");
        Eight.setText("");
        Nine.setText("");

        GameMessage.setText("");
    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = One.getText().toString();
        b = Two.getText().toString();
        c = Three.getText().toString();
        d = Four.getText().toString();
        e = Five.getText().toString();
        f = Six.getText().toString();
        g = Seven.getText().toString();
        h = Eight.getText().toString();
        i = Nine.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;


        }


        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }

        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            GameMessage.setText("Winner Player X");
            end = true;
        }

        /////////////////////////////////////////////
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }

        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }

        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            GameMessage.setText("Winner Player O");
            end = true;
        }
          /*  else if (end == false)
            {
                GameMessage.setText("IT'S A TIE!");
                end=true;
            }*/


        if (end) {
            One.setEnabled(false);
            Two.setEnabled(false);
            Three.setEnabled(false);
            Four.setEnabled(false);
            Five.setEnabled(false);
            Six.setEnabled(false);
            Seven.setEnabled(false);
            Eight.setEnabled(false);
            Nine.setEnabled(false);
            /*if (end == false)
            {
                GameMessage.setText("Its a tie");
            }*/
        }
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
        if (id == R.id.nameForX)
        {


            Intent getNameScreen = new Intent(this, NameXScreen.class);

            startActivity(getNameScreen);



            return true;

        }



        if (id == R.id.closeGameSetting)
        {
            this.finish();
            return true;
        }

        if (id==R.id.action_settings)
        {
            newGame();
            return true;
        }




        return super.onOptionsItemSelected(item);




    }
}
