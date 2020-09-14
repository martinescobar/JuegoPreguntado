package com.example.juegopreguntado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Ventana2 extends AppCompatActivity
{
    Button acertado;
    Button errado1;
    Button errado2;
    Button errado3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana2);

        acertado = (Button)findViewById(R.id.correcto2);
        errado1 = (Button)findViewById(R.id.incorrecto4);
        errado2 = (Button)findViewById(R.id.incorrecto5);
        errado3 = (Button)findViewById(R.id.incorrecto6);

        acertado.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana2.this, Correcto.class);
                startActivity(siguiente);
            }
        });

        errado1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana2.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

        errado2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana2.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

        errado3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent siguiente = new Intent(Ventana2.this, Incorrecto.class);
                startActivity(siguiente);
            }
        });

    }

    // Este codigo es para que cuando toque el boton de retroceso les saque del juego
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