package com.example.myapplication.Med_Activity;

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

public class Med_5F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_5f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        FL1View fl1view= new FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        FL2View fl2view= new FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        FL3View fl3Aview= new FL3View(fl3.getContext());
        fl3.addView(fl3Aview);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        FL4View fl4view= new FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        FL5View fl5view= new FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        FL6View fl6view= new FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        FL7View fl7view= new FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        FL8View fl8view= new FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        FL9View fl9view= new FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl10);
        FL10View fl10view= new FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl11);
        FL11View fl11view= new FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        FL12View fl12view= new FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        FL13View fl13view= new FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        finalView finalview= new finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Med_5F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
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
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Med_5F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
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
        moving_504();
        moving_505();
        moving_506();
        moving_507();
        moving_508();
        moving_509();
        moving_510();
        moving_511();
        moving_512();
        moving_513();

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
            MyPaint.setARGB(255,0,0,0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(350,680);
            path.lineTo(350,510);
            path.lineTo(650,510);
            path.lineTo(650,650);

            canvas.drawPath(path, MyPaint);
        }
    }


    public class FL2View extends View {
        public FL2View(Context context) {
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
            path.moveTo(240,400);
            path.lineTo(240,510);
            path.lineTo(650,510);
            path.lineTo(650,650);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL3View extends View {
        public FL3View(Context context) {
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
            path.moveTo(430,400);
            path.lineTo(430,510);
            path.lineTo(650,510);
            path.lineTo(650,650);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL4View extends View {
        public FL4View(Context context) {
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
            path.moveTo(650,400);
            path.lineTo(650,650);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL5View extends View {
        public FL5View(Context context) {
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
            path.moveTo(870,400);
            path.lineTo(870,510);
            path.lineTo(650,510);
            path.lineTo(650,650);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL6View extends View {
        public FL6View(Context context) {
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
            path.moveTo(1060,400);
            path.lineTo(1060,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL7View extends View {
        public FL7View(Context context) {
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
            path.moveTo(1260,400);
            path.lineTo(1260,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL8View extends View {
        public FL8View(Context context) {
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
            path.moveTo(1460,400);
            path.lineTo(1460,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL9View extends View {
        public FL9View(Context context) {
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
            path.moveTo(1700,400);
            path.lineTo(1700,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL10View extends View {
        public FL10View(Context context) {
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
            path.moveTo(1900,400);
            path.lineTo(1900,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL11View extends View {
        public FL11View(Context context) {
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
            path.moveTo(1780,680);
            path.lineTo(1780,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL12View extends View {
        public FL12View(Context context) {
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
            path.moveTo(1130,680);
            path.lineTo(1130,510);
            path.lineTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL13View extends View {
        public FL13View(Context context) {
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
            path.moveTo(1010,680);
            path.lineTo(1010,510);
            path.lineTo(650,510);
            path.lineTo(650,650);

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
            path.moveTo(240,510);
            path.lineTo(1900,510);

            path.moveTo(650,510);
            path.lineTo(650,650);

            path.moveTo(1370,510);
            path.lineTo(1370,620);
            path.lineTo(1470,620);


            canvas.drawPath(path, MyPaint);
        }
    }

    // 501호에서 최단거리 이동
    private void moving_501() {
        final Button b = (Button) findViewById(R.id.med_501);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  300, 300, 600, 6000); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  630, 460, 460, 600); //y 좌표
                animation3.setDuration(1600);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 502호에서 최단거리 이동
    private void moving_502() {
        final Button b = (Button) findViewById(R.id.med_502);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  190, 190, 600, 600); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  350, 460, 460, 600); //y 좌표
                animation3.setDuration(1900);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //503호에서 최단거리 이동
    private void moving_503() {
        final Button button = (Button) findViewById(R.id.med_503);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  380, 380, 600, 600);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  350, 460, 460, 600);
                animation3.setDuration(2300);
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
                flf.setVisibility(View.GONE);

            }
        });
    }


    //504호에서 최단거리 이동
    private void moving_504() {
        final Button button = (Button) findViewById(R.id.med_504);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 600, 600);
                animation1.setDuration(2600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 600);
                animation3.setDuration(2600);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //505호에서 최단거리 이동
    private void moving_505() {
        final Button button = (Button) findViewById(R.id.med_505);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 820, 820, 600, 600);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 600);
                animation3.setDuration(2300);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //506호에서 최단거리 이동
    private void moving_506() {
        final Button button = (Button) findViewById(R.id.med_506);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1010, 1010, 1320, 1320, 1420);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 570, 570);
                animation3.setDuration(1900);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //507호에서 최단거리 이동
    private void moving_507() {
        final Button button = (Button) findViewById(R.id.med_507);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1210, 1210, 1320, 1320, 1420);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 570, 570);
                animation3.setDuration(1900);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //508호에서 최단거리 이동
    private void moving_508() {
        final Button button = (Button) findViewById(R.id.med_508);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1410, 1410, 1320, 1320, 1420);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 570, 570);
                animation3.setDuration(1900);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //509호에서 최단거리 이동
    private void moving_509() {
        final Button button = (Button) findViewById(R.id.med_509);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1650, 1650, 1320, 1320, 1420);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 570, 570);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //510호에서 최단거리 이동
    private void moving_510() {
        final Button button = (Button) findViewById(R.id.med_510);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1850, 1850, 1320, 1320, 1420);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 460, 460, 570, 570);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //511호에서 최단거리 이동
    private void moving_511() {
        final Button button = (Button) findViewById(R.id.med_511);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1730, 1730, 1320, 1320, 1420);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 630, 460, 460, 570, 570);
                animation3.setDuration(1900);
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
                flf.setVisibility(View.GONE);

            }
        });
    }

    //512호에서 최단거리 이동
    private void moving_512() {
        final Button button = (Button) findViewById(R.id.med_512);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080, 1080, 1320, 1320, 1420);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 630, 460, 460, 570, 570);
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
                fl12.setVisibility(View.VISIBLE);
                fl13.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //513호에서 최단거리 이동
    private void moving_513() {
        final Button button = (Button) findViewById(R.id.med_513);
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
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 960, 960, 600, 600);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 630, 460, 460, 600);
                animation3.setDuration(1300);
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
                flf.setVisibility(View.GONE);

            }
        });
    }
}
