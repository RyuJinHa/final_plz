package com.example.myapplication.Rena_Activity;

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


public class Rena_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rena_5f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        Rena_5F_Activity.myView1 mview1= new Rena_5F_Activity.myView1(fl1.getContext());
        fl1.addView(mview1);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        Rena_5F_Activity.myView2 mview2= new Rena_5F_Activity.myView2(fl2.getContext());
        fl2.addView(mview2);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        Rena_5F_Activity.myView3 mview3= new Rena_5F_Activity.myView3(fl3.getContext());
        fl3.addView(mview3);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        Rena_5F_Activity.myView4 mview4= new Rena_5F_Activity.myView4(fl4.getContext());
        fl4.addView(mview4);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        Rena_5F_Activity.myView5 mview5= new Rena_5F_Activity.myView5(fl5.getContext());
        fl5.addView(mview5);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        Rena_5F_Activity.myView6 mview6= new Rena_5F_Activity.myView6(fl6.getContext());
        fl6.addView(mview6);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        Rena_5F_Activity.myView7 mview7= new Rena_5F_Activity.myView7(fl7.getContext());
        fl7.addView(mview7);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        Rena_5F_Activity.myView8 mview8= new Rena_5F_Activity.myView8(fl8.getContext());
        fl8.addView(mview8);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        Rena_5F_Activity.myView9 mview9= new Rena_5F_Activity.myView9(fl9.getContext());
        fl9.addView(mview9);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        Rena_5F_Activity.myView10 mview10= new Rena_5F_Activity.myView10(fl10.getContext());
        fl10.addView(mview10);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        Rena_5F_Activity.myView11 mview11= new Rena_5F_Activity.myView11(fl11.getContext());
        fl11.addView(mview11);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        Rena_5F_Activity.myView12 mview12= new Rena_5F_Activity.myView12(fl12.getContext());
        fl12.addView(mview12);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        Rena_5F_Activity.myView13 mview13= new Rena_5F_Activity.myView13(fl13.getContext());
        fl13.addView(mview13);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        Rena_5F_Activity.myView14 mview14= new Rena_5F_Activity.myView14 (fl10.getContext());
        fl14.addView(mview14);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        Rena_5F_Activity.myView15 mview15= new Rena_5F_Activity.myView15(fl11.getContext());
        fl15.addView(mview15);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        Rena_5F_Activity.myView16 mview16= new Rena_5F_Activity.myView16 (fl12.getContext());
        fl16.addView(mview16);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        Rena_5F_Activity.myView17 mview17= new Rena_5F_Activity.myView17(fl13.getContext());
        fl17.addView(mview17);
        fl17.setVisibility(View.GONE);


        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Rena_5F_Activity.finalView finalview= new Rena_5F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Rena_5F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    fl11.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl16.setVisibility(View.INVISIBLE);
                    fl17.setVisibility(View.INVISIBLE);

                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Rena_5F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();


                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);
                    fl8.setVisibility(View.INVISIBLE);
                    fl9.setVisibility(View.INVISIBLE);
                    fl10.setVisibility(View.INVISIBLE);
                    fl11.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl16.setVisibility(View.INVISIBLE);
                    fl17.setVisibility(View.INVISIBLE);

                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

        moving_501();
        moving_502();
        moving_503();
        moving_503b();
        moving_503c();
        moving_504();
        moving_505();
        moving_505c();
        moving_505d();
        moving_505e();
        moving_506();
        moving_507();
        moving_509();
        moving_511();
        moving_510();
        moving_512();
        moving_513();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    //501
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

            path.moveTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);
            canvas.drawPath(path, MyPaint);
        }
    }

    //502
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
            path.moveTo(740,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);

            canvas.drawPath(path, MyPaint);
        }
    }
    //503
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
            path.moveTo(1040,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);



            canvas.drawPath(path, MyPaint);
        }
    }
    //503b
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
            path.moveTo(1240,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);



            canvas.drawPath(path, MyPaint);
        }
    }
    //503c
    public class myView5 extends View {
        public myView5(Context context) {
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
            path.moveTo(1440,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);


            canvas.drawPath(path, MyPaint);
        }
    }
    //504
    public class myView6 extends View {
        public myView6(Context context) {
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
            path.moveTo(1690,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);


            canvas.drawPath(path, MyPaint);
        }
    }
    //505
    public class myView7 extends View {
        public myView7(Context context) {
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
            path.moveTo(1660,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);

            canvas.drawPath(path, MyPaint);
        }
    }



    //505c
    public class myView8 extends View {
        public myView8(Context context) {
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
            path.moveTo(1390,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);




            canvas.drawPath(path, MyPaint);
        }
    }

    //505d
    public class myView9 extends View {
        public myView9(Context context) {
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
            path.moveTo(1190,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);



            canvas.drawPath(path, MyPaint);
        }
    }
    //505e
    public class myView10 extends View {
        public myView10(Context context) {
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
            path.moveTo(940,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);



            canvas.drawPath(path, MyPaint);
        }
    }
    //506
    public class myView11 extends View {
        public myView11(Context context) {
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
            path.moveTo(740,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);




            canvas.drawPath(path, MyPaint);
        }
    }
    //507
    public class myView12 extends View {
        public myView12(Context context) {
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
            path.moveTo(1240,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);




            canvas.drawPath(path, MyPaint);
        }
    }
    //509
    public class myView13 extends View {
        public myView13(Context context) {
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
            path.moveTo(1040,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);



            canvas.drawPath(path, MyPaint);
        }
    }
    //510
    public class myView14 extends View {
        public myView14(Context context) {
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
            path.moveTo(940,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);
            canvas.drawPath(path, MyPaint);
        }
    }

    //511
    public class myView15 extends View {
        public myView15(Context context) {
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
            path.moveTo(810,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);


            canvas.drawPath(path, MyPaint);
        }
    }

    //512
    public class myView16 extends View {
        public myView16(Context context) {
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
            path.moveTo(660,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);


            canvas.drawPath(path, MyPaint);
        }
    }
    //513
    public class myView17 extends View {
        public myView17(Context context) {
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

            path.moveTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);

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

            //507~비상구
            path.moveTo(1240,360);
            path.lineTo(500,360);
            path.lineTo(500,330);
            path.lineTo(390,330);
            path.lineTo(390,230);
            //504~비상구
            path.moveTo(1690,660);
            path.lineTo(500,660);
            path.lineTo(500,630);
            path.lineTo(390,630);
            path.lineTo(390,690);
            path.lineTo(240,690);

            path.moveTo(500,630);
            path.lineTo(500,330);
            canvas.drawPath(path, MyPaint);
        }
    }

    // 501호에서 최단거리 이동
    private void moving_501() {
        final Button b = (Button) findViewById(R.id.r_501);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 460,460, 350,350,200); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 580, 550, 550,620,620); //y 좌표
                animation3.setDuration(1900);
                animation3.start();

                fl1.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }

    //502호에서 최단거리 이동
    private void moving_502() {
        final Button b = (Button) findViewById(R.id.r_502);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700,460,460, 350,350,200); //x 좌표
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620); //y 좌표
                animation3.setDuration(2000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.VISIBLE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //503호에서 최단거리 이동
    private void moving_503() {
        final Button b = (Button) findViewById(R.id.r_503);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1000,460,460, 350,350,200); //x 좌표
                animation1.setDuration(3000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620); //y 좌표
                animation3.setDuration(3000);
                animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.VISIBLE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //503b호에서 최단거리 이동
    private void moving_503b() {
        final Button button = (Button) findViewById(R.id.r_503b);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1200,460,460, 350,350,200);
                animation1.setDuration(3000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620);
                animation3.setDuration(3000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.VISIBLE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //503c호에서 최단거리 이동
    private void moving_503c() {
        final Button button = (Button) findViewById(R.id.r_503c);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1400,460,460, 350,350,200);
                animation1.setDuration(3500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620);
                animation3.setDuration(3500);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.VISIBLE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //504호에서 최단거리 이동
    private void moving_504() {
        final Button button = (Button) findViewById(R.id.r_504);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650,460,460, 350,350,200);
                animation1.setDuration(4000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 580,580, 550, 550,620,620);
                animation3.setDuration(4000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.VISIBLE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }




    // 505호에서 최단거리 이동
    private void moving_505() {
        final Button b = (Button) findViewById(R.id.r_505);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620,460,460, 350,350,200);
                animation1.setDuration(4000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 580,580, 550, 550,620,620);
                animation3.setDuration(4000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.VISIBLE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    // 505c호에서 최단거리 이동
    private void moving_505c() {
        final Button b = (Button) findViewById(R.id.r_505c);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350,460,460, 350,350,200);
                animation1.setDuration(3500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620);
                animation3.setDuration(3500);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.VISIBLE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    // 505d호에서 최단거리 이동
    private void moving_505d() {
        final Button b = (Button) findViewById(R.id.r_505d);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1150,460,460, 350,350,200);
                animation1.setDuration(3000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620);
                animation3.setDuration(3000);
                animation3.start();


                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.VISIBLE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //505e에서 최단거리 이동
    private void moving_505e() {
        final Button button = (Button) findViewById(R.id.r_505e);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  900,460,460, 350,350,200); //x 좌표
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620); //y 좌표
                animation3.setDuration(2500);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.VISIBLE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //506호에서 최단거리 이동
    private void moving_506() {
        final Button button = (Button) findViewById(R.id.r_506);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700,460,460, 350,350,200); //x 좌표
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  580,580, 550, 550,620,620); //y 좌표
                animation3.setDuration(2000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.VISIBLE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }
    //507호에서 최단거리 이동
    private void moving_507() {
        final Button button = (Button) findViewById(R.id.r_507);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1200,460,460, 350,350);
                animation1.setDuration(3000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300,300, 250, 250,200);
                animation3.setDuration(3000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.VISIBLE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }
    //509호에서 최단거리 이동
    private void moving_509() {
        final Button button = (Button) findViewById(R.id.r_509);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1000,460,460, 350,350);
                animation1.setDuration(3000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300,300, 250, 250,200);
                animation3.setDuration(3000);
                animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.VISIBLE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }

    //510호에서 최단거리 이동
    private void moving_510() {
        final Button button = (Button) findViewById(R.id.r_510);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  900,460,460, 350,350);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300,300, 250, 250,200);
                animation3.setDuration(2500);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.VISIBLE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }
    //511호에서 최단거리 이동
    private void moving_511() {
        final Button button = (Button) findViewById(R.id.r_511);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  770,460,460, 350,350);
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300,300, 250, 250,200);
                animation3.setDuration(2000);
                animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.VISIBLE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);
            }
        });
    }
    //512호에서 최단거리 이동
    private void moving_512() {
        final Button button = (Button) findViewById(R.id.r_512);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  620,460,460, 350,350);
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300,300, 250, 250,200);
                animation3.setDuration(2000);
                animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.VISIBLE);
                fl17.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }
    //513호에서 최단거리 이동
    private void moving_513() {
        final Button button = (Button) findViewById(R.id.r_513);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  460, 350,350);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   250, 250,200);
                animation3.setDuration(1500);
                animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl3.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);
                fl8.setVisibility(View.GONE);
                fl9.setVisibility(View.GONE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.VISIBLE);

                flf.setVisibility(View.GONE);

            }
        });
    }
}