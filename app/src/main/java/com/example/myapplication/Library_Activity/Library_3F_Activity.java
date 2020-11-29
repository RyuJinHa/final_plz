package com.example.myapplication.Library_Activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.suke.widget.SwitchButton;


public class Library_3F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_3f);
        textview=findViewById(R.id.textView6);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        Library_3F_Activity.myView1 mview1= new Library_3F_Activity.myView1(fl1.getContext());
        fl1.addView(mview1);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        Library_3F_Activity.myView2 mview2= new Library_3F_Activity.myView2(fl2.getContext());
        fl2.addView(mview2);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        Library_3F_Activity.myView3 mview3= new Library_3F_Activity.myView3(fl3.getContext());
        fl3.addView(mview3);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        Library_3F_Activity.myView4 mview4= new Library_3F_Activity.myView4(fl4.getContext());
        fl4.addView(mview4);
        fl4.setVisibility(View.GONE);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Library_3F_Activity.finalView finalview= new Library_3F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Library_3F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Library_3F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();


                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }
        moving_301();
        moving_302();
        moving_303();
        moving_302_2();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    //301
    public class myView1 extends View {
        public myView1(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();

            path.moveTo(690,440);
            path.lineTo(400,440);


            canvas.drawPath(path, MyPaint);
        }
    }

    //302
    public class myView2 extends View {
        public myView2(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1140,600);
            path.lineTo(1140,480);
            path.lineTo(1190,480);


            canvas.drawPath(path, MyPaint);
        }
    }
    //302-2
    public class myView3 extends View {
        public myView3(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1240,915);
            path.lineTo(1500,915);


            canvas.drawPath(path, MyPaint);
        }
    }
    //사무실
    public class myView4 extends View {
        public myView4(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1000,370);
            path.lineTo(920,370);
            path.lineTo(920,490);
            path.lineTo(1220,490);


            canvas.drawPath(path, MyPaint);
        }
    }
    public class finalView extends View {
        public finalView(Context context) {
            super(context);
        }
        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();

            //301~비상구
            path.moveTo(920,440);
            path.lineTo(400,440);


            //사무실~뒤점3

            path.moveTo(920,440);
            path.lineTo(920,490);
            path.lineTo(1220,490);

            //302 점2
            path.moveTo(1140,915);
            path.lineTo(1140,480);

            //302-2
            path.moveTo(1140,915);
            path.lineTo(1500,915);

            canvas.drawPath(path, MyPaint);
        }
    }
    // 301호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.l_301);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 670, 340); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 400,400); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();
                fl1.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 302호에서 최단거리 이동
    private void moving_302() {
        final Button b = (Button) findViewById(R.id.l_302);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1100, 1100,1200); //x 좌표
                        animation1.setDuration(1600);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  500,420,420); //y 좌표
                        animation3.setDuration(1600);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.VISIBLE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    // 302_2호에서 최단거리 이동
    private void moving_302_2() {
        final Button b = (Button) findViewById(R.id.l_302_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1200, 1500); //x 좌표
                        animation1.setDuration(1600);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  860,860); //y 좌표
                        animation3.setDuration(1600);
                        animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.VISIBLE);
                fl4.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //사무실에서 최단거리 이동
    private void moving_303() {
        final Button b = (Button) findViewById(R.id.l_303);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  890, 890,1200); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  360,420); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);
            }
        });
    }



}