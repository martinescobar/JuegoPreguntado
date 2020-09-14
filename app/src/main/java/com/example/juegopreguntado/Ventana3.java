package com.example.juegopreguntado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Ventana3 extends AppCompatActivity
{
    Button acertado;
    Button errado1;
    Button errado2;
    Button errado3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana3);

        acertado = (Button)findViewById(R.id.correcto3);
        errado1 = (Button)findViewById(R.id.incorrecto7);
        errado2 = (Button)findViewById(R.id.incorrecto8);
        errado3 = (Button)findViewById(R.id.incorrecto9);

        acertado.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana3.this, Correcto.class);
                startActivity(siguiente);
            }
        });

        errado1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana3.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

        errado2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana3.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

        errado3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana3.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == event.KEYCODE_BACK)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Desea Salir")
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
}