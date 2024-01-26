package com.maverickallies.implicintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyButton(View view){
        double latitude =37.7749;
        double longitude=-122.4194;
        Uri intentUri=Uri.parse(" geo:"+latitude+","+longitude);

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,intentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
//        if(mapIntent.resolveActivity(getPackageManager()) !=null){
//           startActivity(mapIntent);
//       }
//       else
//           Toast.makeText(this, "google map is not installed", Toast.LENGTH_SHORT).show();
    }
}