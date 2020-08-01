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
    EditText num3;
    EditText num4;
    TextView resp;
    Button suma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editNum1);
        num2=(EditText) findViewById(R.id.editNum2);
        num3=(EditText) findViewById(R.id.editNum3);
        num4=(EditText) findViewById(R.id.editNum4);
resp=(TextView)findViewById(R.id.editResultado);
suma=(Button)findViewById(R.id.suma);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double n3 = Double.parseDouble(num3.getText().toString());
                double n4 = Double.parseDouble(num4.getText().toString());

                double res = (n1 + n2 + n3 + n4)/4 ;
           if(res>=3.0){
               Toast notificacion = Toast.makeText(MainActivity.this, "Aprobó la materia", Toast.LENGTH_LONG);
               notificacion.show();

           }else{
               Toast notificacion = Toast.makeText(MainActivity.this, "Reprobó la materia", Toast.LENGTH_LONG);
               notificacion.show();

           }

                resp.setText(String.valueOf(res));
            }
        });
    }
}
