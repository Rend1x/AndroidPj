package com.example.admin.crib;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.aggro_shaman) {inputContent("aggro_shaman",R.drawable.aggro_shaman);}
        else if(id == R.id.reno_mage){inputContent("reno_mage",R.drawable.reno_mage);}
        else if(id == R.id.jade_shaman){inputContent("jade_shaman",R.drawable.jade_shaman);}
        else if(id == R.id.pirate_warrior){inputContent("pirate_warrior",R.drawable.pirate_warrior);}
        else if(id == R.id.renolock){inputContent("renolock",R.drawable.renolock);}
        else if(id == R.id.miracle_rogue){inputContent("miracle_rogue",R.drawable.miracle_rogue);}
        else if(id == R.id.control_warrior){inputContent("control_warrior",R.drawable.control_warrior);}
        else if(id == R.id.dragon_priest){inputContent("dragon_priest",R.drawable.dragon_priest);}
        else if(id == R.id.control_shaman){inputContent("control_shaman",R.drawable.control_shaman);}
        else if(id == R.id.dragon_warrior){inputContent("dragon_warrior",R.drawable.dragon_warrior);}
        else if(id == R.id.jade_druid){inputContent("jade_druid",R.drawable.jade_druid);}
        else if(id == R.id.pirate_rogue){inputContent("pirate_rogue",R.drawable.pirate_rogue);}
        else if(id == R.id.reno_priest){inputContent("reno_priest",R.drawable.reno_priest);}
        else if(id == R.id.anyfin_paladin){inputContent("anyfin_paladin",R.drawable.anyfin_paladin);}
        else if(id == R.id.tempo_mage){inputContent("tempo_mage",R.drawable.tempo_mage);}
        else if(id == R.id.ramp_druid){inputContent("ramp_druid",R.drawable.ramp_druid);}
        else if(id == R.id.freeze_mage){inputContent("freeze_mage",R.drawable.freeze_mage);}

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void inputContent(String deckName, int image){

        final String NAME_FILE = "deks/" + deckName + ".txt";


        String data = "";
        String line = null;



        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.getAssets().open(NAME_FILE)));
            while ((line = reader.readLine()) != null) {
                data += line;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

        ImageView imageView = (ImageView)findViewById(R.id.image_content);

        imageView.setImageResource(image);

        TextView text = (TextView)findViewById(R.id.text_content);

        text.setText(data);

    }

}
