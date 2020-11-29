package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myapplication.Art_Activity.Art_1F_Activity;
import com.example.myapplication.Art_Activity.Art_2F_Activity;
import com.example.myapplication.Art_Activity.Art_3F_Activity;
import com.example.myapplication.Art_Activity.Art_4F_Activity;
import com.example.myapplication.Art_Activity.Art_5F_Activity;
import com.example.myapplication.Art_Activity.Art_6F_Activity;
import com.example.myapplication.Art_Activity.Art_7F_Activity;
import com.example.myapplication.Baek_Activity.Baek_1F_Activity;
import com.example.myapplication.Baek_Activity.Baek_2F_Activity;
import com.example.myapplication.Baek_Activity.Baek_3F_Activity;
import com.example.myapplication.Baek_Activity.Baek_4F_Activity;
import com.example.myapplication.Baek_Activity.Baek_5F_Activity;
import com.example.myapplication.Baek_Activity.Baek_6F_Activity;
import com.example.myapplication.Baek_Activity.Baek_7F_Activity;
import com.example.myapplication.Library_Activity.Library_1F_Activity;
import com.example.myapplication.Library_Activity.Library_2F_Activity;
import com.example.myapplication.Library_Activity.Library_3F_Activity;
import com.example.myapplication.Library_Activity.Library_4F_Activity;
import com.example.myapplication.Library_Activity.Library_5F_Activity;
import com.example.myapplication.Library_Activity.Library_6F_Activity;
import com.example.myapplication.Med_Activity.Med_1F_Activity;
import com.example.myapplication.Med_Activity.Med_2F_Activity;
import com.example.myapplication.Med_Activity.Med_3F_Activity;
import com.example.myapplication.Med_Activity.Med_4F_Activity;
import com.example.myapplication.Med_Activity.Med_5F_Activity;
import com.example.myapplication.Med_Activity.Med_6F_Activity;
import com.example.myapplication.Med_Activity.Med_7F_Activity;
import com.example.myapplication.Music_Activity.Music_1F_Activity;
import com.example.myapplication.Music_Activity.Music_2F_Activity;
import com.example.myapplication.Music_Activity.Music_3F_Activity;
import com.example.myapplication.Music_Activity.Music_4F_Activity;
import com.example.myapplication.Music_Activity.Music_5F_Activity;
import com.example.myapplication.Music_Activity.Music_6F_Activity;
import com.example.myapplication.Music_Activity.Music_7F_Activity;
import com.example.myapplication.Prime_Activity.Prime_1F_Activity;
import com.example.myapplication.Prime_Activity.Prime_2F_Activity;
import com.example.myapplication.Prime_Activity.Prime_3F_Activity;
import com.example.myapplication.Prime_Activity.Prime_B1F_Activity;
import com.example.myapplication.Prime_Activity.Prime_B2F_Activity;
import com.example.myapplication.Rena_Activity.Rena_1F_Activity;
import com.example.myapplication.Rena_Activity.Rena_2F_Activity;
import com.example.myapplication.Rena_Activity.Rena_3F_Activity;
import com.example.myapplication.Rena_Activity.Rena_4F_Activity;
import com.example.myapplication.Rena_Activity.Rena_5F_Activity;
import com.example.myapplication.Science_Activity.Science_1F_Activity;
import com.example.myapplication.Science_Activity.Science_2F_Activity;
import com.example.myapplication.Science_Activity.Science_3F_Activity;
import com.example.myapplication.Science_Activity.Science_4F_Activity;
import com.example.myapplication.Science_Activity.Science_5F_Activity;
import com.example.myapplication.Science_Activity.Science_6F_Activity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    LinearLayout layout_1;
    LinearLayout layout_bottom;
    LinearLayout menu_1;
    LinearLayout menu_2;
    LinearLayout menu_3;
    LinearLayout menu_4;
    LinearLayout button;

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    private DrawerLayout drawerLayout;
    private View drawerView;

    private long backKeyPressedTime = 0;
    private Toast toast;

    private Geocoder geocoder;
    private EditText editText;
    private GoogleMap mMap;

    int temp;
    int temp1;
    int temp2;
    int temp3;
    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//세로 화면 고정


        editText = (EditText) findViewById(R.id.editText);
        button=(LinearLayout) findViewById(R.id.button);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mMap);
        mapFragment.getMapAsync(this);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        //메뉴 소환 버튼
        layout_1 = findViewById(R.id.layout_1);
        layout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });

        //비상시 대피요령
        menu_1 = findViewById(R.id.menu_1);
        menu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KnowHowActivity.class);
                startActivity(intent);
            }
        });

        //알림
        menu_2 = findViewById(R.id.menu_2);
        menu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
            }
        });

        //전화걸기
        menu_3 = findViewById(R.id.menu_3);
        menu_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:119"));
                startActivity(intent);
            }
        });

        //생활안전
        menu_4 = findViewById(R.id.menu_4);
        menu_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Emergency.class);
                startActivity(intent);
            }
        });

        layout_bottom = findViewById(R.id.layout_bottom);
        layout_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("정말로 종료하시겠습니까?");
                builder.setTitle("종료 알림창")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {

        }

        @Override
        public void onDrawerStateChanged(int newState) {

        }
    };

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast = Toast.makeText(this, "\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            finish();
            toast.cancel();
        }
    }

        @Override
        public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;
        geocoder = new Geocoder(this);

        LatLng location = new LatLng(37.545133, 126.964629);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("숙명여자대학교");
        markerOptions.snippet("대학교");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);

        MarkerOptions opt1_1 = new MarkerOptions();
        opt1_1.position(new LatLng(37.546432, 126.964717));
        opt1_1.title("순헌관");
        googleMap.addMarker(opt1_1);

        MarkerOptions opt1_2 = new MarkerOptions();
        opt1_2.position(new LatLng(37.546635, 126.965023));
        opt1_2.title("행파교수회관");
        googleMap.addMarker(opt1_2);

        MarkerOptions opt1_3 = new MarkerOptions();
        opt1_3.position(new LatLng(37.546663, 126.964339));
        opt1_3.title("수련교수회관");
        googleMap.addMarker(opt1_3);

        MarkerOptions opt1_4 = new MarkerOptions();
        opt1_4.position(new LatLng(37.546368, 126.963859));
        opt1_4.title("진리관");
        googleMap.addMarker(opt1_4);

        MarkerOptions opt1_5 = new MarkerOptions();
        opt1_5.position(new LatLng(37.545700, 126.963625));
        opt1_5.title("명신관");
        googleMap.addMarker(opt1_5);

        MarkerOptions opt1_6 = new MarkerOptions();
        opt1_6.position(new LatLng(37.545396, 126.963904));
        opt1_6.title("명신신관");
        googleMap.addMarker(opt1_6);

        MarkerOptions opt1_7 = new MarkerOptions();
        opt1_7.position(new LatLng(37.545414, 126.964545));
        opt1_7.title("행정관");
        googleMap.addMarker(opt1_7);

        MarkerOptions opt1_8 = new MarkerOptions();
        opt1_8.position(new LatLng(37.545459, 126.965055));
        opt1_8.title("학생회관");
        googleMap.addMarker(opt1_8);

        MarkerOptions opt1_9 = new MarkerOptions();
        opt1_9.position(new LatLng(37.545919, 126.965728));
        opt1_9.title("숙명여자대학교 대강당");
        googleMap.addMarker(opt1_9);

        MarkerOptions opt2_1 = new MarkerOptions();
        opt2_1.position(new LatLng(37.544687,126.964465));
        opt2_1.title("프라임관");
        googleMap.addMarker(opt2_1);

        MarkerOptions opt2_2 = new MarkerOptions();
        opt2_2.position(new LatLng(37.544760,126.964062));
        opt2_2.title("르네상스");
        googleMap.addMarker(opt2_2);

        MarkerOptions opt2_3= new MarkerOptions();
        opt2_3.position(new LatLng(37.544270,126.964023));
        opt2_3.title("음악대학");
        googleMap.addMarker(opt2_3);

        MarkerOptions opt2_4= new MarkerOptions();
        opt2_4.position(new LatLng(37.543811,126.963847));
        opt2_4.title("사회교육관");
        googleMap.addMarker(opt2_4);

        MarkerOptions opt2_5= new MarkerOptions();
        opt2_5.position(new LatLng(37.543856,126.964510));
        opt2_5.title("약학대학");
        googleMap.addMarker(opt2_5);

        MarkerOptions opt2_6= new MarkerOptions();
        opt2_6.position(new LatLng(37.544326,126.964906));
        opt2_6.title("미술대학");
        googleMap.addMarker(opt2_6);

        MarkerOptions opt2_7= new MarkerOptions();
        opt2_7.position(new LatLng(37.543775,126.965453));
        opt2_7.title("백주년기념관");
        googleMap.addMarker(opt2_7);

        MarkerOptions opt2_8= new MarkerOptions();
        opt2_8.position(new LatLng(37.544183,126.965894));
        opt2_8.title("중앙도서관");
        googleMap.addMarker(opt2_8);

        MarkerOptions opt2_9= new MarkerOptions();
        opt2_9.position(new LatLng(37.544598,126.966359));
        opt2_9.title("과학관");
        googleMap.addMarker(opt2_9);

        googleMap.setOnMarkerClickListener(this) ;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 17));



            // 버튼 이벤트
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                try {
                    // editText에 입력한 텍스트(주소, 지역, 장소 등)을 지오 코딩을 이용해 변환
                    List<Address> addressList = geocoder.getFromLocationName(
                            str, // 주소
                            10); // 최대 검색 결과 개수
                    System.out.println(addressList.get(0).toString());
                    // 콤마를 기준으로 split
                    String[] splitStr = addressList.get(0).toString().split(",");
                    String address = splitStr[0].substring(splitStr[0].indexOf("\"") + 1, splitStr[0].length() - 2); // 주소
                    System.out.println(address);

                    String latitude = splitStr[10].substring(splitStr[10].indexOf("=") + 1); // 위도
                    String longitude = splitStr[12].substring(splitStr[12].indexOf("=") + 1); // 경도
                    System.out.println(latitude);
                    System.out.println(longitude);

                    // 좌표(위도, 경도) 생성
                    LatLng point = new LatLng(Double.parseDouble(latitude), Double.parseDouble(longitude));
                    // 마커 생성
                    MarkerOptions mOptions2 = new MarkerOptions();
                    mOptions2.title("search result");
                    mOptions2.snippet(address);
                    mOptions2.position(point);
                    mOptions2.icon(BitmapDescriptorFactory.fromResource(R.drawable.mappin));
                    // 마커 추가
                    mMap.addMarker(mOptions2);
                    // 해당 좌표로 화면 줌
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point, 18));

                } catch (Exception e) {
                    new AlertDialog.Builder(MainActivity.this) // TestActivity 부분에는 현재 Activity의 이름 입력.
                            .setMessage("검색 결과가 없습니다")     // 제목 부분 (직접 작성)
                            .setPositiveButton("확인", new DialogInterface.OnClickListener(){      // 버튼1 (직접 작성)
                        public void onClick(DialogInterface dialog, int which){
                            Toast.makeText(getApplicationContext(), "다시 입력하세요", Toast.LENGTH_SHORT).show(); // 실행할 코드
                        }
                    })
                        .show();
                  }
            }
        });
    }


