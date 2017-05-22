package srikurk.jcpsbusfinder;

/**
 * Created by adithya on 5/21/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LogOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void changeLayout(View view) {
        setContentView(R.layout.activity_login);
    }
}

