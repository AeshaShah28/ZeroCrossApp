package com.example.zerocross;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    String data = "hello";
    TextView first, second;
    pref p;
    String data1 = "hello1";

    int chance=0;

    Button btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22,reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        first = (TextView) findViewById(R.id.player1);
        second = (TextView) findViewById(R.id.player2);

        btn00 = (Button) findViewById(R.id.button_00);

        btn01 = (Button) findViewById(R.id.button_01);

        btn02 = (Button) findViewById(R.id.button_02);

        btn10 = (Button) findViewById(R.id.button_10);

        btn11 = (Button) findViewById(R.id.button_11);

        btn12 = (Button) findViewById(R.id.button_12);

        btn20 = (Button) findViewById(R.id.button_20);

        btn21 = (Button) findViewById(R.id.button_21);

        btn22 = (Button) findViewById(R.id.button_22);

        reset = (Button) findViewById(R.id.btnreset);


        btn00.setOnClickListener(this);

        btn01.setOnClickListener(this);

        btn02.setOnClickListener(this);

        btn10.setOnClickListener(this);

        btn11.setOnClickListener(this);

        btn12.setOnClickListener(this);

        btn20.setOnClickListener(this);

        btn21.setOnClickListener(this);

        btn22.setOnClickListener(this);

        reset.setOnClickListener(this);
        Display();
    }




    @Override
    public void onClick(View v)
    {


        switch(v.getId()){

            case R.id.button_00:

                if(btn00.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn00.setText("O");


                        result();

                    }

                    else{

                        chance=0;

                        btn00.setText("X");

                        result();

                    }

                }

                break;

            case R.id.button_01:

                if(btn01.getText().toString().equals("")){

                    if(chance==0){


                        chance=1;

                        btn01.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn01.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_02:

                if(btn02.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn02.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn02.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_10:

                if(btn10.getText().toString().equals("")){

                    if(chance==0){
                        chance=1;

                        btn10.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn10.setText("X");

                        result();

                    }

                }

                break;


            case R.id.button_11:

                if(btn11.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn11.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn11.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_12:

                if(btn12.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn12.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn12.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_20:

                if(btn20.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn20.setText("O");

                        result();


                    }

                    else{

                        chance=0;

                        btn20.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_21:

                if(btn21.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn21.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn21.setText("X");

                        result();

                    }

                }


                break;

            case R.id.button_22:

                if(btn22.getText().toString().equals("")){

                    if(chance==0){

                        chance=1;

                        btn22.setText("O");

                        result();

                    }

                    else{

                        chance=0;

                        btn22.setText("X");

                        result();

                    }

                }

                break;

            case R.id.btnreset:

                btn00.setText("");

                btn01.setText("");

                btn02.setText("");

                btn10.setText("");

                btn11.setText("");

                btn12.setText("");

                btn20.setText("");

                btn21.setText("");

                btn22.setText("");



        }

    }


    public void result(){

        if(btn00.getText().toString().equals("X") && btn01.getText().toString().equals("X") && btn02.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

        else if(btn10.getText().toString().equals("X") && btn11.getText().toString().equals("X") && btn12.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn20.getText().toString().equals("X") && btn21.getText().toString().equals("X") && btn22.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn00.getText().toString().equals("O") && btn01.getText().toString().equals("O") && btn02.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

        else if(btn10.getText().toString().equals("O") && btn11.getText().toString().equals("O") && btn12.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn20.getText().toString().equals("O") && btn21.getText().toString().equals("O") && btn22.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }




        else  if(btn00.getText().toString().equals("X") && btn10.getText().toString().equals("X") && btn21.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

        else if(btn01.getText().toString().equals("X") && btn11.getText().toString().equals("X") && btn21.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn02.getText().toString().equals("X") && btn12.getText().toString().equals("X") && btn22.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn00.getText().toString().equals("O") && btn10.getText().toString().equals("O") && btn20.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

        else if(btn01.getText().toString().equals("O") && btn11.getText().toString().equals("O") && btn21.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn02.getText().toString().equals("O") && btn12.getText().toString().equals("O") && btn22.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }



        else if(btn00.getText().toString().equals("X") && btn11.getText().toString().equals("X") && btn22.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn02.getText().toString().equals("X") && btn11.getText().toString().equals("X") && btn20.getText().toString().equals("X")){

            Toast.makeText(this, "Player X wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }


        else if(btn00.getText().toString().equals("O") && btn11.getText().toString().equals("O") && btn22.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

        else if(btn02.getText().toString().equals("O") && btn11.getText().toString().equals("O") && btn20.getText().toString().equals("O")){

            Toast.makeText(this, "Player O wins", Toast.LENGTH_SHORT).show();

            reset.callOnClick();

        }

    }
    public void Display()
    {   p = new pref(this);
        String s = p.getkeyvalue(data);
        String s1 = p.getkeyvalue(data1);
        first.setText(s);
        second.setText(s1);
    }

}

