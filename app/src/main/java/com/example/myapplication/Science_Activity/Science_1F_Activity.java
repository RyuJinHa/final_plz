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

public class Science_1F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView2;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_1f);
        textview=findViewById(R.id.textView6);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        Science_1F_Activity.FL1View fl1view = new Science_1F_Activity.FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        Science_1F_Activity.FL2View fl2view = new Science_1F_Activity.FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        Science_1F_Activity.FL3View fl3view = new Science_1F_Activity.FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        Science_1F_Activity.FL4View fl4view = new Science_1F_Activity.FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        Science_1F_Activity.FL5View fl5view = new Science_1F_Activity.FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        Science_1F_Activity.FL6View fl6view = new Science_1F_Activity.FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        Science_1F_Activity.FL7View fl7view = new Science_1F_Activity.FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        Science_1F_Activity.FL8View fl8view = new Science_1F_Activity.FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        Science_1F_Activity.finalView finalview = new Science_1F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(Science_1F_Activity.this, "모든 대피로", Toast.LENGTH_SHORT).show();
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
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Science_1F_Activity.this, "경로 리셋", Toast.LENGTH_SHORT).show();
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
                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if (prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }
        moving_1();
        moving_2();
        moving_101();
        moving_103();
        moving_104();
        moving_105();
        moving_107();
        moving_108();
        moving_109();
        moving_110();
        moving_152();
        moving_lab1();
        moving_lab2();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

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
            path.moveTo(600, 380);
            path.lineTo(600, 250);

            canvas.drawPath(path, MyPaint);
        }
    } //1,2
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

            path.moveTo(1050, 640);
            path.lineTo(1320, 640);
            path.lineTo(1320, 600);

            canvas.drawPath(path, MyPaint);
        }
    } //101, 104
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
            path.moveTo(930, 650);
            path.lineTo(710, 650);
            path.lineTo(710, 600);

            canvas.drawPath(path, MyPaint);
        }
    } //103, 105
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
            path.moveTo(1550, 680);
            path.lineTo(1350, 680);
            path.lineTo(1350, 600);

            canvas.drawPath(path, MyPaint);
        }
    } //107, 110
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
            path.moveTo(1700, 680);
            path.lineTo(1850, 680);
            path.lineTo(1850, 600);

            canvas.drawPath(path, MyPaint);
        }
    } //108, 109
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
            path.moveTo(600, 670);
            path.lineTo(700, 670);
            path.lineTo(700, 590);
            canvas.drawPath(path, MyPaint);
        }
    } //152
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
            path.moveTo(625, 805);
            path.lineTo(800, 805);

            canvas.drawPath(path, MyPaint);
        }
    } //lab2
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
            path.moveTo(450, 775);
            path.lineTo(450, 650);
            path.lineTo(365, 650);

            canvas.drawPath(path, MyPaint);
        }
    } //lab3
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
            path.moveTo(600, 400);
            path.lineTo(600, 250);

            path.moveTo(700, 600);
            path.lineTo(700, 650);
            path.lineTo(1330, 650);
            path.lineTo(1330, 600);
            path.lineTo(1330, 680);
            path.lineTo(1850, 680);
            path.lineTo(1850, 600);

            path.moveTo(370, 650);
            path.lineTo(460, 650);
            path.lineTo(460, 805);
            path.lineTo(800, 805);
            canvas.drawPath(path, MyPaint);
        }
    }

    private void moving_1() {
        final Button b = (Button) findViewById(R.id.s_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 570,570); //x 좌표
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300,200); //y 좌표
                animation3.setDuration(1300);
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
                flf.setVisibility(View.GONE);
            }
        });
    }//
    private void moving_2() {
        final Button b = (Button) findViewById(R.id.s_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 570,570); //x 좌표
                animation1.setDuration(1000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 250,200); //y 좌표
                animation3.setDuration(1000);
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
                flf.setVisibility(View.GONE);
            }
        });
    }//
    private void moving_101() {
        final Button b = (Button) findViewById(R.id.s_101);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1000, 1280, 1280); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
    private void moving_103() {
        final Button b = (Button) findViewById(R.id.s_103);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 900, 680, 680); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);

            }
        });
    }//
    private void moving_104() {
        final Button b = (Button) findViewById(R.id.s_104);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1000, 1250, 1250); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_105() {
        final Button b = (Button) findViewById(R.id.s_105);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 900, 680,680); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);

            }
        });
    }//
    private void moving_107() {
        final Button b = (Button) findViewById(R.id.s_107);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1280, 1280); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);


            }
        });
    } //
    private void moving_108() {
        final Button b = (Button) findViewById(R.id.s_108);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650, 1800, 1800); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);

            }
        });
    }//
    private void moving_109() {
        final Button b = (Button) findViewById(R.id.s_109);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650, 1800, 1800); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);
            }
        });
    }//
    private void moving_110() {
        final Button b = (Button) findViewById(R.id.s_110);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1300, 1300); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 550); //y 좌표
                animation3.setDuration(1500);
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
                flf.setVisibility(View.GONE);

            }
        });
    }//
    private void moving_152() {
        final Button b = (Button) findViewById(R.id.s_152);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600, 660, 660); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 600, 525); //y 좌표
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
                flf.setVisibility(View.GONE);
            }
        });
    }//
    private void moving_lab1() {
        final Button b = (Button) findViewById(R.id.s_lab2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 575, 750); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 740, 740); //y 좌표
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
                fl7.setVisibility(View.VISIBLE);
                fl8.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    private void moving_lab2() {
        final Button b = (Button) findViewById(R.id.s_lab3);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400, 400, 315); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 725, 600, 600); //y 좌표
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
                fl8.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);
            }
        });
    }
}