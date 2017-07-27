package com.example.enchanter21.medpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img, img1, img2, img3, img4,img5,img6,img7,img8,img9;
   String Sgn;
    //int count=0;
    TextView Tnb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
Tnb=(TextView) findViewById(R.id.textwiewe1);
        img = (ImageView) findViewById(R.id.imge1);
        img1 = (ImageView) findViewById(R.id.imge2);
        img2 = (ImageView) findViewById(R.id.imge3);
        img3 = (ImageView) findViewById(R.id.imge4);
        img4 = (ImageView) findViewById(R.id.imge5);
        img5 = (ImageView) findViewById(R.id.imge6);
        img6 = (ImageView) findViewById(R.id.imge7);
        img7 = (ImageView) findViewById(R.id.imge8);
        img8 = (ImageView) findViewById(R.id.imge9);
        img9 = (ImageView) findViewById(R.id.imge10);

img.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        img1.setVisibility(View.VISIBLE);
        img.setVisibility(View.INVISIBLE);
        Tnb.setText("1");

        int x = (int) img.getX();
        int y = (int) img.getY();
        String s1=Integer.toString(x);
        String s2=Integer.toString(y);
        Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
//        count++;
//        Sgn=Integer.toString(count);
//        Toast.makeText(getApplicationContext(),Sgn,Toast.LENGTH_SHORT).show();
    }
});
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setVisibility(View.VISIBLE);
                img1.setVisibility(View.INVISIBLE);
                Tnb.setText("2");
                int x1 = (int) img1.getX();
                int y1 = (int) img1.getY();
                String s1=Integer.toString(x1);
                String s2=Integer.toString(y1);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();

//                count++;
//                Sgn=Integer.toString(count);
//                Toast.makeText(getApplicationContext(),Sgn,Toast.LENGTH_SHORT).show();

            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img3.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
                Tnb.setText("3");
                int x2 = (int) img2.getX();
                int y2 = (int) img2.getY();
                String s1=Integer.toString(x2);
                String s2=Integer.toString(y2);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
//                count++;
//                Sgn=Integer.toString(count);
//                Toast.makeText(getApplicationContext(),Sgn,Toast.LENGTH_SHORT).show();

            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img4.setVisibility(View.VISIBLE);
                img3.setVisibility(View.INVISIBLE);
                Tnb.setText("4");
                int x3 = (int) img3.getX();
                int y3 = (int) img3.getY();
                String s1=Integer.toString(x3);
                String s2=Integer.toString(y3);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
//                count++;
//                Sgn=Integer.toString(count);
//                Toast.makeText(getApplicationContext(),Sgn,Toast.LENGTH_SHORT).show();
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //img4.setVisibility(View.VISIBLE);
                img4.setVisibility(View.INVISIBLE);
                img5.setVisibility(View.VISIBLE);
                Tnb.setText("5");
                int x4 = (int) img4.getX();
                int y4 = (int) img4.getY();
                String s1=Integer.toString(x4);
                String s2=Integer.toString(y4);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
//                count++;
//                Sgn=Integer.toString(count);
//                Toast.makeText(getApplicationContext(),Sgn,Toast.LENGTH_SHORT).show();
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img5.setVisibility(View.INVISIBLE);
                img6.setVisibility(View.VISIBLE);
                Tnb.setText("6");
                int x5 = (int) img5.getX();
                int y5 = (int) img5.getY();
                String s1=Integer.toString(x5);
                String s2=Integer.toString(y5);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img6.setVisibility(View.INVISIBLE);
                img7.setVisibility(View.VISIBLE);
                Tnb.setText("7");
                int x6 = (int) img6.getX();
                int y6 = (int) img6.getY();
                String s1=Integer.toString(x6);
                String s2=Integer.toString(y6);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img7.setVisibility(View.INVISIBLE);
                img8.setVisibility(View.VISIBLE);
                Tnb.setText("8");
                int x7 = (int) img7.getX();
                int y7 = (int) img7.getY();
                String s1=Integer.toString(x7);
                String s2=Integer.toString(y7);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img8.setVisibility(View.INVISIBLE);
                img9.setVisibility(View.VISIBLE);
                Tnb.setText("9");
                int x8 = (int) img8.getX();
                int y8 = (int) img8.getY();
                String s1=Integer.toString(x8);
                String s2=Integer.toString(y8);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img9.setVisibility(View.INVISIBLE);
                //img6.setVisibility(View.VISIBLE);
                Tnb.setText("10");
                int x9 = (int) img9.getX();
                int y9 = (int) img9.getY();
                String s1=Integer.toString(x9);
                String s2=Integer.toString(y9);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });

//        img.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                int x = (int) motionEvent.getX();
//                int y = (int) motionEvent.getY();
//                String s1=Integer.toString(x);
//                String s2=Integer.toString(y);
//                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
//                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
//
//        Sgn=Integer.toString(count);
//        if(Sgn.equals(10)){
//            img.setVisibility(View.INVISIBLE);
//            img1.setVisibility(View.INVISIBLE);
//            img2.setVisibility(View.INVISIBLE);
//            img3.setVisibility(View.INVISIBLE);
//            img4.setVisibility(View.INVISIBLE);
//        }

        }
    }

