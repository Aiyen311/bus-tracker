package srikurk.jcpsbusfinder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

/**
 * Created by Srikur on 5/20/2017.
 */

public class MapActivity extends FragmentActivity implements OnMapReadyCallback{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
