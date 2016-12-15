package xyz.annt.nytimessearch.activities;


import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import xyz.annt.nytimessearch.R;
import xyz.annt.nytimessearch.models.Article;


public class SplashScreen extends AppCompatActivity {


    public static final int sequndos =8;
    public static final int milisequndos= sequndos* 1000;
    public static final int delay =2;
    private ProgressBar pbprogreso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        pbprogreso = (ProgressBar)findViewById(R.id.pbprogreso);
        pbprogreso.setMax(maximo_prgreso());
        empezaranimaciton();

    }


    public void empezaranimaciton()
    {
        new CountDownTimer(milisequndos,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                pbprogreso.setProgress(etableice_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent move_to = new Intent(SplashScreen.this,ArticlesActivity.class);
                startActivity(move_to);
                finish();
            }
        }.start();
    }

    public int etableice_progreso(long milsecond)
    {
        return (int)((milisequndos-milsecond)/1000);
    }

    public int maximo_prgreso()
    {
        return sequndos - delay;
    }

}
