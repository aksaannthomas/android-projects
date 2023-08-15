package calcu.exmp.swapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button bpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onSwap(View v){
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        bpress=(Button) findViewById(R.id.b1);

        String str=e1.getText().toString();
        String str2=e2.getText().toString();

        e1.setText(str2);
        e2.setText(str);
    }
}