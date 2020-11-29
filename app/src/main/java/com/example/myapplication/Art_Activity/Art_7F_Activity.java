package com.example.myapplication.Art_Activity;

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


public class Art_7F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;

    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_7f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.fl1);
        Art_7F_Activity.FL1View fl1view = new Art_7F_Activity.FL1View(fl1.getContext());
        fl1.addView(fl1view);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.fl2);
        Art_7F_Activity.FL2View fl2view = new Art_7F_Activity.FL2View(fl2.getContext());
        fl2.addView(fl2view);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.fl3);
        Art_7F_Activity.FL3View fl3view = new Art_7F_Activity.FL3View(fl3.getContext());
        fl3.addView(fl3view);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.fl4);
        Art_7F_Activity.FL4View fl4view = new Art_7F_Activity.FL4View(fl4.getContext());
        fl4.addView(fl4view);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.fl5);
        Art_7F_Activity.FL5View fl5view = new Art_7F_Activity.FL5View(fl5.getContext());
        fl5.addView(fl5view);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.fl6);
        Art_7F_Activity.FL6View fl6view = new Art_7F_Activity.FL6View(fl6.getContext());
        fl6.addView(fl6view);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.fl7);
        Art_7F_Activity.FL7View fl7view = new Art_7F_Activity.FL7View(fl7.getContext());
        fl7.addView(fl7view);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout) findViewById(R.id.fl8);
        Art_7F_Activity.FL8View fl8view = new Art_7F_Activity.FL8View(fl8.getContext());
        fl8.addView(fl8view);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout) findViewById(R.id.fl9);
        Art_7F_Activity.FL9View fl9view = new Art_7F_Activity.FL9View(fl9.getContext());
        fl9.addView(fl9view);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10 = (FrameLayout) findViewById(R.id.fl10);
        Art_7F_Activity.FL10View fl10view = new Art_7F_Activity.FL10View(fl10.getContext());
        fl10.addView(fl10view);
        fl10.setVisibility(View.GONE);

        final FrameLayout fl11 = (FrameLayout) findViewById(R.id.fl11);
        Art_7F_Activity.FL11View fl11view = new Art_7F_Activity.FL11View(fl11.getContext());
        fl11.addView(fl11view);
        fl11.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout) findViewById(R.id.fl12);
        Art_7F_Activity.FL12View fl12view = new Art_7F_Activity.FL12View(fl12.getContext());
        fl12.addView(fl12view);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout) findViewById(R.id.fl13);
        Art_7F_Activity.FL13View fl13view = new Art_7F_Activity.FL13View(fl13.getContext());
        fl13.addView(fl13view);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout) findViewById(R.id.fl14);
        Art_7F_Activity.FL14View fl14view = new Art_7F_Activity.FL14View(fl14.getContext());
        fl14.addView(fl14view);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout) findViewById(R.id.fl15);
        Art_7F_Activity.FL15View fl15view = new Art_7F_Activity.FL15View(fl15.getContext());
        fl15.addView(fl15view);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        Art_7F_Activity.FL16View fl16view = new Art_7F_Activity.FL16View(fl16.getContext());
        fl16.addView(fl16view);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        Art_7F_Activity.FL17View fl17view = new Art_7F_Activity.FL17View(fl17.getContext());
        fl17.addView(fl17view);
        fl17.setVisibility(View.GONE);

        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        Art_7F_Activity.FL18View fl18view = new Art_7F_Activity.FL18View(fl18.getContext());
        fl18.addView(fl18view);
        fl18.setVisibility(View.GONE);

        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        Art_7F_Activity.FL19View fl19view = new Art_7F_Activity.FL19View(fl19.getContext());
        fl19.addView(fl19view);
        fl19.setVisibility(View.GONE);

        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        Art_7F_Activity.FL20View fl20view = new Art_7F_Activity.FL20View(fl20.getContext());
        fl20.addView(fl20view);
        fl20.setVisibility(View.GONE);

        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        Art_7F_Activity.FL21View fl21view = new Art_7F_Activity.FL21View(fl21.getContext());
        fl21.addView(fl21view);
        fl21.setVisibility(View.GONE);

        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        Art_7F_Activity.FL22View fl22view = new Art_7F_Activity.FL22View(fl22.getContext());
        fl22.addView(fl22view);
        fl22.setVisibility(View.GONE);

        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        Art_7F_Activity.FL23View fl23view = new Art_7F_Activity.FL23View(fl23.getContext());
        fl23.addView(fl23view);
        fl23.setVisibility(View.GONE);

        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        Art_7F_Activity.FL24View fl24view = new Art_7F_Activity.FL24View(fl24.getContext());
        fl24.addView(fl24view);
        fl24.setVisibility(View.GONE);

        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        Art_7F_Activity.FL25View fl25view = new Art_7F_Activity.FL25View(fl25.getContext());
        fl25.addView(fl25view);
        fl25.setVisibility(View.GONE);

        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        Art_7F_Activity.FL26View fl26view = new Art_7F_Activity.FL26View(fl26.getContext());
        fl26.addView(fl26view);
        fl26.setVisibility(View.GONE);

        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        Art_7F_Activity.FL27View fl27view = new Art_7F_Activity.FL27View(fl27.getContext());
        fl27.addView(fl27view);
        fl27.setVisibility(View.GONE);

        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        Art_7F_Activity.finalView finalview = new Art_7F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);

        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(Art_7F_Activity.this, "모든 대피로", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Art_7F_Activity.this, "경로 리셋", Toast.LENGTH_SHORT).show();
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

        moving_701();
        moving_702();
        moving_703();
        moving_704();
        moving_705();
        moving_706();
        moving_707();
        moving_708();
        moving_709();
        moving_710();
        moving_711();
        moving_712();
        moving_713();
        moving_714();
        moving_715();
        moving_716();
        moving_717();
        moving_718();
        moving_719();
        moving_720();
        moving_721();
        moving_722();
        moving_723();
        moving_724();
        moving_725();
        moving_726();
        moving_727();

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
            path.moveTo(530, 590);
            path.lineTo(530, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(430, 590);
            path.lineTo(430, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(330, 590);
            path.lineTo(330, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 695);
            path.lineTo(770, 695);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(180, 750);
            path.lineTo(230, 750);
            path.lineTo(230, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(770, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(180, 650);
            path.lineTo(230, 650);
            path.lineTo(230, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(770, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(180, 560);
            path.lineTo(200, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090")); MyPaint.setColor(Color.GREEN);

            Path path = new Path();
            path.moveTo(200, 540);
            path.lineTo(200, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(300, 540);
            path.lineTo(300, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(400, 540);
            path.lineTo(400, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(500, 540);
            path.lineTo(500, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(600, 540);
            path.lineTo(600, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);

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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(700, 540);
            path.lineTo(700, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(800, 540);
            path.lineTo(800, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(900, 540);
            path.lineTo(900, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);
            path.lineTo(780, 705);
            path.lineTo(820, 705);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1030, 540);
            path.lineTo(1030, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1130, 540);
            path.lineTo(1130, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1230, 540);
            path.lineTo(1230, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1330, 540);
            path.lineTo(1330, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 620);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));
            Path path = new Path();
            path.moveTo(1430, 540);
            path.lineTo(1430, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 620);
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
            MyPaint.setARGB(255, 0, 0, 0);
            MyPaint.setPathEffect(new DashPathEffect(new float[]{10,10}, 0));
            MyPaint.setStrokeWidth(6f);
            MyPaint.setStyle(Paint.Style.STROKE);
            MyPaint.setColor(Color.parseColor("#FF9090"));

            Path path = new Path();
            path.moveTo(1580, 540);
            path.lineTo(1580, 560);
            path.lineTo(1350, 560);
            path.lineTo(1350, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL21View extends View {
        public FL21View(Context context) {
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
            path.moveTo(1680, 540);
            path.lineTo(1680, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 610);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL22View extends View {
        public FL22View(Context context) {
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
            path.moveTo(1780, 540);
            path.lineTo(1780, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL23View extends View {
        public FL23View(Context context) {
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
            path.moveTo(1760, 590);
            path.lineTo(1760, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL24View extends View {
        public FL24View(Context context) {
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
            path.moveTo(1630, 610);
            path.lineTo(1630, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL25View extends View {
        public FL25View(Context context) {
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
            path.moveTo(1560, 590);
            path.lineTo(1560, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL26View extends View {
        public FL26View(Context context) {
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
            path.moveTo(1370, 805);
            path.lineTo(1300, 805);
            path.lineTo(1300, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
            canvas.drawPath(path, MyPaint);
        }
    }

    public class FL27View extends View {
        public FL27View(Context context) {
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
            path.moveTo(1030, 590);
            path.lineTo(1030, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);
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
            path.moveTo(250, 800);
            path.lineTo(250, 560);
            path.lineTo(750, 560);
            path.lineTo(750, 705);

            path.lineTo(750, 560);
            path.lineTo(1370, 560);
            path.lineTo(1370, 600);

            path.lineTo(1370, 560);
            path.lineTo(1800, 560);
            canvas.drawPath(path, MyPaint);
        }
    }

    // 701호에서 최단거리 이동
    private void moving_701() {
        final Button b = (Button) findViewById(R.id.a_701);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 580,580,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 702호에서 최단거리 이동
    private void moving_702() {
        final Button b = (Button) findViewById(R.id.a_702);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 480,480,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 703호에서 최단거리 이동
    private void moving_703() {
        final Button b = (Button) findViewById(R.id.a_703);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 380,380,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    // 704호에서 최단거리 이동
    private void moving_704() {
        final Button b = (Button) findViewById(R.id.a_704);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 700,700,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 705호에서 최단거리 이동
    private void moving_705() {
        final Button b = (Button) findViewById(R.id.a_705);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 600,600,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 706호에서 최단거리 이동
    private void moving_706() {
        final Button b = (Button) findViewById(R.id.a_706);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 230,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 707호에서 최단거리 이동
    private void moving_707() {
        final Button b = (Button) findViewById(R.id.a_707);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 250,250,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 708호에서 최단거리 이동
    private void moving_708() {
        final Button b = (Button) findViewById(R.id.a_708);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 350,350,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
                animation3.setDuration(1800);
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 709호에서 최단거리 이동
    private void moving_709() {
        final Button b = (Button) findViewById(R.id.a_709);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 450,450,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 710호에서 최단거리 이동
    private void moving_710() {
        final Button b = (Button) findViewById(R.id.a_710);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 550,550,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 711호에서 최단거리 이동
    private void moving_711() {
        final Button b = (Button) findViewById(R.id.a_711);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 650,650,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 712호에서 최단거리 이동
    private void moving_712() {
        final Button b = (Button) findViewById(R.id.a_712);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 750,750,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 713호에서 최단거리 이동
    private void moving_713() {
        final Button b = (Button) findViewById(R.id.a_713);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 850,850,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 714호에서 최단거리 이동
    private void moving_714() {
        final Button b = (Button) findViewById(R.id.a_714);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 950,950,800,800,820); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,655,655); //y 좌표
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
                fl14.setVisibility(View.VISIBLE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 715호에서 최단거리 이동
    private void moving_715() {
        final Button b = (Button) findViewById(R.id.a_715);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl15.setVisibility(View.VISIBLE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 716호에서 최단거리 이동
    private void moving_716() {
        final Button b = (Button) findViewById(R.id.a_716);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1180,1180,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl16.setVisibility(View.VISIBLE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                fl19.setVisibility(View.GONE);
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 717호에서 최단거리 이동
    private void moving_717() {
        final Button b = (Button) findViewById(R.id.a_717);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1280,1280,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 718호에서 최단거리 이동
    private void moving_718() {
        final Button b = (Button) findViewById(R.id.a_718);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1380,1380,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 719호에서 최단거리 이동
    private void moving_719() {
        final Button b = (Button) findViewById(R.id.a_719);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1480,1480,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 720호에서 최단거리 이동
    private void moving_720() {
        final Button b = (Button) findViewById(R.id.a_720);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1580,1580,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 721호에서 최단거리 이동
    private void moving_721() {
        final Button b = (Button) findViewById(R.id.a_721);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1680,1680,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.VISIBLE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 722호에서 최단거리 이동
    private void moving_722() {
        final Button b = (Button) findViewById(R.id.a_722);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1780,1780,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.VISIBLE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 723호에서 최단거리 이동
    private void moving_723() {
        final Button b = (Button) findViewById(R.id.a_723);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1780,1780,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.VISIBLE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 724호에서 최단거리 이동
    private void moving_724() {
        final Button b = (Button) findViewById(R.id.a_724);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1680,1680,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.VISIBLE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 725호에서 최단거리 이동
    private void moving_725() {
        final Button b = (Button) findViewById(R.id.a_725);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1580,1580,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.VISIBLE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 726호에서 최단거리 이동
    private void moving_726() {
        final Button b = (Button) findViewById(R.id.a_726);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1420,1300,1300,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 755,755,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.VISIBLE);
                fl27.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);


            }
        });
    }

    // 727호에서 최단거리 이동
    private void moving_727() {
        final Button b = (Button) findViewById(R.id.a_727);
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
        final FrameLayout fl16 = (FrameLayout) findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout) findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout) findViewById(R.id.fl18);
        final FrameLayout fl19 = (FrameLayout) findViewById(R.id.fl19);
        final FrameLayout fl20 = (FrameLayout) findViewById(R.id.fl20);
        final FrameLayout fl21 = (FrameLayout) findViewById(R.id.fl21);
        final FrameLayout fl22 = (FrameLayout) findViewById(R.id.fl22);
        final FrameLayout fl23 = (FrameLayout) findViewById(R.id.fl23);
        final FrameLayout fl24 = (FrameLayout) findViewById(R.id.fl24);
        final FrameLayout fl25 = (FrameLayout) findViewById(R.id.fl25);
        final FrameLayout fl26 = (FrameLayout) findViewById(R.id.fl26);
        final FrameLayout fl27 = (FrameLayout) findViewById(R.id.fl27);
        final FrameLayout flf = (FrameLayout) findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080,1080,1420,1420); //x 좌표
                animation1.setDuration(1800);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 540,510,510,540); //y 좌표
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
                fl20.setVisibility(View.GONE);
                fl21.setVisibility(View.GONE);
                fl22.setVisibility(View.GONE);
                fl23.setVisibility(View.GONE);
                fl24.setVisibility(View.GONE);
                fl25.setVisibility(View.GONE);
                fl26.setVisibility(View.GONE);
                fl27.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);


            }
        });
    }

}

