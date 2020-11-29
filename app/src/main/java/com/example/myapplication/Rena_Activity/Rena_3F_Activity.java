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

public class Rena_3F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rena_3f);
        textview=findViewById(R.id.textView6);

        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        myView1 mview1= new myView1(fl1.getContext());
        fl1.addView(mview1);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        myView2 mview2= new myView2(fl2.getContext());
        fl2.addView(mview2);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl3 = (FrameLayout)findViewById(R.id.fl3);
        myView3 mview3= new myView3(fl3.getContext());
        fl3.addView(mview3);
        fl3.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        myView4 mview4= new myView4(fl4.getContext());
        fl4.addView(mview4);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        myView5 mview5= new myView5(fl5.getContext());
        fl5.addView(mview5);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        myView6 mview6= new myView6(fl6.getContext());
        fl6.addView(mview6);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        myView7 mview7= new myView7(fl7.getContext());
        fl7.addView(mview7);
        fl7.setVisibility(View.GONE);

        final FrameLayout fl8 = (FrameLayout)findViewById(R.id.fl8);
        myView8 mview8= new myView8(fl8.getContext());
        fl8.addView(mview8);
        fl8.setVisibility(View.GONE);

        final FrameLayout fl9 = (FrameLayout)findViewById(R.id.fl9);
        myView9 mview9= new myView9(fl9.getContext());
        fl9.addView(mview9);
        fl9.setVisibility(View.GONE);

        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        myView10A mview10A = new myView10A(fl10A.getContext());
        fl10A.addView(mview10A);
        fl10A.setVisibility(View.GONE);

        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        myView10B mview10B = new myView10B(fl10B.getContext());
        fl10B.addView(mview10B);
        fl10B.setVisibility(View.GONE);

        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        myView10C mview10C = new myView10C(fl10C.getContext());
        fl10C.addView(mview10C);
        fl10C.setVisibility(View.GONE);

        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        myView10D mview10D = new myView10D(fl10D.getContext());
        fl10D.addView(mview10D);
        fl10D.setVisibility(View.GONE);

        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        myView10E mview10E = new myView10E(fl10E.getContext());
        fl10E.addView(mview10E);
        fl10E.setVisibility(View.GONE);

        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        myView11A mview11A = new myView11A(fl11A.getContext());
        fl11A.addView(mview11A);
        fl11A.setVisibility(View.GONE);

        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        myView11B mview11B = new myView11B(fl11B.getContext());
        fl11B.addView(mview11B);
        fl11B.setVisibility(View.GONE);

        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        myView11C mview11C = new myView11C(fl11C.getContext());
        fl11C.addView(mview11C);
        fl11C.setVisibility(View.GONE);

        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        myView11D mview11D= new myView11D(fl11D.getContext());
        fl11D.addView(mview11D);
        fl11D.setVisibility(View.GONE);

        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        myView11E mview11E = new myView11E(fl11E.getContext());
        fl11E.addView(mview11E);
        fl11E.setVisibility(View.GONE);

        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        myView12 mview12= new myView12(fl12.getContext());
        fl12.addView(mview12);
        fl12.setVisibility(View.GONE);

        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        myView13 mview13= new myView13(fl13.getContext());
        fl13.addView(mview13);
        fl13.setVisibility(View.GONE);

        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        myView14 mview14= new myView14(fl14.getContext());
        fl14.addView(mview14);
        fl14.setVisibility(View.GONE);

        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        myView15 mview15= new myView15(fl15.getContext());
        fl15.addView(mview15);
        fl15.setVisibility(View.GONE);

        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        myView16 mview16= new myView16(fl16.getContext());
        fl16.addView(mview16);
        fl16.setVisibility(View.GONE);

        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        myView17 mview17= new myView17(fl17.getContext());
        fl17.addView(mview17);
        fl17.setVisibility(View.GONE);

        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        myView18 mview18= new myView18(fl18.getContext());
        fl18.addView(mview18);
        fl18.setVisibility(View.GONE);

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
                    Toast.makeText(Rena_3F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
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
                    fl10A.setVisibility(View.INVISIBLE);
                    fl10B.setVisibility(View.INVISIBLE);
                    fl10C.setVisibility(View.INVISIBLE);
                    fl10D.setVisibility(View.INVISIBLE);
                    fl10E.setVisibility(View.INVISIBLE);
                    fl11A.setVisibility(View.INVISIBLE);
                    fl11B.setVisibility(View.INVISIBLE);
                    fl11C.setVisibility(View.INVISIBLE);
                    fl11D.setVisibility(View.INVISIBLE);
                    fl11E.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl16.setVisibility(View.INVISIBLE);
                    fl17.setVisibility(View.INVISIBLE);
                    fl18.setVisibility(View.INVISIBLE);
                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Rena_3F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
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
                    fl10A.setVisibility(View.INVISIBLE);
                    fl10B.setVisibility(View.INVISIBLE);
                    fl10C.setVisibility(View.INVISIBLE);
                    fl10D.setVisibility(View.INVISIBLE);
                    fl10E.setVisibility(View.INVISIBLE);
                    fl11A.setVisibility(View.INVISIBLE);
                    fl11B.setVisibility(View.INVISIBLE);
                    fl11C.setVisibility(View.INVISIBLE);
                    fl11D.setVisibility(View.INVISIBLE);
                    fl11E.setVisibility(View.INVISIBLE);
                    fl12.setVisibility(View.INVISIBLE);
                    fl13.setVisibility(View.INVISIBLE);
                    fl14.setVisibility(View.INVISIBLE);
                    fl15.setVisibility(View.INVISIBLE);
                    fl16.setVisibility(View.INVISIBLE);
                    fl17.setVisibility(View.INVISIBLE);
                    fl18.setVisibility(View.INVISIBLE);
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
        moving_304();
        moving_305();
        moving_306();
        moving_307();
        moving_308();
        moving_309();
        moving_310A();
        moving_310B();
        moving_310C();
        moving_310D();
        moving_310E();
        moving_311A();
        moving_311B();
        moving_311C();
        moving_311D();
        moving_311E();
        moving_312();
        moving_313();
        moving_314();
        moving_315();
        moving_316();
        moving_317();
        moving_318();

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
            path.moveTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

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
            path.moveTo(660,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }
    //303
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
            path.moveTo(860,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }
    //304
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
            path.moveTo(880,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }
    //305
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
            path.moveTo(1130,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }
    //306
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
            path.moveTo(1130,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //307
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
            path.moveTo(1400,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //308
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
            path.moveTo(1400,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //309
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
            path.moveTo(1630,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //310A
    public class myView10A extends View {
        public myView10A(Context context) {
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
            path.moveTo(1630,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //310B
    public class myView10B extends View {
        public myView10B(Context context) {
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
            path.moveTo(1380,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //310C
    public class myView10C extends View {
        public myView10C(Context context) {
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
            path.moveTo(1130,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //310D
    public class myView10D extends View {
        public myView10D(Context context) {
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
            path.moveTo(880,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //310E
    public class myView10E extends View {
        public myView10E(Context context) {
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
            path.moveTo(660,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            canvas.drawPath(path, MyPaint);
        }
    }

    //311A
    public class myView11A extends View {
        public myView11A(Context context) {
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
            path.moveTo(655,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //311B
    public class myView11B extends View {
        public myView11B(Context context) {
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
            path.moveTo(870,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //311C
    public class myView11C extends View {
        public myView11C(Context context) {
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
            path.moveTo(1110,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //311D
    public class myView11D extends View {
        public myView11D(Context context) {
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
            path.moveTo(1350,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //311E
    public class myView11E extends View {
        public myView11E(Context context) {
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
            path.moveTo(1550,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //312
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
            path.moveTo(1350,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //313
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
            path.moveTo(1180,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //314
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
            path.moveTo(1120,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //315
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
            path.moveTo(920,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //316
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
            path.moveTo(870,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //317
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
            path.moveTo(655,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            canvas.drawPath(path, MyPaint);
        }
    }

    //318
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
            path.moveTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

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
            path.moveTo(1500,360);
            path.lineTo(570,360);
            path.lineTo(570,330);
            path.lineTo(450,330);
            path.lineTo(450,230);

            path.moveTo(1650,755);
            path.lineTo(570,755);
            path.lineTo(570,590);
            path.lineTo(450,590);
            path.lineTo(450,665);
            path.lineTo(300,665);

            path.moveTo(570,590);
            path.lineTo(570,330);

            canvas.drawPath(path, MyPaint);
        }
    }

    // 301호에서 최단거리 이동
    private void moving_301() {
        final Button b = (Button) findViewById(R.id.r_301);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 520, 520, 400, 400, 250); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 705, 540, 540, 615, 615); //y 좌표
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //302호에서 최단거리 이동
    private void moving_302() {
        final Button b = (Button) findViewById(R.id.r_302);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  610, 520, 520, 400, 400, 250); //x 좌표
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615); //y 좌표
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //303호에서 최단거리 이동
    private void moving_303() {
        final Button b = (Button) findViewById(R.id.r_303);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  810, 520, 520, 400, 400, 250); //x 좌표
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615); //y 좌표
                animation3.setDuration(2100);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //304호에서 최단거리 이동
    private void moving_304() {
        final Button button = (Button) findViewById(R.id.r_304);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  830, 520, 520, 400, 400, 250);
                animation1.setDuration(2300);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
                animation3.setDuration(2300);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //305호에서 최단거리 이동
    private void moving_305() {
        final Button button = (Button) findViewById(R.id.r_305);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080, 520, 520, 400, 400, 250);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
                animation3.setDuration(2500);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //306호에서 최단거리 이동
    private void moving_306() {
        final Button button = (Button) findViewById(R.id.r_306);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1080, 520, 520, 400, 400, 250);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 705, 705, 540, 540, 615, 615);
                animation3.setDuration(2500);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }


    //307호에서 최단거리 이동
    private void moving_307() {
        final Button b = (Button) findViewById(R.id.r_307);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350, 520, 520, 400, 400, 250);
                animation1.setDuration(2700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 705, 705, 540, 540, 615, 615);
                animation3.setDuration(2700);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    // 308호에서 최단거리 이동
    private void moving_308() {
        final Button b = (Button) findViewById(R.id.r_308);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1350, 520, 520, 400, 400, 250);
                animation1.setDuration(2700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
                animation3.setDuration(2700);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    // 309호에서 최단거리 이동
    private void moving_309() {
        final Button b = (Button) findViewById(R.id.r_309);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1580, 520, 520, 400, 400, 250);
                animation1.setDuration(2900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
                animation3.setDuration(2900);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //310A에서 최단거리 이동
    private void moving_310A() {
        final Button button = (Button) findViewById(R.id.r_310a);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1580, 520, 520, 400, 400, 250); //x 좌표
                animation1.setDuration(2900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615); //y 좌표
                animation3.setDuration(2900);
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
                fl10A.setVisibility(View.VISIBLE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //310B호에서 최단거리 이동
    private void moving_310B() {
        final Button button = (Button) findViewById(R.id.r_310b);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1330, 520, 520, 400, 400, 250); //x 좌표
                animation1.setDuration(2700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615); //y 좌표
                animation3.setDuration(2700);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.VISIBLE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }
    //310C호에서 최단거리 이동
    private void moving_310C() {
        final Button button = (Button) findViewById(R.id.r_310c);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1080, 520, 520, 400, 400, 250);
                animation1.setDuration(2500);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.VISIBLE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }
    //310D호에서 최단거리 이동
    private void moving_310D() {
        final Button button = (Button) findViewById(R.id.r_310d);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  830, 520, 520, 400, 400, 250);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
                animation3.setDuration(2100);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.VISIBLE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //310E호에서 최단거리 이동
    private void moving_310E() {
        final Button button = (Button) findViewById(R.id.r_310e);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  610, 520, 520, 400, 400, 250);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  705, 705, 540, 540, 615, 615);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.VISIBLE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //311A호에서 최단거리 이동
    private void moving_311A() {
        final Button button = (Button) findViewById(R.id.r_311a);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  605, 520, 520, 400, 400);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.VISIBLE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //311B호에서 최단거리 이동
    private void moving_311B() {
        final Button button = (Button) findViewById(R.id.r_311b);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  820, 520, 520, 400, 400);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
                animation3.setDuration(2100);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.VISIBLE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //311C호에서 최단거리 이동
    private void moving_311C() {
        final Button button = (Button) findViewById(R.id.r_311c);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1060, 520, 520, 400, 400);
                animation1.setDuration(2400);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
                animation3.setDuration(2400);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.VISIBLE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //311D호에서 최단거리 이동
    private void moving_311D() {
        final Button button = (Button) findViewById(R.id.r_311d);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1300, 520, 520, 400, 400);
                animation1.setDuration(2700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
                animation3.setDuration(2700);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.VISIBLE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //311E호에서 최단거리 이동
    private void moving_311E() {
        final Button button = (Button) findViewById(R.id.r_311e);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1500, 520, 520, 400, 400);
                animation1.setDuration(2900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
                animation3.setDuration(2900);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.VISIBLE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);
            }
        });
    }

    //312호에서 최단거리 이동
    private void moving_312() {
        final Button button = (Button) findViewById(R.id.r_312);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1300, 520, 520, 400, 400);
                animation1.setDuration(2700);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  310, 310, 280, 280, 180);
                animation3.setDuration(2700);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.VISIBLE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //313호에서 최단거리 이동
    private void moving_313() {
        final Button button = (Button) findViewById(R.id.r_313);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1130, 520, 520, 400, 400);
                animation1.setDuration(2400);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   310, 310, 280, 280, 180);
                animation3.setDuration(2400);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.VISIBLE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //314호에서 최단거리 이동
    private void moving_314() {
        final Button button = (Button) findViewById(R.id.r_314);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  1070, 520, 520, 400, 400);
                animation1.setDuration(2400);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   310, 310, 280, 280, 180);
                animation3.setDuration(2400);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.VISIBLE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //315호에서 최단거리 이동
    private void moving_315() {
        final Button button = (Button) findViewById(R.id.r_315);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  870, 520, 520, 400, 400);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   310, 310, 280, 280, 180);
                animation3.setDuration(2100);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.VISIBLE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //316호에서 최단거리 이동
    private void moving_316() {
        final Button button = (Button) findViewById(R.id.r_316);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  820, 520, 520, 400, 400);
                animation1.setDuration(2100);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   310, 310, 280, 280, 180);
                animation3.setDuration(2100);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.VISIBLE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //317호에서 최단거리 이동
    private void moving_317() {
        final Button button = (Button) findViewById(R.id.r_317);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  605, 520, 520, 400, 400);
                animation1.setDuration(1900);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   310, 310, 280, 280, 180);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.VISIBLE);
                fl18.setVisibility(View.GONE);
                flf.setVisibility(View.GONE);

            }
        });
    }

    //318호에서 최단거리 이동
    private void moving_318() {
        final Button button = (Button) findViewById(R.id.r_318);
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
        final FrameLayout fl10A = (FrameLayout)findViewById(R.id.fl10A);
        final FrameLayout fl10B = (FrameLayout)findViewById(R.id.fl10B);
        final FrameLayout fl10C = (FrameLayout)findViewById(R.id.fl10C);
        final FrameLayout fl10D = (FrameLayout)findViewById(R.id.fl10D);
        final FrameLayout fl10E = (FrameLayout)findViewById(R.id.fl10E);
        final FrameLayout fl11A = (FrameLayout)findViewById(R.id.fl11A);
        final FrameLayout fl11B = (FrameLayout)findViewById(R.id.fl11B);
        final FrameLayout fl11C = (FrameLayout)findViewById(R.id.fl11C);
        final FrameLayout fl11D = (FrameLayout)findViewById(R.id.fl11D);
        final FrameLayout fl11E = (FrameLayout)findViewById(R.id.fl11E);
        final FrameLayout fl12 = (FrameLayout)findViewById(R.id.fl12);
        final FrameLayout fl13 = (FrameLayout)findViewById(R.id.fl13);
        final FrameLayout fl14 = (FrameLayout)findViewById(R.id.fl14);
        final FrameLayout fl15 = (FrameLayout)findViewById(R.id.fl15);
        final FrameLayout fl16 = (FrameLayout)findViewById(R.id.fl16);
        final FrameLayout fl17 = (FrameLayout)findViewById(R.id.fl17);
        final FrameLayout fl18 = (FrameLayout)findViewById(R.id.fl18);
        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  520, 400, 400);
                animation1.setDuration(1600);
                animation1.start();

                ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",   280, 280, 180);
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
                fl10A.setVisibility(View.GONE);
                fl10B.setVisibility(View.GONE);
                fl10C.setVisibility(View.GONE);
                fl10D.setVisibility(View.GONE);
                fl10E.setVisibility(View.GONE);
                fl11A.setVisibility(View.GONE);
                fl11B.setVisibility(View.GONE);
                fl11C.setVisibility(View.GONE);
                fl11D.setVisibility(View.GONE);
                fl11E.setVisibility(View.GONE);
                fl12.setVisibility(View.GONE);
                fl13.setVisibility(View.GONE);
                fl14.setVisibility(View.GONE);
                fl15.setVisibility(View.GONE);
                fl16.setVisibility(View.GONE);
                fl17.setVisibility(View.GONE);
                fl18.setVisibility(View.VISIBLE);
                flf.setVisibility(View.GONE);

            }
        });
    }
}
