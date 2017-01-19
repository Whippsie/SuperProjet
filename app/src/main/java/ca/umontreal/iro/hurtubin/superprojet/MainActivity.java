package ca.umontreal.iro.hurtubin.superprojet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
            Toast.makeText(this, "Create (new)", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Create (saved instance)", Toast.LENGTH_LONG).show();

        Log.i("MAIN", "L'activité vient d'entrer dans onCreate");
        Log.e("MAIN", "Il y a une erreur");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show();
    }
}
