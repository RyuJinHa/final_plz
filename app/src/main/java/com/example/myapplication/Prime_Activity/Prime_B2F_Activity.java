package com.example.myapplication.Prime_Activity;

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


public class Prime_B2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_b2f);
        textview=findViewById(R.id.textView6);

        //좌측
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        FL1View fl1view= new FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        FL2View fl2view= new FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        FL3View fl3view= new FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        FL4View fl4view= new FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        FL5View fl5view= new FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        FL6View fl6view= new FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        FL7View fl7view= new FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        FL8View fl8view= new FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        //우측
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        FL9View fl9view= new FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        FL10View fl10view= new FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        FL11View fl11view= new FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        FL12View fl12view= new FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        FL13View fl13view= new FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        FL14View fl14view= new FL14View(fl14.getContext());
        fl14.addView(fl14view);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        FL15View fl15view= new FL15View(fl15.getContext());
        fl15.addView(fl15view);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        FL16View fl16view= new FL16View(fl16.getContext());
        fl16.addView(fl16view);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        FL17View fl17view= new FL17View(fl17.getContext());
        fl17.addView(fl17view);
        fl17.setVisibility(View.GONE);

        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        FL18View fl18view= new FL18View(fl18.getContext());
        fl18.addView(fl18view);
        fl18.setVisibility(View.GONE);

        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        FL19View fl19view= new FL19View(fl19.getContext());
        fl19.addView(fl19view);
        fl19.setVisibility(View.GONE);

        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
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
                    Toast.makeText(Prime_B2F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Prime_B2F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
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

        //좌측
        moving_b201_p();
        moving_b202_p();
        moving_b203_p();
        moving_b204_p();
        moving_b205_p();
        moving_b206_p();
        moving_b207_p();
        moving_b208_p();
        moving_elec_p(); //fl20

        //우측
        moving_b202_r();
        moving_b203_r();
        moving_b204_r();
        moving_b205_r();
        moving_b206_r();
        moving_b207_r();
        moving_b208_r();
        moving_b209AB_r();
        moving_b210_r();
        moving_b211_r();
        moving_b211A_r();

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
            path.moveTo(880,710);
            path.lineTo(400,710);

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
            path.moveTo(750,710);
            path.lineTo(400,710);

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
            path.moveTo(620,710);
            path.lineTo(400,710);

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
            path.moveTo(490,710);
            path.lineTo(400,710);

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
            path.moveTo(220,710);
            path.lineTo(350,710);

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
            path.moveTo(390,650);
            path.lineTo(390,710);

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
            path.moveTo(490,650);
            path.lineTo(490,710);
            path.lineTo(400,710);

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
            path.moveTo(750,710);
            path.lineTo(400,710);

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
            path.moveTo(1735,780);
            path.lineTo(1230,780);
            path.lineTo(1230,640);

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
            path.moveTo(1735,750);
            path.lineTo(1735,780);
            path.lineTo(1230,780);
            path.lineTo(1230,640);

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
            path.moveTo(1735,660);
            path.lineTo(1735,780);
            path.lineTo(1230,780);
            path.lineTo(1230,640);

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
            path.moveTo(1735,600);
            path.lineTo(1735,350);
            path.lineTo(1600,350);

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
            path.moveTo(1735,530);
            path.lineTo(1735,350);
            path.lineTo(1600,350);

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
            path.moveTo(1735,470);
            path.lineTo(1735,350);
            path.lineTo(1600,350);

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
            path.moveTo(1735,410);
            path.lineTo(1735,350);
            path.lineTo(1600,350);

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
            path.moveTo(1495,370);
            path.lineTo(1600,370);
            path.lineTo(1600,320);

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
            path.moveTo(1600,400);
            path.lineTo(1600,320);

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
            path.moveTo(1735,500);
            path.lineTo(1735,350);
            path.lineTo(1600,350);

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
            path.moveTo(1550, 780);
            path.lineTo(1230,780);
            path.lineTo(1230,640);

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
            path.moveTo(400,570);
            path.lineTo(600,570);
            path.lineTo(600,710);
            path.lineTo(400,710);

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
            path.moveTo(1735,360);
            path.lineTo(1735,780);
            path.lineTo(1230,780);
            path.lineTo(1230,710);
            path.lineTo(400,710);

            path.moveTo(1300, 780);
            path.lineTo(1300,300);
            path.lineTo(1240,300);
            path.lineTo(1240, 540);

            path.moveTo(1240,300);
            path.lineTo(1240,190);
            path.lineTo(1050,190);

            path.moveTo(1600,360);
            path.lineTo(1850,360);

            path.moveTo(620,710);
            path.lineTo(620,600);
            path.lineTo(550, 600);
            path.lineTo(550,500);

            canvas.drawPath(path, MyPaint);
        }
    }

    // b201_p호에서 최단거리 이동
    private void moving_b201_p() {
        final Button b = (Button) findViewById(R.id.p_b201);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 660, 660); //y 좌표
                animation3.setDuration(1500);
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

    // b202_p호에서 최단거리 이동
    private void moving_b202_p() {
        final Button b = (Button) findViewById(R.id.p_b202);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  700, 350); //x 좌표
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 660); //y 좌표
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

    // b203_p호에서 최단거리 이동
    private void moving_b203_p() {
        final Button b = (Button) findViewById(R.id.p_b203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  570, 350); //x 좌표
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 660); //y 좌표
                animation3.setDuration(1300);
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

    //b204_p호에서 최단거리 이동
    private void moving_b204_p() {
        final Button button = (Button) findViewById(R.id.p_b204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  440, 350);
                animation1.setDuration(1000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 660);
                animation3.setDuration(1000);
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

    //b205_p호에서 최단거리 이동
    private void moving_b205_p() {
        final Button button = (Button) findViewById(R.id.p_b205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 170, 300);
                animation1.setDuration(1000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  660, 660);
                animation3.setDuration(1000);
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

    //b206_p호에서 최단거리 이동
    private void moving_b206_p() {
        final Button button = (Button) findViewById(R.id.p_b206);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 340, 340);
                animation1.setDuration(1100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 660);
                animation3.setDuration(1100);
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

    //b207_p호에서 최단거리 이동
    private void moving_b207_p() {
        final Button button = (Button) findViewById(R.id.p_b207);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 440, 440, 350);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600, 660, 660);
                animation3.setDuration(1300);
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

    //b208_p호에서 최단거리 이동
    private void moving_b208_p() {
        final Button button = (Button) findViewById(R.id.p_b208);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 700, 350);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 660, 660);
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

    //b202_r호에서 최단거리 이동
    private void moving_b202_r() {
        final Button button = (Button) findViewById(R.id.r_b202);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1180, 1180);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 730, 730, 590);
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

    //b203_r호에서 최단거리 이동
    private void moving_b203_r() {
        final Button button = (Button) findViewById(R.id.r_b203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1180, 1180);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700, 730, 730, 590);
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

    //b204_r호에서 최단거리 이동
    private void moving_b204_r() {
        final Button button = (Button) findViewById(R.id.r_b204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1180, 1180);
                animation1.setDuration(2000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 610, 730, 730, 590);
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
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //b205_r호에서 최단거리 이동
    private void moving_b205_r() {
        final Button button = (Button) findViewById(R.id.r_b205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1550);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 300, 300);
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

    //b206_r호에서 최단거리 이동
    private void moving_b206_r() {
        final Button button = (Button) findViewById(R.id.r_b206);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1550);
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 480, 300, 300);
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

    //b207_r호에서 최단거리 이동
    private void moving_b207_r() {
        final Button button = (Button) findViewById(R.id.r_b207);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1550);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 420, 300, 300);
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

    //b208_r호에서 최단거리 이동
    private void moving_b208_r() {
        final Button button = (Button) findViewById(R.id.r_b208);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1550);
                animation1.setDuration(1300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 360, 300, 300);
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

    //b209A_r, b_209B_r호에서 최단거리 이동
    private void moving_b209AB_r() {
        final Button button = (Button) findViewById(R.id.r_b209AB);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1445, 1550, 1550);
                animation1.setDuration(1000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 320, 320, 270);
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

    //b210_r호에서 최단거리 이동
    private void moving_b210_r() {
        final Button button = (Button) findViewById(R.id.r_b210);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1550, 1550);
                animation1.setDuration(1000);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 350, 270);
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

    //b211_r호에서 최단거리 이동
    private void moving_b211_r() {
        final Button button = (Button) findViewById(R.id.r_b211);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1685, 1685, 1550);
                animation1.setDuration(1500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450, 300, 300);
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
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.VISIBLE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //b211A_r호에서 최단거리 이동
    private void moving_b211A_r() {
        final Button button = (Button) findViewById(R.id.r_b211A);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1180, 1180);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 730, 730, 590);
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

    private void moving_elec_p() {
        final Button button = (Button) findViewById(R.id.p_elec);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1p);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2p);
        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3p);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4p);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5p);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6p);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7p);
        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8p);
        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl2r);
        final FrameLayout fl10 = (FrameLayout)findViewById(R.id.fl3r);
        final FrameLayout fl11 = (FrameLayout)findViewById(R.id.fl4r);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl5r);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl6r);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl7r);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl8r);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl9ABr);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl10r);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl11r);
        final FrameLayout fl19 = (FrameLayout)findViewById(R.id.fl11Ar);
        final FrameLayout fl20 = (FrameLayout)findViewById(R.id.flelec);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 350, 550, 550, 350);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520, 520, 660, 660);
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