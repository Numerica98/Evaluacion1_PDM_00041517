package com.numerica98.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador1, contador2, contador3, contador4, contador5, contador6, contador7, contador8, contador9, total;
    EditText editUsuario, editCorreo;
    Button botonEnviar;
    TextView tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9;
    LinearLayout ll_1, ll_2, ll_3, ll_4, ll_5, ll_6, ll_7,ll_8,ll_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsuario= findViewById(R.id.edit_usuario);
        editCorreo= findViewById(R.id.edit_correo);
        botonEnviar= findViewById(R.id.boton_enviar);

        tv_1= findViewById(R.id.contador_producto1);
        tv_2= findViewById(R.id.contador_producto2);
        tv_3= findViewById(R.id.contador_producto3);
        tv_4= findViewById(R.id.contador_producto4);
        tv_5= findViewById(R.id.contador_producto5);
        tv_6= findViewById(R.id.contador_producto6);
        tv_7= findViewById(R.id.contador_producto7);
        tv_8= findViewById(R.id.contador_producto8);
        tv_9= findViewById(R.id.contador_producto9);

        ll_1= findViewById(R.id.LinearLayout_Producto1);
        ll_2= findViewById(R.id.LinearLayout_Producto2);
        ll_3= findViewById(R.id.LinearLayout_Producto3);
        ll_4= findViewById(R.id.LinearLayout_Producto4);
        ll_5= findViewById(R.id.LinearLayout_Producto5);
        ll_6= findViewById(R.id.LinearLayout_Producto6);
        ll_7= findViewById(R.id.LinearLayout_Producto7);
        ll_8= findViewById(R.id.LinearLayout_Producto8);
        ll_9= findViewById(R.id.LinearLayout_Producto9);


        ll_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                tv_1.setText(String.valueOf(contador1));
            }
        });

        ll_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                tv_2.setText(String.valueOf(contador2));
            }
        });

        ll_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                tv_3.setText(String.valueOf(contador3));
            }
        });

        ll_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                tv_4.setText(String.valueOf(contador4));
            }
        });

        ll_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador5++;
                tv_5.setText(String.valueOf(contador5));
            }
        });

        ll_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador6++;
                tv_6.setText(String.valueOf(contador6));
            }
        });

        ll_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador7++;
                tv_7.setText(String.valueOf(contador7));
            }
        });

        ll_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador8++;
                tv_8.setText(String.valueOf(contador8));
            }
        });

        ll_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador9++;
                tv_9.setText(String.valueOf(contador9));
            }
        });

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent= new Intent(MainActivity.this, NewActivity.class);

                total= contador1+contador2+contador3+contador4+contador5+contador6+contador7+contador8+contador9;

                m_intent.putExtra(AppConstans.USER_KEY,editUsuario.getText().toString());
                m_intent.putExtra(AppConstans.CORREO_KEY,editCorreo.getText().toString());
                m_intent.putExtra(AppConstans.PRODUCTOS_KEY,total+"");
                m_intent.putExtra(AppConstans.PRODUCTO1_KEY,contador1+"");
                m_intent.putExtra(AppConstans.PRODUCTO2_KEY,contador2+"");
                m_intent.putExtra(AppConstans.PRODUCTO3_KEY,contador3+"");
                m_intent.putExtra(AppConstans.PRODUCTO4_KEY,contador4+"");
                m_intent.putExtra(AppConstans.PRODUCTO5_KEY,contador5+"");
                m_intent.putExtra(AppConstans.PRODUCTO6_KEY,contador6+"");
                m_intent.putExtra(AppConstans.PRODUCTO7_KEY,contador7+"");
                m_intent.putExtra(AppConstans.PRODUCTO8_KEY,contador8+"");
                m_intent.putExtra(AppConstans.PRODUCTO9_KEY,contador9+"");

                startActivity(m_intent);

            }
        });
    }
}
