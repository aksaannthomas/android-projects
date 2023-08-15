package calcu.exmp.hybridbased;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bPress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPress=(Button)findViewById(R.id.b1);
        bPress.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}