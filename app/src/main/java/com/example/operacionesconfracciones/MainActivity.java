package com.example.operacionesconfracciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2,den1,den2;
    TextView resnum,resden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.editTextnum1);
        num2=findViewById(R.id.editTextnum2);
        den1=findViewById(R.id.editTextden1);
        den2=findViewById(R.id.editTextden2);
        resnum=findViewById(R.id.textresnum);
        resden=findViewById(R.id.textresden);
    }

    public void suma(View view) {
        String numerador1,numerador2,denominador1,denominador2,resn,resd;
        Integer multiplicacion,suma,numer1,numer2,denom1,denom2;
        numerador1=num1.getText().toString();
        numerador2=num2.getText().toString();
        denominador1=den1.getText().toString();
        denominador2=den2.getText().toString();

        if(numerador1.equals("")||numerador2.equals("")||denominador1.equals("")||denominador2.equals("")){
            Toast.makeText(this, "Rellene todos los espacios", Toast.LENGTH_LONG).show();
            resn=" ";
            resd=" ";
            resnum.setText(resn);
            resden.setText(resd);
        }
        else{
            numer1=Integer.parseInt(numerador1);
            numer2=Integer.parseInt(numerador2);
            denom1=Integer.parseInt(denominador1);
            denom2=Integer.parseInt(denominador2);

            multiplicacion=denom1*denom2;

            suma=(numer1*denom2)+(numer2*denom1);

            if(denominador1.equals("0")||denominador2.equals("0")||multiplicacion==0){
                Toast.makeText(this, "No es posible dividir entre cero", Toast.LENGTH_LONG).show();
                resn=" ";
                resd=" ";
                resnum.setText(resn);
                resden.setText(resd);
            }
            else {
                resn=" "+suma;
                resd=" "+multiplicacion;
                resnum.setText(resn);
                resden.setText(resd);
            }
        }
    }

    public void dividir(View view) {
        String numerador1,numerador2,denominador1,denominador2,resn,resd;
        Integer multiplicacion,division,numer1,numer2,denom1,denom2;
        numerador1=num1.getText().toString();
        numerador2=num2.getText().toString();
        denominador1=den1.getText().toString();
        denominador2=den2.getText().toString();

        if(numerador1.equals("")||numerador2.equals("")||denominador1.equals("")||denominador2.equals("")){
            Toast.makeText(this, "Rellene todos los espacios", Toast.LENGTH_LONG).show();
            resn=" ";
            resd=" ";
            resnum.setText(resn);
            resden.setText(resd);
        }
        else{
            numer1=Integer.parseInt(numerador1);
            numer2=Integer.parseInt(numerador2);
            denom1=Integer.parseInt(denominador1);
            denom2=Integer.parseInt(denominador2);

            multiplicacion=denom1*numer2;

            division=numer1*denom2;

            if(denominador1.equals("0")||denominador2.equals("0")||multiplicacion==0){
                Toast.makeText(this, "No es posible dividir entre cero", Toast.LENGTH_LONG).show();
                resn=" ";
                resd=" ";
                resnum.setText(resn);
                resden.setText(resd);
            }
            else {
                resn=" "+division;
                resd=" "+multiplicacion;
                resnum.setText(resn);
                resden.setText(resd);
            }
        }
    }



    public void multiplication(View view) {
        String numerador1,numerador2,denominador1,denominador2,resn,resd;
        Integer multiplicacion,multiplicacion2,numer1,numer2,denom1,denom2;
        numerador1=num1.getText().toString();
        numerador2=num2.getText().toString();
        denominador1=den1.getText().toString();
        denominador2=den2.getText().toString();

        if(numerador1.equals("")||numerador2.equals("")||denominador1.equals("")||denominador2.equals("")){
            Toast.makeText(this, "Rellene todos los espacios", Toast.LENGTH_LONG).show();
            resn=" ";
            resd=" ";
            resnum.setText(resn);
            resden.setText(resd);
        }
        else{
            numer1=Integer.parseInt(numerador1);
            numer2=Integer.parseInt(numerador2);
            denom1=Integer.parseInt(denominador1);
            denom2=Integer.parseInt(denominador2);

            multiplicacion=denom1*denom2;

            multiplicacion2=numer1*numer2;

            if(denominador1.equals("0")||denominador2.equals("0")||multiplicacion==0){
                Toast.makeText(this, "No es posible dividir entre cero", Toast.LENGTH_LONG).show();
                resn=" ";
                resd=" ";
                resnum.setText(resn);
                resden.setText(resd);
            }
            else {
                resn=" "+multiplicacion2;
                resd=" "+multiplicacion;
                resnum.setText(resn);
                resden.setText(resd);
            }
        }
    }
}