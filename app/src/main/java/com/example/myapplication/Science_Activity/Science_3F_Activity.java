package com.example.myapplication.Science_Activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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

public class Science_3F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_3f);
        textview=findViewById(R.id.textView6);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        Science_3F_Activity.FL1View fl1view = new Science_3F_Activity.FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        Science_3F_Activity.FL2View fl2view = new Science_3F_Activity.FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        Science_3F_Activity.FL3View fl3view = new Science_3F_Activity.FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        Science_3F_Activity.FL4View fl4view = new Science_3F_Activity.FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        Science_3F_Activity.FL5View fl5view = new Science_3F_Activity.FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        Science_3F_Activity.FL6View fl6view = new Science_3F_Activity.FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        Science_3F_Activity.FL7View fl7view = new Science_3F_Activity.FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        Science_3F_Activity.FL8View fl8view = new Science_3F_Activity.FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        Science_3F_Activity.FL9View fl9view = new Science_3F_Activity.FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        Science_3F_Activity.FL10View fl10view = new Science_3F_Activity.FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        Science_3F_Activity.FL11View fl11view = new Science_3F_Activity.FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        Science_3F_Activity.FL12View fl12view = new Science_3F_Activity.FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        Science_3F_Activity.FL13View fl13view = new Science_3F_Activity.FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        Science_3F_Activity.FL14View fl14view = new Science_3F_Activity.FL14View(fl14.getContext());
        fl14.addView(fl14view);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        Science_3F_Activity.FL15View fl15view = new Science_3F_Activity.FL15View(fl15.getContext());
        fl15.addView(fl15view);
        fl15.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        Science_3F_Activity.finalView finalview = new Science_3F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(Science_3F_Activity.this, "모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
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
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Science_3F_Activity.this, "경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl3.setVisibility(View.INVISIBLE);
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
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if (prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

        moving_301();
        moving_303();
        moving_306();
        moving_305();
        moving_307();
        moving_308();
        moving_309();
        moving_311();
        moving_313();
        moving_351();
        moving_453();
        moving_356();
        moving_358();
        moving_359();
        moving_361();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    //301
    public class FL1View extends View {
        public FL1View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1110, 350);
            path.lineTo(1020, 350);
            path.lineTo(1020, 300);
            path.lineTo(970, 300);
            path.lineTo(970, 250);


            canvas.drawPath(path, MyPaint);
        }
    }

    //303
    public class FL2View extends View {
        public FL2View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();

            path.moveTo(1360, 350);
            path.lineTo(1540, 350);
            path.lineTo(1540, 270);


            canvas.drawPath(path, MyPaint);
        }
    }
    //305
    public class FL3View extends View {
        public FL3View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();

            path.moveTo(1400, 350);
            path.lineTo(1540, 350);
            path.lineTo(1540, 270);

            canvas.drawPath(path, MyPaint);
        }
    }
    //306
    public class FL4View extends View {
        public FL4View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1110, 350);
            path.lineTo(1020, 350);
            path.lineTo(1020, 300);
            path.lineTo(970, 300);
            path.lineTo(970, 250);
            canvas.drawPath(path, MyPaint);
        }
    }
    //307
    public class FL5View extends View {
        public FL5View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(770, 280);
            path.lineTo(770, 330);
            path.lineTo(970, 330);
            path.lineTo(970, 250);

            canvas.drawPath(path, MyPaint);
        }
    }

    //308
    public class FL6View extends View {
        public FL6View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(540, 330);
            path.lineTo(360, 330);
            path.lineTo(360, 370);


            canvas.drawPath(path, MyPaint);
        }
    }
    //309
    public class FL7View extends View {
        public FL7View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(540, 330);
            path.lineTo(360, 330);
            path.lineTo(360, 370);





            canvas.drawPath(path, MyPaint);
        }
    }
    //311
    public class FL8View extends View {
        public FL8View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(800, 350);
            path.lineTo(800, 320);
            path.lineTo(970, 320);
            path.lineTo(970, 250);




            canvas.drawPath(path, MyPaint);
        }
    }
    //313
    public class FL9View extends View {
        public FL9View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(960, 400);
            path.lineTo(960, 250);




            canvas.drawPath(path, MyPaint);
        }
    }
    //351
    public class FL10View extends View {
        public FL10View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1580, 520);
            path.lineTo(1580, 250);


            canvas.drawPath(path, MyPaint);
        }
    }

    //353
    public class FL11View extends View {
        public FL11View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1620, 730);
            path.lineTo(1620, 880);
            path.lineTo(1670, 880);

            canvas.drawPath(path, MyPaint);
        }
    }


    //356
    public class FL12View extends View {
        public FL12View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1620, 730);
            path.lineTo(1620, 880);
            path.lineTo(1670, 880);



            canvas.drawPath(path, MyPaint);
        }
    }
    //358
    public class FL13View extends View {
        public FL13View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1580, 520);
            path.lineTo(1580, 250);



            canvas.drawPath(path, MyPaint);
        }
    }

    //359
    public class FL14View extends View {
        public FL14View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1580, 420);
            path.lineTo(1580, 250);

            canvas.drawPath(path, MyPaint);
        }
    }
    //361
    public class FL15View extends View {
        public FL15View(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.TRANSPARENT);
            Paint MyPaint = new Paint();
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1580, 420);
            path.lineTo(1580, 250);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            //609뒤점2~651뒤점1
            path.moveTo(400, 360);
            path.lineTo(400, 310);
            path.lineTo(990, 310);
            path.lineTo(990, 340);

            path.moveTo(990, 340);
            path.lineTo(1620, 340);
            path.lineTo(1620, 840);
            path.lineTo(1660, 840);

            canvas.drawPath(path, MyPaint);
        }
    }

    // 301호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.s_301);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1100,980,980,910,910); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300,300,250,250,210); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 303호에서 최단거리 이동
    private void moving_303() {
        final Button b = (Button) findViewById(R.id.s_303);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1330,1500,1500); //x 좌표
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300,300,220); //y 좌표
                animation3.setDuration(2000);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 305호에서 최단거리 이동
    private void moving_305() {
        final Button b = (Button) findViewById(R.id.s_305);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1290,1500,1500); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300,300,220); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //306호에서 최단거리 이동
    private void moving_306() {
        final Button button = (Button) findViewById(R.id.s_306);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1100,980,980,910,910); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300,300,250,250,210); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //307호에서 최단거리 이동
    private void moving_307() {
        final Button button = (Button) findViewById(R.id.s_307);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 720,910,910); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 280,280,200); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //308호에서 최단거리 이동
    private void moving_308() {
        final Button button = (Button) findViewById(R.id.s_308);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 420,300,300); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",280,280,330); //y 좌표
                animation3.setDuration(1500);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //309호에서 최단거리 이동
    private void moving_309() {
        final Button button = (Button) findViewById(R.id.s_309);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 480,300,300); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",280,280,330); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //311호에서 최단거리 이동
    private void moving_311() {
        final Button button = (Button) findViewById(R.id.s_311);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 800,910,910); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 280,280,200); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //313호에서 최단거리 이동
    private void moving_313() {
        final Button button = (Button) findViewById(R.id.s_313);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 910,910); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 280,200); //y 좌표
                animation3.setDuration(1500);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //351호에서 최단거리 이동
    private void moving_351() {
        final Button button = (Button) findViewById(R.id.s_351);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1550); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 500,210); //y 좌표
                animation3.setDuration(1600);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //353호에서 최단거리 이동
    private void moving_453() {
        final Button button = (Button) findViewById(R.id.s_353);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1570,1570,1620); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700,800,800); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    //356호에서 최단거리 이동
    private void moving_356() {
        final Button button = (Button) findViewById(R.id.s_356);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1570,1570,1620); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700,800,800); //y 좌표
                animation3.setDuration(1800);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    //358호에서 최단거리 이동
    private void moving_358() {
        final Button button = (Button) findViewById(R.id.s_358);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1550); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510,210); //y 좌표
                animation3.setDuration(1600);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //359호에서 최단거리 이동
    private void moving_359() {
        final Button button = (Button) findViewById(R.id.s_359);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1550); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 370,210); //y 좌표
                animation3.setDuration(1600);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    //361호에서 최단거리 이동
    private void moving_361() {
        final Button button = (Button) findViewById(R.id.s_361);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550,1550); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 340,210); //y 좌표
                animation3.setDuration(1600);
                animation3.start();
                animation1.setRepeatCount(ValueAnimator.REVERSE);
                animation3.setRepeatCount(ValueAnimator.REVERSE);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

}