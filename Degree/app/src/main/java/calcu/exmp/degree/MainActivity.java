package calcu.exmp.degree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox) findViewById(R.id.c1);
        c2=(CheckBox) findViewById(R.id.c2);
        c3=(CheckBox) findViewById(R.id.c3);
        e1=(EditText) findViewById(R.id.e1);


    }

    public void onsslc(View view) {
        if(c1.isChecked()){
            c2.setChecked(false);
            c3.setChecked(false);
            e1.setText("Sslc");
        }
        else{
            c2.setChecked(false);
            c3.setChecked(false);
            e1.setText("");

        }

    }

    public void onpt(View view) {
        if(c2.isChecked()){
            c1.setChecked(true);
            c3.setChecked(false);
            e1.setText("SSlc, Plus Two");
        }
        else{
            c3.setChecked(false);
            e1.setText("SSlc");
        }
    }

    public void ondegree(View view) {
        if(c3.isChecked()){
            c1.setChecked(true);
            c2.setChecked(true);
            e1.setText("SSlc, Plus Two,Degree");
        }
        else{
            e1.setText("SSlc, Plus Two");
        }
    }
}