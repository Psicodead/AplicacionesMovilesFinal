package icesi.movil.astrapp.astrapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Inicio extends Activity {
    private ImageButton iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        iniciar= (ImageButton) findViewById(R.id.btn_inicio);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siguiente();
            }
        });
    }


    public void onStart(){
        super.onStart();
        //Beginning the loading animation as we attempt to verify registration with SIP
        ImageView imgLogoAnim = (ImageView) findViewById(R.id.logoAnimado);
    //    ivLoader.setBackgroundResource(R.anim.animationloader);


       // AnimationDrawable frameAnimation = (AnimationDrawable) ivLoader.getBackground();
       // frameAnimation.start();
    }

    public void siguiente(){
        Intent irCreacion = new Intent(getApplicationContext(),ActivityCrear.class);
        startActivity(irCreacion);
    }

}
