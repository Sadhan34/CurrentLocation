package mesadhan.currentlocation.single;

import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mesadhan.currentlocation.R;

public class MainActivity extends AppCompatActivity{

    private PresentCurrentLocation presentCurrentLocation;
    private Location location;
    public MainActivity(){}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presentCurrentLocation = new PresentCurrentLocation(getApplicationContext());

    }

    @Override
    protected void onStart() {
        super.onStart();
        presentCurrentLocation.connect();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presentCurrentLocation.disconnect();
    }
}

































