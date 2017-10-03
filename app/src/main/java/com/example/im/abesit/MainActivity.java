package com.example.im.abesit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public void init(){
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy=new Intent(MainActivity.this,NetworkActivity.class);
                startActivity(toy);
            }
        });

    }

    public void init1(){
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent roy=new Intent(MainActivity.this,library.class);
                startActivity(roy);
            }
        });

    }
    public void init2(){
        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mood=new Intent(MainActivity.this,moodle.class);
                startActivity(mood);
            }
        });

    }
    public void init3() {
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(MainActivity.this, contact.class);
                startActivity(contact);
            }
        });
    }
    public void init4(){
        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent aboutus=new Intent(MainActivity.this,aboutus.class);
                startActivity(aboutus);
            }
        });

    }
    public void init5(){
        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this,academic.class);
                startActivity(i);
            }
        });

    }
    public void init6(){
        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ip=new Intent(MainActivity.this,placement.class);
                startActivity(ip);
            }
        });

    }
    public void init7(){
        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ipm=new Intent(MainActivity.this,campus.class);
                startActivity(ipm);
            }
        });

    }
    public void init8(){
        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent Koy=new Intent(MainActivity.this,maps.class);
                startActivity(Koy);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
    }

}
