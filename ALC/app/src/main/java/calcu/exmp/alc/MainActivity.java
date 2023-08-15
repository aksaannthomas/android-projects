package calcu.exmp.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ALC","onCreate()");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("ALC","onStart()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("ALC","onStop()");

    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("ALC","onResume()");

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("ALC","onDestroy()");

    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("ALC","onPause()");

    }


}