//마커 클릭하면 층수 선택하는 팝업창 생성
    @Override
    public boolean onMarkerClick(Marker marker) {
        final Context context = this;

        if(marker.isInfoWindowShown()) {
            marker.hideInfoWindow();
        } else {
            marker.showInfoWindow();
        }

        if (marker.getTitle().equals("프라임관")) {
            final CharSequence[] items = {"B2층", "B1층", "1층", "2층", "3층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[프라임관] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Prime_B2F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Prime_B1F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Prime_1F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Prime_2F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Prime_3F_Activity.class);
                            startActivity(intent4);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        else if (marker.getTitle().equals("음악대학")) {
            final CharSequence[] items = { "1층", "2층", "3층", "4층","5층", "6층", "7층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[음악대학] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp1){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Music_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Music_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Music_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Music_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Music_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Music_6F_Activity.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(MainActivity.this, Music_7F_Activity.class);
                            startActivity(intent6);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp1 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        else if (marker.getTitle().equals("미술대학")) {
            final CharSequence[] items = { "1층", "2층", "3층", "4층","5층", "6층", "7층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[미술대학] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp2){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Art_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Art_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Art_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Art_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Art_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Art_6F_Activity.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(MainActivity.this, Art_7F_Activity.class);
                            startActivity(intent6);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp2 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        else if(marker.getTitle().equals("백주년기념관")) {

            final CharSequence[] items = {"1층", "2층", "3층", "4층", "5층", "6층", "7층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[백주년기념관] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp3){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Baek_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Baek_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Baek_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Baek_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Baek_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Baek_6F_Activity.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(MainActivity.this, Baek_7F_Activity.class);
                            startActivity(intent6);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp3 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        else if (marker.getTitle().equals("중앙도서관")) {
            final CharSequence[] items = { "1층", "2층", "3층", "4층","5층", "6층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[중앙도서관] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp1){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Library_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Library_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Library_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Library_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Library_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Library_6F_Activity.class);
                            startActivity(intent5);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp1 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }


        else if (marker.getTitle().equals("르네상스")) {
            final CharSequence[] items = {"B2층", "B1층", "1층", "2층", "3층", "4층", "5층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

            alertDialogBuilder.setTitle("[르네상스] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp1){
                        case 0:
                            Intent intent5 = new Intent(MainActivity.this, Prime_B2F_Activity.class);
                            startActivity(intent5);
                            break;
                        case 1:
                            Intent intent6 = new Intent(MainActivity.this, Prime_B1F_Activity.class);
                            startActivity(intent6);
                            break;
                        case 2:
                            Intent intent = new Intent(MainActivity.this, Rena_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 3:
                            Intent intent1 = new Intent(MainActivity.this, Rena_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 4:
                            Intent intent2 = new Intent(MainActivity.this, Rena_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 5:
                            Intent intent3 = new Intent(MainActivity.this, Rena_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 6:
                            Intent intent4 = new Intent(MainActivity.this, Rena_5F_Activity.class);
                            startActivity(intent4);
                            break;
                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp1 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if (marker.getTitle().equals("약학대학")) {
            final CharSequence[] items = { "1층", "2층", "3층", "4층","5층", "6층", "7층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);


            alertDialogBuilder.setTitle("[약학대학] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp1){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Med_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Med_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Med_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Med_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Med_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Med_6F_Activity.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(MainActivity.this, Med_7F_Activity.class);
                            startActivity(intent6);
                            break;

                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp1 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

        else if (marker.getTitle().equals("과학관")) {
            final CharSequence[] items = { "1층", "2층", "3층", "4층","5층", "6층"};
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);



            alertDialogBuilder.setTitle("[과학관] 층을 선택하세요");
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (temp1){
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Science_1F_Activity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Science_2F_Activity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Science_3F_Activity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Science_4F_Activity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Science_5F_Activity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MainActivity.this, Science_6F_Activity.class);
                            startActivity(intent5);
                            break;


                    }
                    dialog.dismiss();
                }
            });

            alertDialogBuilder.setSingleChoiceItems(items, -1,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            temp1 = which;
                        }
                    });

            alertDialogBuilder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        return false;
    }


}
