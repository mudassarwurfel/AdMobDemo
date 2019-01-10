package wurfel.com.admobdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void showBannerAds(View view) {
        startActivity(new Intent(MainActivity.this, BannerAdsActivity.class));
    }

    public void showInterstialsAds(View view) {
        startActivity(new Intent(MainActivity.this, InersitialsAdsActivity.class));

    }
}