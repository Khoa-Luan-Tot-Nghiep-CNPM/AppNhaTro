package com.example.apptimnhatro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=(BottomNavigationView)findViewById(R.id.main_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

               int id= menuItem.getItemId();
                if (id == R.id.main) {
                    MainFragment mainFragment=new MainFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,mainFragment);
                    fragmentTransaction.commit();

                }

                if (id == R.id.nearby) {
                    NearbyFragment nearbyFragment=new NearbyFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,nearbyFragment);
                    fragmentTransaction.commit();

                }

                if (id == R.id.favorite) {
                    FavoriteFragment favoriteFragment=new FavoriteFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,favoriteFragment);
                    fragmentTransaction.commit();

                }

                if (id == R.id.message) {
                    MessageFragment messageFragment=new MessageFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,messageFragment);
                    fragmentTransaction.commit();

                }

                if (id == R.id.account) {
                    AccountFragment accountFragment=new AccountFragment();
                    FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout,accountFragment);
                    fragmentTransaction.commit();

                }

                return true;


            }
        });
        // Mac dinh hien thi trang chu
        bottomNavigationView.setSelectedItemId(R.id.main);
    }
}
