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

public class Science_4F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_4f);
        textview=findViewById(R.id.textView6);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        Science_4F_Activity.FL1View fl1view = new Science_4F_Activity.FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        Science_4F_Activity.FL2View fl2view = new Science_4F_Activity.FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        Science_4F_Activity.FL3View fl3view = new Science_4F_Activity.FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        Science_4F_Activity.FL4View fl4view = new Science_4F_Activity.FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        Science_4F_Activity.FL5View fl5view = new Science_4F_Activity.FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        Science_4F_Activity.FL6View fl6view = new Science_4F_Activity.FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        Science_4F_Activity.FL7View fl7view = new Science_4F_Activity.FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        Science_4F_Activity.FL8View fl8view = new Science_4F_Activity.FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        Science_4F_Activity.FL9View fl9view = new Science_4F_Activity.FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        Science_4F_Activity.FL10View fl10view = new Science_4F_Activity.FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        Science_4F_Activity.FL11View fl11view = new Science_4F_Activity.FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        Science_4F_Activity.FL12View fl12view = new Science_4F_Activity.FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        Science_4F_Activity.FL13View fl13view = new Science_4F_Activity.FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        Science_4F_Activity.FL14View fl14view = new Science_4F_Activity.FL14View(fl14.getContext());
        fl14.addView(fl14view);
        fl14.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        Science_4F_Activity.finalView finalview = new Science_4F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(Science_4F_Activity.this, "모든 대피로", Toast.LENGTH_SHORT).show();
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
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Science_4F_Activity.this, "경로 리셋", Toast.LENGTH_SHORT).show();
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
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if (prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }

    moving_401();
    moving_403();
    moving_404();
    moving_405();
    moving_407();
    moving_408();
    moving_409();
    moving_410();
    moving_414();
    moving_451();
    moving_453();
    moving_456();
    moving_457();
    moving_459();

    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
}
//401
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

//403
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
//405
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
//406
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
//407
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
        path.moveTo(800, 280);
        path.lineTo(800, 330);
        path.lineTo(970, 330);
        path.lineTo(970, 250);

        canvas.drawPath(path, MyPaint);
    }
}

//408
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
        path.moveTo(670, 330);
        path.lineTo(360, 330);
        path.lineTo(360, 370);


        canvas.drawPath(path, MyPaint);
    }
}
//410
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
        path.moveTo(670, 330);
        path.lineTo(360, 330);
        path.lineTo(360, 370);





        canvas.drawPath(path, MyPaint);
    }
}
//413
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
//414
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
        path.moveTo(990, 400);
        path.lineTo(990, 250);




        canvas.drawPath(path, MyPaint);
    }
}
//451
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
        path.moveTo(1620, 520);
        path.lineTo(1620, 250);


        canvas.drawPath(path, MyPaint);
    }
}

//453
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


    //456
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
    //457
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
            path.moveTo(1620, 520);
            path.lineTo(1620, 250);



            canvas.drawPath(path, MyPaint);
        }
    }

    //459
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
            path.moveTo(1620, 420);
            path.lineTo(1620, 250);

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

    // 401호에서 최단거리 이동
    private void moving_401() {
        final Button b = (Button) findViewById(R.id.s_401);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,980,980,930,930); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 403호에서 최단거리 이동
    private void moving_403() {
        final Button b = (Button) findViewById(R.id.s_403);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 405호에서 최단거리 이동
    private void moving_404() {
        final Button b = (Button) findViewById(R.id.s_404);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1340,1500,1500); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //406호에서 최단거리 이동
    private void moving_405() {
        final Button button = (Button) findViewById(R.id.s_405);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,980,980,930,930); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //407호에서 최단거리 이동
    private void moving_407() {
        final Button button = (Button) findViewById(R.id.s_407);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 780,930,930); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //408호에서 최단거리 이동
    private void moving_408() {
        final Button button = (Button) findViewById(R.id.s_408);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 420,320,320); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //410호에서 최단거리 이동
    private void moving_409() {
        final Button button = (Button) findViewById(R.id.s_409);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 480,320,320); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //413호에서 최단거리 이동
    private void moving_410() {
        final Button button = (Button) findViewById(R.id.s_410);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 800,930,930); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //414호에서 최단거리 이동
    private void moving_414() {
        final Button button = (Button) findViewById(R.id.s_414);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 930,930); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //451호에서 최단거리 이동
    private void moving_451() {
        final Button button = (Button) findViewById(R.id.s_451);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1570,1570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 480,210); //y 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //453호에서 최단거리 이동
    private void moving_453() {
        final Button button = (Button) findViewById(R.id.s_453);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    //456호에서 최단거리 이동
    private void moving_456() {
        final Button button = (Button) findViewById(R.id.s_456);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    //457호에서 최단거리 이동
    private void moving_457() {
        final Button button = (Button) findViewById(R.id.s_457);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1570,1570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 480,210); //y 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //459호에서 최단거리 이동
    private void moving_459() {
        final Button button = (Button) findViewById(R.id.s_459);
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
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1570,1570); //x 좌표
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
                flf.setVisibility(View.GONE);

            }
        });
    }

}