package com.numerica98.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, usuario, correo, total;
    Button compartir;
    String text_aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        compartir= findViewById(R.id.boton_share);
        t1= findViewById(R.id.total_producto1);
        t2= findViewById(R.id.total_producto2);
        t3= findViewById(R.id.total_producto3);
        t4= findViewById(R.id.total_producto4);
        t5= findViewById(R.id.total_producto5);
        t6= findViewById(R.id.total_producto6);
        t7= findViewById(R.id.total_producto7);
        t8= findViewById(R.id.total_producto8);
        t9= findViewById(R.id.total_producto9);

        usuario= findViewById(R.id.usuario_ingresado);
        correo= findViewById(R.id.correo_ingresado);
        total= findViewById(R.id.total_productos);


        Intent new_intent = getIntent();

        if(new_intent != null){
            usuario.setText(new_intent.getStringExtra(AppConstans.USER_KEY));
            correo.setText(new_intent.getStringExtra(AppConstans.CORREO_KEY));
            total.setText(new_intent.getStringExtra(AppConstans.PRODUCTOS_KEY));

            t1.setText(new_intent.getStringExtra(AppConstans.PRODUCTO1_KEY));
            t2.setText(new_intent.getStringExtra(AppConstans.PRODUCTO2_KEY));
            t3.setText(new_intent.getStringExtra(AppConstans.PRODUCTO3_KEY));
            t4.setText(new_intent.getStringExtra(AppConstans.PRODUCTO4_KEY));
            t5.setText(new_intent.getStringExtra(AppConstans.PRODUCTO5_KEY));
            t6.setText(new_intent.getStringExtra(AppConstans.PRODUCTO6_KEY));
            t7.setText(new_intent.getStringExtra(AppConstans.PRODUCTO7_KEY));
            t8.setText(new_intent.getStringExtra(AppConstans.PRODUCTO8_KEY));
            t9.setText(new_intent.getStringExtra(AppConstans.PRODUCTO9_KEY));
        }



        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2= new Intent();
                text_aux= usuario.getText()+"\n"+correo.getText()+"\n"+total.getText()+"\n"+t1.getText()+"\n"+t2.getText()+"\n"+t3.getText()+"\n"+t4.getText()+"\n"
                +t5.getText()+"\n"+t6.getText()+"\n"+t7.getText()+"\n"+t8.getText()+"\n"+t9.getText();
                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");

                m_intent2.putExtra(Intent.EXTRA_TEXT, text_aux);

                startActivity(m_intent2);
            }
        });

    }


}
