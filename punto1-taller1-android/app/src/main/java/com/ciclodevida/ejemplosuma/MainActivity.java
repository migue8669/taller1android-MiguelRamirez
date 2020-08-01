package com.ciclodevida.ejemplosuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView resp;
    Button suma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editNum1);
        num2=(EditText) findViewById(R.id.editNum2);
resp=(TextView)findViewById(R.id.editResultado);
suma=(Button)findViewById(R.id.suma);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double res = n1 * n2;
                String rx = String.valueOf(res);
                Toast notificacion = Toast.makeText(MainActivity.this, rx, Toast.LENGTH_LONG);
                notificacion.show();
                //resp.setText(String.valueOf(res));
            }
        });
    }
}
