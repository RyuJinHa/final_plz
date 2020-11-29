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

public class Med_7F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_7f);
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

        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        FL14View fl14view= new FL14View(fl14.getContext());
        fl14.addView(fl14view);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        FL15View fl15view= new FL15View(fl15.getContext());
        fl15.addView(fl15view);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        FL16View fl16view= new FL16View(fl16.getContext());
        fl16.addView(fl16view);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        FL17View fl17view= new FL17View(fl17.getContext());
        fl17.addView(fl17view);
        fl17.setVisibility(View.GONE);

        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        FL18View fl18view= new FL18View(fl18.getContext());
        fl18.addView(fl18view);
        fl18.setVisibility(View.GONE);

        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl19);
        FL19View fl19view= new FL19View(fl19.getContext());
        fl19.addView(fl19view);
        fl19.setVisibility(View.GONE);

        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.fl20);
        FL20View fl20view= new FL20View(fl20.getContext());
        fl20.addView(fl20view);
        fl20.setVisibility(View.GONE);

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
                    Toast.makeText(Med_7F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
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
                    fl16.setVisibility(View.INVISIBLE);
                    fl17.setVisibility(View.INVISIBLE);
                    fl18.setVisibility(View.INVISIBLE);
                    fl19.setVisibility(View.INVISIBLE);
                    fl20.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Med_7F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
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

        moving_701();
        moving_702();
        moving_703A();
        moving_703B();
        moving_703C();
        moving_703D();
        moving_703E();
        moving_703F();
        moving_703G();
        moving_703H();
        moving_703I();
        moving_703J();
        moving_704();
        moving_705();
        moving_706();
        moving_707();
        moving_708();
        moving_709();
        moving_710();
        moving_711();

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
            path.moveTo(1090,680);
            path.lineTo(1090,510);
            path.lineTo(1370,510);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

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
            path.moveTo(990,680);
            path.lineTo(990,510);
            path.lineTo(1370,510);
            path.lineTo(1370,640);
            path.lineTo(1470, 640);

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
            path.moveTo(450,700);
            path.lineTo(450,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(330,700);
            path.lineTo(330,630);
            path.lineTo(450,630);
            path.lineTo(450,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(200,700);
            path.lineTo(200,630);
            path.lineTo(450,630);
            path.lineTo(450,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(190,510);
            path.lineTo(190,630);
            path.lineTo(450,630);
            path.lineTo(450,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(320,520);
            path.lineTo(620,520);
            path.lineTo(620,670);

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
            path.moveTo(330,450);
            path.lineTo(430,450);
            path.lineTo(430,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(290,290);
            path.lineTo(430,290);
            path.lineTo(430,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(430,270);
            path.lineTo(430,510);
            path.lineTo(620,510);
            path.lineTo(620,670);

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
            path.moveTo(620,350);
            path.lineTo(620,670);

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
            path.moveTo(780,450);
            path.lineTo(620,450);
            path.lineTo(620,670);

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
            path.moveTo(1090,450);
            path.lineTo(1090,520);
            path.lineTo(1370,520);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL14View extends View {
        public FL14View(Context context) {
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
            path.moveTo(1250,450);
            path.lineTo(1250,520);
            path.lineTo(1370,520);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL15View extends View {
        public FL15View(Context context) {
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
            path.moveTo(1370,350);
            path.lineTo(1370,590);
            path.lineTo(1470,590);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL16View extends View {
        public FL16View(Context context) {
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
            path.moveTo(1480,450);
            path.lineTo(1480,520);
            path.lineTo(1370,520);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL17View extends View {
        public FL17View(Context context) {
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
            path.moveTo(1830,450);
            path.lineTo(1830,520);
            path.lineTo(1370,520);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL18View extends View {
        public FL18View(Context context) {
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
            path.moveTo(1880,680);
            path.lineTo(1880,510);
            path.lineTo(1370,510);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL19View extends View {
        public FL19View(Context context) {
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
            path.moveTo(1770,655);
            path.lineTo(1660,655);
            path.lineTo(1660,510);
            path.lineTo(1370,510);
            path.lineTo(1370,640);
            path.lineTo(1470,640);

            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL20View extends View {
        public FL20View(Context context) {
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
            path.moveTo(1620,650);
            path.lineTo(1620,460);
            path.lineTo(1320,460);
            path.lineTo(1320,590);
            path.lineTo(1420,590);

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
            path.moveTo(410,350);
            path.lineTo(410,630);
            path.lineTo(180,630);

            path.moveTo(410,530);
            path.lineTo(1810,530);

            path.moveTo(1350,530);
            path.lineTo(1350,670);
            path.lineTo(1450,670);


            canvas.drawPath(path, MyPaint);
        }
    }

    // 701호에서 최단거리 이동
    private void moving_701() {
        final Button b = (Button) findViewById(R.id.med_701);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1040, 1040, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  630, 460, 460, 590, 590); //y 좌표
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

    // 702호에서 최단거리 이동
    private void moving_702() {
        final Button b = (Button) findViewById(R.id.med_702);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  940, 940, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  630, 460, 460, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //703A호에서 최단거리 이동
    private void moving_703A() {
        final Button b = (Button) findViewById(R.id.med_703A);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  400, 400, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  650, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703B호에서 최단거리 이동
    private void moving_703B() {
        final Button b = (Button) findViewById(R.id.med_703B);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  280, 280, 400, 400, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  650, 580, 580, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703C호에서 최단거리 이동
    private void moving_703C() {
        final Button b = (Button) findViewById(R.id.med_703C);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  150, 150, 400, 400, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  650, 580, 580, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703D호에서 최단거리 이동
    private void moving_703D() {
        final Button b = (Button) findViewById(R.id.med_703D);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  140, 140, 400, 400, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  460, 580, 580, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703E호에서 최단거리 이동
    private void moving_703E() {
        final Button b = (Button) findViewById(R.id.med_703E);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  270, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  470, 470, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703F호에서 최단거리 이동
    private void moving_703F() {
        final Button b = (Button) findViewById(R.id.med_703F);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  280, 380, 380, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 400, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703G호에서 최단거리 이동
    private void moving_703G() {
        final Button b = (Button) findViewById(R.id.med_703G);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  240, 380, 380, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  240, 240, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703H호에서 최단거리 이동
    private void moving_703H() {
        final Button b = (Button) findViewById(R.id.med_703H);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  380, 380, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  220, 460, 460, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703I호에서 최단거리 이동
    private void moving_703I() {
        final Button b = (Button) findViewById(R.id.med_703I);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300, 620); //y 좌표
                animation3.setDuration(1600);
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

    //703J호에서 최단거리 이동
    private void moving_703J() {
        final Button b = (Button) findViewById(R.id.med_703J);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  730, 570, 570); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 400, 620); //y 좌표
                animation3.setDuration(1600);
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

    //704호에서 최단거리 이동
    private void moving_704() {
        final Button b = (Button) findViewById(R.id.med_704);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1040, 1040, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 470, 470, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //705호에서 최단거리 이동
    private void moving_705() {
        final Button b = (Button) findViewById(R.id.med_705);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1200, 1200, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 470, 470, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //706호에서 최단거리 이동
    private void moving_706() {
        final Button b = (Button) findViewById(R.id.med_706);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  300, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //707호에서 최단거리 이동
    private void moving_707() {
        final Button b = (Button) findViewById(R.id.med_707);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1430, 1430, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 470, 470, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //708호에서 최단거리 이동
    private void moving_708() {
        final Button b = (Button) findViewById(R.id.med_708);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1780, 1780, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  400, 470, 470, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //709호에서 최단거리 이동
    private void moving_709() {
        final Button b = (Button) findViewById(R.id.med_709);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1830, 1830, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  630, 460, 460, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //710호에서 최단거리 이동
    private void moving_710() {
        final Button b = (Button) findViewById(R.id.med_710);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1720, 1610, 1610, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  605, 605, 460, 460, 590, 590); //y 좌표
                animation3.setDuration(1600);
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

    //711호에서 최단거리 이동
    private void moving_711() {
        final Button b = (Button) findViewById(R.id.med_711);
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

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1610, 1610, 1320, 1320, 1420); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  650, 460, 460, 590, 590); //y 좌표
                animation3.setDuration(1600);
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
