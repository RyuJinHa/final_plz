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


public class Music_2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    SwitchButton switchButton;
    SharedPreferences.Editor prefEditor;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_2f);
        textview=findViewById(R.id.textView6);



        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        Music_2F_Activity.myView mview= new Music_2F_Activity.myView(fl1.getContext());
        fl1.addView(mview);
        fl1.setVisibility(View.GONE);

        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        Music_2F_Activity.myyView mmview= new Music_2F_Activity.myyView(fl2.getContext());
        fl2.addView(mmview);
        fl2.setVisibility(View.GONE);

        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        Music_2F_Activity.myyyView mmmview= new Music_2F_Activity.myyyView(fl4.getContext());
        fl4.addView(mmmview);
        fl4.setVisibility(View.GONE);

        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        Music_2F_Activity.myyyyView mmmmview= new Music_2F_Activity.myyyyView(fl5.getContext());
        fl5.addView(mmmmview);
        fl5.setVisibility(View.GONE);

        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        Music_2F_Activity.nyView nview= new Music_2F_Activity.nyView(fl6.getContext());
        fl6.addView(nview);
        fl6.setVisibility(View.GONE);

        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);
        Music_2F_Activity.nyyView nnview= new Music_2F_Activity.nyyView(fl7.getContext());
        fl7.addView(nnview);
        fl7.setVisibility(View.GONE);


        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        Music_2F_Activity.finalView finalview= new Music_2F_Activity.finalView(flf.getContext());
        flf.addView(finalview);
        flf.setVisibility(View.GONE);



        switchButton = findViewById(R.id.sb);
        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                if(isChecked) {
                    Toast.makeText(Music_2F_Activity.this,"모든 대피로", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "yes");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);

                    flf.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(Music_2F_Activity.this,"경로 리셋", Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked", "false");
                    prefEditor.apply();

                    fl1.setVisibility(View.INVISIBLE);
                    fl2.setVisibility(View.INVISIBLE);
                    fl4.setVisibility(View.INVISIBLE);
                    fl5.setVisibility(View.INVISIBLE);
                    fl6.setVisibility(View.INVISIBLE);
                    fl7.setVisibility(View.INVISIBLE);

                    flf.setVisibility(View.INVISIBLE);
                }
            }
        });

        if(prefs.getString("checked", "no").equals("yes")) {
            switchButton.setChecked(true);
        } else {
            switchButton.setChecked(false);
        }
        moving_201();
        moving_202();
        moving_203();
        moving_204();
        moving_205();
        moving_206();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    //201
    public class myView extends View {
        public myView(Context context) {
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
            path.moveTo(440,570);
            path.lineTo(440,490);
            path.lineTo(830,490);
            path.lineTo(830,670);

            canvas.drawPath(path, MyPaint);
        }
    }

    //202
    public class myyView extends View {
        public myyView(Context context) {
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
            path.moveTo(440,410);
            path.lineTo(440,490);
            path.lineTo(830,490);
            path.lineTo(830,670);

            canvas.drawPath(path, MyPaint);
        }
    }
    //203
    public class myyyView extends View {
        public myyyView(Context context) {
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
            path.moveTo(740,410);
            path.lineTo(740,490);
            path.lineTo(830,490);
            path.lineTo(830,670);

            canvas.drawPath(path, MyPaint);
        }
    }
    //204
    public class myyyyView extends View {
        public myyyyView(Context context) {
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
            path.moveTo(1540,480);
            path.lineTo(1540,560);
            path.lineTo(1740,560);
            path.lineTo(1740,440);

            canvas.drawPath(path, MyPaint);
        }
    }
    //205
    public class nyView extends View {
        public nyView(Context context) {
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
            path.moveTo(1340,640);
            path.lineTo(1340,560);
            path.lineTo(1740,560);
            path.lineTo(1740,460);


            canvas.drawPath(path, MyPaint);
        }
    }
    //로비
    public class nyyView extends View {
        public nyyView(Context context) {
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
            path.moveTo(1070,410);
            path.lineTo(1070,490);
            path.lineTo(830,490);
            path.lineTo(830,675);


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
            path.moveTo(440,490);
            path.lineTo(740,490);
            path.lineTo(830,490);
            path.lineTo(830,670);

            path.moveTo(1070,490);
            path.lineTo(830,490);

            path.moveTo(1070,490);
            path.lineTo(1140,490);
            path.lineTo(1140,560);
            path.lineTo(1340,560);


            path.moveTo(1340,560);
            path.lineTo(1740,560);
            path.lineTo(1740,460);



            canvas.drawPath(path, MyPaint);
        }
    }

    // 201호에서 최단거리 이동
    private void moving_201() {
        final Button b = (Button) findViewById(R.id.m_201);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,790,790); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();
                fl1.setVisibility(View.VISIBLE);
                fl2.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }

    // 202호에서 최단거리 이동
    private void moving_202() {
        final Button b = (Button) findViewById(R.id.m_202);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 400,790,790); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.VISIBLE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }

    // 203호에서 최단거리 이동
    private void moving_203() {
        final Button b = (Button) findViewById(R.id.m_203);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 700,790,790); //x 좌표
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635); //y 좌표
                        animation3.setDuration(1500);
                        animation3.start();

                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl4.setVisibility(View.VISIBLE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }

    //204호에서 최단거리 이동
    private void moving_204() {
        final Button button = (Button) findViewById(R.id.m_204);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1700, 1700);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 520,520, 400);
                        animation3.setDuration(1500);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.VISIBLE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);

            }
        });
    }

    //205호에서 최단거리 이동
    private void moving_205() {
        final Button button = (Button) findViewById(R.id.m_205);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1300, 1700, 1700);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  520,520, 400);
                        animation3.setDuration(1800);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.VISIBLE);
                fl7.setVisibility(View.GONE);

                flf.setVisibility(View.GONE);


            }
        });
    }

    //206호에서 최단거리 이동
    private void moving_206() {
        final Button button = (Button) findViewById(R.id.m_206);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        final FrameLayout fl1 = (FrameLayout)findViewById(R.id.fl1);
        final FrameLayout fl2 = (FrameLayout)findViewById(R.id.fl2);
        final FrameLayout fl4 = (FrameLayout)findViewById(R.id.fl4);
        final FrameLayout fl5 = (FrameLayout)findViewById(R.id.fl5);
        final FrameLayout fl6 = (FrameLayout)findViewById(R.id.fl6);
        final FrameLayout fl7 = (FrameLayout)findViewById(R.id.fl7);

        final FrameLayout flf = (FrameLayout)findViewById(R.id.flf);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1030, 790, 790);
                        animation1.setDuration(1500);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 450,450,635);
                        animation3.setDuration(1500);
                        animation3.start();
                fl1.setVisibility(View.GONE);
                fl2.setVisibility(View.GONE);
                fl4.setVisibility(View.GONE);
                fl5.setVisibility(View.GONE);
                fl6.setVisibility(View.GONE);
                fl7.setVisibility(View.VISIBLE);

                flf.setVisibility(View.GONE);


            }
        });
    }
}