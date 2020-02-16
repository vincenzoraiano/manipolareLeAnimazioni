package com.example.manipolareleanimazioni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    //creo una flag per usare le diverse immaginni nel giusto modo.
    boolean immaginePremuta=true;

    //Crep il metodo cambiaIcona, all'interno vanno iserite le due imageViev.
    public void cambiaIcona(View view){

        //logPer controllare se le immagini vengono clickate.
        Log.i("Immagine","Immagine Premuta");
        //creo una variabili di tipo imageViev
       ImageView immagineScudo=(ImageView) findViewById(R.id.scudoId);
        //creo una varaibile di tipo imageView.
       ImageView immagineSpinner=(ImageView) findViewById(R.id.spinnerId);

       //Uso un costrutto di controllo per manipolare le immagini e renderle interattive.
       if(immaginePremuta){
           //cambio lo stato della flag
            immaginePremuta=false;

            //la varibaile image(precedentemente creata) viene animata com i metodi
           //animate()
           //alpha()  //quando è settata su 0 l'immagine non è visibile.
           //setDuration()
            immagineSpinner.animate().alpha(0).setDuration(2000);
            immagineScudo.animate().alpha(1).setDuration(2000);


        }else {
           //se l'immagine viene ripremuta l'immagine viene scambiata con l'altra.
            immaginePremuta=true;
            immagineSpinner.animate().alpha(1).setDuration(2000);
            immagineScudo.animate().alpha(0).setDuration(2000);
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
