package com.example.juegopreguntado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Incorrecto extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrecto);

        siguiente = (Button)findViewById(R.id.button2);

        elegidorDeVentanas();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == event.KEYCODE_BACK)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Desea Salir?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            dialogInterface.dismiss();
                        }
                    });
            builder.show();
        }

        return super.onKeyDown(keyCode, event);
    }

    public void elegidorDeVentanas()
    {
        int valorRandom = (int) (Math.random() * 4 + 1);
        int desicion = 0;
        int[] valores = {1, 2, 3, 4};


        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valorRandom) {
                desicion = valorRandom;
                valores[i] = 0;
            }
        }

        if (desicion == 0)
        {
            siguiente.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                    Intent siguiente = new Intent( Incorrecto.this, Termino.class);
                    startActivity(siguiente);
                }
            });
        }


        if(desicion == 1)
        {

            siguiente.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent siguiente = new Intent( Incorrecto.this, Ventana1.class);
                    startActivity(siguiente);
                }
            });
        }
        if (desicion == 2)
        {
            siguiente.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent siguiente = new Intent( Incorrecto.this, Ventana2.class);
                    startActivity(siguiente);
                }
            });
        }
        if(desicion == 3)
        {

            siguiente.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent siguiente = new Intent( Incorrecto.this, Ventana3.class);
                    startActivity(siguiente);
                }
            });
        }
        if (desicion == 4)
        {
            siguiente.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent siguiente = new Intent( Incorrecto.this, Ventana4.class);
                    startActivity(siguiente);
                }
            });
        }
    }
}