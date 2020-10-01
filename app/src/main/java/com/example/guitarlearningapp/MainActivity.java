package com.example.guitarlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //Button Intialization

    Button friends,countingstars,wakemeup,faded,closer,treatubetter,alonepart2,itsyou,despacito,loveyourself,perfect,canthelpfalling,senorita,greenday,numb,letmeloveyou,wedonttalk,believer,castle,makeitright,stiches,girlslikeyou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defineing each button

        friends = findViewById(R.id.friends);
        countingstars = findViewById(R.id.countingstars);
        wakemeup = findViewById(R.id.wakemeup);
        faded = findViewById(R.id.faded);
        closer = findViewById(R.id.closer);
        treatubetter = findViewById(R.id.treatubetter);
        alonepart2 = findViewById(R.id.alonepart2);
        itsyou = findViewById(R.id.itsyou);
        despacito = findViewById(R.id.despacito);
        loveyourself = findViewById(R.id.loveyourself);
        perfect = findViewById(R.id.perfect);
        canthelpfalling = findViewById(R.id.canthelpfalling);
        senorita = findViewById(R.id.senorita);
        greenday = findViewById(R.id.greenday);
        numb = findViewById(R.id.numb);
        letmeloveyou = findViewById(R.id.letmeloveyou);
        wedonttalk = findViewById(R.id.wedonttalk);
        believer = findViewById(R.id.believer);
        castle = findViewById(R.id.castle);
        makeitright = findViewById(R.id.makeitright);
        stiches = findViewById(R.id.stitches);
        girlslikeyou = findViewById(R.id.girlslikeu);

        //Opening Activity of Each Song

        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfriends();
            }
        });

        countingstars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencountingstars();
            }});

        wakemeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwakemeup();
            }});

        faded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfaded();
            }
        });

        closer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencloser();
            }
        });

        treatubetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentreatubetter();
            }
        });

        alonepart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalone2();
            }
        });

        itsyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openitsyou();
            }
        });

        despacito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendespacito();
            }
        });

        loveyourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloveurself();
            }
        });

        perfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openperfect();
            }
        });

        canthelpfalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencanthelp();
            }
        });

        senorita.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View v) {
                opensenorita();
            }
        });

        greenday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengreenday();
            }
        });

        numb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennumb();
            }
        });

        letmeloveyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openletmeloveyou();
            }
        });

        wedonttalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwedonttalk();
            }
        });

        believer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbeliever();
            }
        });

        castle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencastle();
            }
        });

        makeitright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmakeitright();
            }
        });

        stiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstiches();
            }
        });

        girlslikeyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengirlslikeyou();
            }
        });
    }
    public void openfriends()
    {
        Intent intent = new Intent(this, FriendsActivity.class);
        startActivity(intent);
    }
    public void opencountingstars()
    {
        Intent intent = new Intent(this, CountingstarsActivity.class);
        startActivity(intent);
    }
    public void openwakemeup()
    {
        Intent intent = new Intent(this, Wakemeup.class);
        startActivity(intent);
    }
    public void openfaded()
    {
        Intent intent = new Intent(this, Faded.class);
        startActivity(intent);
    }
    public void opencloser()
    {
        Intent intent = new Intent(this, Closer.class);
        startActivity(intent);
    }
    public void opentreatubetter()
    {
        Intent intent = new Intent(this, Treatubetter.class);
        startActivity(intent);
    }
    public void openalone2()
    {
        Intent intent = new Intent(this, Alonepart2.class);
        startActivity(intent);
    }
    public void openitsyou()
    {
        Intent intent = new Intent(this, Itsyou.class);
        startActivity(intent);
    }
    public void opendespacito()
    {
        Intent intent = new Intent(this, Despacito.class);
        startActivity(intent);
    }
    public void openloveurself()
    {
        Intent intent = new Intent(this, Loveyourself.class);
        startActivity(intent);
    }
    public void openperfect()
    {
        Intent intent = new Intent(this, Perfect.class);
        startActivity(intent);
    }
    public void opencanthelp()
    {
        Intent intent = new Intent(this, Canthelp.class);
        startActivity(intent);
    }
    public void opensenorita()
    {
        Intent intent = new Intent(this, Senorita.class);
        startActivity(intent);
    }
    public void opennumb()
    {
        Intent intent = new Intent(this, Numb.class);
        startActivity(intent);
    }
    public void openletmeloveyou()
    {
        Intent intent = new Intent(this, Letmeloveu.class);
        startActivity(intent);
    }public void openwedonttalk()
    {
        Intent intent = new Intent(this, Wedonttalk.class);
        startActivity(intent);
    }
    public void opencastle()
    {
        Intent intent = new Intent(this, Castle.class);
        startActivity(intent);
    }
    public void openmakeitright()
    {
        Intent intent = new Intent(this, Makeitright.class);
        startActivity(intent);
    }
    public void openstiches()
    {
        Intent intent = new Intent(this, Stiches.class);
        startActivity(intent);
    }
    public void opengirlslikeyou()
    {
        Intent intent = new Intent(this, GirllikeyouActivity.class);
        startActivity(intent);
    }
    public void opengreenday()
    {
        Intent intent = new Intent(this, Greenday.class);
        startActivity(intent);
    }
    public void openbeliever()
    {
        Intent intent = new Intent(this, Believer.class);
        startActivity(intent);
    }






}