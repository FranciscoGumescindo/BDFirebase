package com.android.gumeoficial.bdfirebase;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import com.google.firebase.database.FirebaseDatabase;


import java.net.DatagramPacket;

public class Sistemas extends AppCompatActivity {
    //Declaraciond de variables
    private TextView tituloISC;
    private TextView pregunta1;
    private TextView respuesta1;
    private TextView pregunta2;
    private TextView respuesta2;
    private TextView pregunta3;
    private TextView respuesta3;
    private TextView pregunta4;
    private TextView respuesta4;

    //-----------------------------
    //Se creara una instancia de cada uno de los valores almacenados en Firebase, esto por su nombre
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mensajeRef = ref.child("TituloISC");
    DatabaseReference mensajeRef2 = ref.child("pregunta1ISC");
    DatabaseReference mensajeRef3 = ref.child("pregunta2ISC");
    DatabaseReference mensajeRef4 = ref.child("pregunta3ISC");
    DatabaseReference mensajeRef5 = ref.child("respuesta1ISC");
    DatabaseReference mensajeRef6 = ref.child("respuesta2ISC");
    DatabaseReference mensajeRef7 = ref.child("respuesta3ISC");
    DatabaseReference mensajeRef8 = ref.child("pregunta4ISC");
    DatabaseReference mensajeRef9 = ref.child("respuesta4ISC");
    //-----------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemas);

        //-----------------------------------------------------------
        //Casteo de variables de la actividad....
        tituloISC = (TextView) findViewById(R.id.tituloISC);
        pregunta1 = (TextView) findViewById(R.id.pregunta1);
        pregunta2 = (TextView) findViewById(R.id.pregunta2);
        pregunta3 = (TextView) findViewById(R.id.pregunta3);
        pregunta4 = (TextView) findViewById(R.id.pregunta4);
        respuesta1 = (TextView) findViewById(R.id.respuesta1);
        respuesta2 = (TextView) findViewById(R.id.respuesta2);
        respuesta3 = (TextView) findViewById(R.id.respuesta3);
        respuesta4 = (TextView) findViewById(R.id.respuesta4);
        //------------------------------------------------------------

    }

    //-----------------------------------------------------------------------
    //Metodo para mandar a llamar  los valores desde Firebase Realtime Database
    @Override
    protected void onStart() {
        super.onStart();
        //Primer bloque de codigo que hace referencia a el primer dato almacenado en Firebase
        mensajeRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tituloISC.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        mensajeRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value2 = dataSnapshot.getValue(String.class);
                pregunta1.setText(value2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value3 = dataSnapshot.getValue(String.class);
                pregunta2.setText(value3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value4 = dataSnapshot.getValue(String.class);
                pregunta3.setText(value4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value5 = dataSnapshot.getValue(String.class);
                respuesta1.setText(value5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value6 = dataSnapshot.getValue(String.class);
                respuesta2.setText(value6);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value7 = dataSnapshot.getValue(String.class);
                respuesta3.setText(value7);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value8 = dataSnapshot.getValue(String.class);
                pregunta4.setText(value8);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        mensajeRef9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value9 = dataSnapshot.getValue(String.class);
                respuesta4.setText(value9);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
    //Fin del metodo
}
