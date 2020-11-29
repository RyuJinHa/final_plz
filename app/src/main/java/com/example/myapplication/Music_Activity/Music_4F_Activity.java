package com.example.myapplication.Music_Activity;

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


public class Music_4F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_4f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        Music_4F_Activity.myView1 mview1= new Music_4F_Activity.myView1(fl1.getContext());
        fl1.addView(mview1);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        Music_4F_Activity.myView2 mview2= new Music_4F_Activity.myView2(fl2.getContext());
        fl2.addView(mview2);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        Music_4F_Activity.myView3 mview3= new Music_4F_Activity.myView3(fl3.getContext());
        fl3.addView(mview3);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        Music_4F_Activity.myView4 mview4= new Music_4F_Activity.myView4(fl4.getContext());
        fl4.addView(mview4);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        Music_4F_Activity.myView5 mview5= new Music_4F_Activity.myView5(fl5.getContext());
        fl5.addView(mview5);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        Music_4F_Activity.myView6 mview6= new Music_4F_Activity.myView6(fl6.getContext());
        fl6.addView(mview6);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        Music_4F_Activity.myView7 mview7= new Music_4F_Activity.myView7(fl7.getContext());
        fl7.addView(mview7);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        Music_4F_Activity.myView8 mview8= new Music_4F_Activity.myView8(fl8.getContext());
        fl8.addView(mview8);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        Music_4F_Activity.myView9 mview9= new Music_4F_Activity.myView9(fl9.getContext());
        fl9.addView(mview9);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        Music_4F_Activity.myView10 mview10= new Music_4F_Activity.myView10(fl10.getContext());
        fl10.addView(mview10);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        Music_4F_Activity.myView11 mview11= new Music_4F_Activity.myView11(fl11.getContext());
        fl11.addView(mview11);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        Music_4F_Activity.myView12 mview12= new Music_4F_Activity.myView12(fl12.getContext());
        fl12.addView(mview12);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        Music_4F_Activity.myView13 mview13= new Music_4F_Activity.myView13(fl13.getContext());
        fl13.addView(mview13);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        Music_4F_Activity.myView14 mview14= new Music_4F_Activity.myView14 (fl10.getContext());
        fl14.addView(mview14);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        Music_4F_Activity.myView15 mview15= new Music_4F_Activity.myView15(fl11.getContext());
        fl15.addView(mview15);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        Music_4F_Activity.myView16 mview16= new Music_4F_Activity.myView16 (fl12.getContext());
        fl16.addView(mview16);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        Music_4F_Activity.myView17 mview17= new Music_4F_Activity.myView17(fl13.getContext());
        fl17.addView(mview17);
        fl17.setVisibility(View.GONE);

        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        Music_4F_Activity.myView18 mview18= new Music_4F_Activity.myView18(fl13.getContext());
        fl18.addView(mview18);
        fl18.setVisibility(View.GONE);

        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        Music_4F_Activity.myView19 mview19= new Music_4F_Activity.myView19(fl13.getContext());
        fl19.addView(mview19);
        fl19.setVisibility(View.GONE);

        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        Music_4F_Activity.myView20 mview20= new Music_4F_Activity.myView20(fl13.getContext());
        fl20.addView(mview20);
        fl20.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Music_4F_Activity.finalView finalview= new Music_4F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Music_4F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
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
                    fl18.setVisibility(View.INVISIBLE);
                    fl19.setVisibility(View.INVISIBLE);
                    fl20.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Music_4F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
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
                    fl18.setVisibility(View.INVISIBLE);
                    fl19.setVisibility(View.INVISIBLE);
                    fl20.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

        moving_401();
        moving_403();
        moving_405();
        moving_407();
        moving_408();
        moving_409();
        moving_410();
        moving_411();
        moving_412();
        moving_413();
        moving_414();
        moving_415();
        moving_417();
        moving_416();
        moving_422();
        moving_421();
        moving_420();
        moving_423();
        moving_425();
        moving_427();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    //401
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

            path.moveTo(440,620);
            path.lineTo(440,510);
            path.lineTo(785,510);
            path.lineTo(785,730);

            canvas.drawPath(path, MyPaint);
        }
    }

    //403
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
            path.moveTo(440,620);
            path.lineTo(440,510);
            path.lineTo(785,510);
            path.lineTo(785,730);

            canvas.drawPath(path, MyPaint);
        }
    }
    //405
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
            path.moveTo(440,510);
            path.lineTo(785,510);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //407
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
            path.moveTo(630,510);
            path.lineTo(785,510);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //408
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
            path.moveTo(795,510);
            path.lineTo(785,510);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //409
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
            path.moveTo(920,530);
            path.lineTo(785,530);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //410
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
            path.moveTo(1030,530);
            path.lineTo(785,530);
            path.lineTo(785,730);
            canvas.drawPath(path, MyPaint);
        }
    }



    //411
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
            path.moveTo(1240,530);
            path.lineTo(1780,530);



            canvas.drawPath(path, MyPaint);
        }
    }

    //412
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
            path.moveTo(1340,530);
            path.lineTo(1780,530);



            canvas.drawPath(path, MyPaint);
        }
    }
    //413
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
            path.moveTo(1460,530);
            path.lineTo(1780,530);



            canvas.drawPath(path, MyPaint);
        }
    }
    //414
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
            path.moveTo(1630,530);
            path.lineTo(1780,530);



            canvas.drawPath(path, MyPaint);
        }
    }
    //415
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
            path.moveTo(1800,600);
            path.lineTo(1800,510);



            canvas.drawPath(path, MyPaint);
        }
    }
    //416
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
            path.moveTo(1540,640);
            path.lineTo(1540,530);
            path.lineTo(1780,530);



            canvas.drawPath(path, MyPaint);
        }
    }
    //417
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
            path.moveTo(1540,760);
            path.lineTo(1540,530);
            path.lineTo(1780,530);
            canvas.drawPath(path, MyPaint);
        }
    }

    //420
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
            path.moveTo(1540,760);
            path.lineTo(1540,530);
            path.lineTo(1780,530);


            canvas.drawPath(path, MyPaint);
        }
    }

    //421
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
            path.moveTo(1540,640);
            path.lineTo(1540,530);
            path.lineTo(1780,530);

            canvas.drawPath(path, MyPaint);
        }
    }
    //422
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
            path.moveTo(1120,630);
            path.lineTo(1120,530);
            path.lineTo(785,530);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //423
    public class myView18 extends View {
        public myView18(Context context) {
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
            path.moveTo(1120,710);
            path.lineTo(1120,530);
            path.lineTo(785,530);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }
    //425
    public class myView19 extends View {
        public myView19(Context context) {
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
            path.moveTo(1120,710);
            path.lineTo(1120,530);
            path.lineTo(785,530);
            path.lineTo(785,730);


            canvas.drawPath(path, MyPaint);
        }
    }


    //427
    public class myView20 extends View {
        public myView20(Context context) {
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
            path.moveTo(1120,630);
            path.lineTo(1120,530);
            path.lineTo(785,530);
            path.lineTo(785,730);

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
            //404~비상구
            path.moveTo(440,510);
            path.lineTo(785,510);
            path.lineTo(785,730);
            //407~오른쪽
            path.moveTo(785,530);
            path.lineTo(1780,530);
            //424에서 위로
            path.moveTo(1120,760);
            path.lineTo(1120,530);
            //418에서 위로
            path.moveTo(1540,760);
            path.lineTo(1540,530);




            canvas.drawPath(path, MyPaint);
        }
    }

    // 401호에서 최단거리 이동
    private void moving_401() {
        final Button b = (Button) findViewById(R.id.m_401);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,400, 745,745); //x 좌표
                        animation1.setDuration(2000);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540, 430, 430,650); //y 좌표
                        animation3.setDuration(2000);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 403호에서 최단거리 이동
    private void moving_403() {
        final Button b = (Button) findViewById(R.id.m_403);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  400,400, 745,745); //x 좌표
                        animation1.setDuration(2000);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  540, 430, 430,650); //y 좌표
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    // 405호에서 최단거리 이동
    private void moving_405() {
        final Button b = (Button) findViewById(R.id.m_405);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  400, 745,745); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  430, 430,650); //y 좌표
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //407호에서 최단거리 이동
    private void moving_407() {
        final Button button = (Button) findViewById(R.id.m_407);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  600, 745,745);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  430, 430,650);
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //408호에서 최단거리 이동
    private void moving_408() {
        final Button button = (Button) findViewById(R.id.m_408);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 765,745,745);
                        animation1.setDuration(1000);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  450,450,650);
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //409호에서 최단거리 이동
    private void moving_409() {
        final Button button = (Button) findViewById(R.id.m_409);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 896, 745,745);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 450,650);
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }




    // 410호에서 최단거리 이동
    private void moving_410() {
        final Button b = (Button) findViewById(R.id.m_410);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1010, 745,745); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 455, 455,650); //y 좌표
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    // 411호에서 최단거리 이동
    private void moving_411() {
        final Button b = (Button) findViewById(R.id.m_411);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1200,1750); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  455,455); //y 좌표
                        animation3.setDuration(1500);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    // 412호에서 최단거리 이동
    private void moving_412() {
        final Button b = (Button) findViewById(R.id.m_412);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1350,1750); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  455,455); //y 좌표
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
                fl9.setVisibility(View.VISIBLE);
                fl10.setVisibility(View.GONE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //413호에서 최단거리 이동
    private void moving_413() {
        final Button button = (Button) findViewById(R.id.m_413);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1500,1750);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  455,455);
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
                fl10.setVisibility(View.VISIBLE);
                fl11.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //414호에서 최단거리 이동
    private void moving_414() {
        final Button button = (Button) findViewById(R.id.m_414);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1610,1750);
                        animation1.setDuration(1000);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  455,455);
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
                fl11.setVisibility(View.VISIBLE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //415호에서 최단거리 이동
    private void moving_415() {
        final Button button = (Button) findViewById(R.id.m_415);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1750, 1750);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 475,425);
                        animation3.setDuration(1000);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //416호에서 최단거리 이동
    private void moving_416() {
        final Button button = (Button) findViewById(R.id.m_416);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1490,1490, 1750);
                        animation1.setDuration(1700);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530, 455,455);
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
                fl13.setVisibility(View.VISIBLE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //417호에서 최단거리 이동
    private void moving_417() {
        final Button button = (Button) findViewById(R.id.m_417);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1490,1490, 1750);
                        animation1.setDuration(1700);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 680, 455,455);
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
                fl14.setVisibility(View.VISIBLE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //420호에서 최단거리 이동
    private void moving_420() {
        final Button button = (Button) findViewById(R.id.m_420);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1490,1490, 1750);
                        animation1.setDuration(1700);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 670, 455,455);
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
                fl15.setVisibility(View.VISIBLE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //421호에서 최단거리 이동
    private void moving_421() {
        final Button button = (Button) findViewById(R.id.m_421);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1490,1490, 1750);
                        animation1.setDuration(1700);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 530, 455,455);
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
                fl16.setVisibility(View.VISIBLE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //422호에서 최단거리 이동
    private void moving_422() {
        final Button button = (Button) findViewById(R.id.m_422);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1070, 1070, 745, 745);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550,490, 490,650);
                        animation3.setDuration(1800);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //423호에서 최단거리 이동
    private void moving_423() {
        final Button button = (Button) findViewById(R.id.m_423);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1070, 1070, 745, 745);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 695,490, 490,650);
                        animation3.setDuration(1800);
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
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.VISIBLE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //425호에서 최단거리 이동
    private void moving_425() {
        final Button button = (Button) findViewById(R.id.m_425);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1070, 1070, 745, 745);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 695,490, 490,650);
                        animation3.setDuration(1800);
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
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.VISIBLE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    //427호에서 최단거리 이동
    private void moving_427() {
        final Button button = (Button) findViewById(R.id.m_427);
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
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1070, 1070, 745, 745);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550,490, 490,650);
                        animation3.setDuration(1800);
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
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);
            }
        });
    }
}