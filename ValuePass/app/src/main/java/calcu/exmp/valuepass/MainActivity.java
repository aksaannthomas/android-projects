package calcu.exmp.valuepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNext(View v){
        Intent intent=new Intent("activity.sec");
        EditText e = (EditText)findViewById(R.id.et2);
        intent.putExtra("name",e.getText().toString());
        startActivity(intent);
    }
}