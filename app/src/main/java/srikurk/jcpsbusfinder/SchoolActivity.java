package srikurk.jcpsbusfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Srikur on 5/20/2017.
 */

public class SchoolActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        if(!isEnrolled()) {
            TextView noSchoolView = (TextView) findViewById(R.id.schoolTextView);
            noSchoolView.setVisibility(View.GONE);
        } else {
            Button btn = (Button) findViewById(R.id.addSchoolButton);
            btn.setVisibility(View.GONE);
        }
    }

    public static boolean isEnrolled(){
        //Returns whether the student is enrolled in a school
        return true;
    }

}
