package trap1.bhaleraoomkar.bankaccountrecycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar toolbar;
    View frag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        frag = findViewById(R.id.frag_01);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Snackbar.make(frag.findViewById(R.id.recyclerView),"There aren't actually any settings on this app...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
            invalidateOptionsMenu();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();
        if (id == R.id.nav_camera) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"You can't actually import photos on this app...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        else if (id == R.id.nav_gallery) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"You can't actually view your photos on this app...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        else if (id == R.id.nav_slideshow) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"This app actually doesn't have a slideshow feature...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        else if (id == R.id.nav_manage) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"There aren't actually any tools to use on this app...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        else if (id == R.id.nav_share) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"This app actually doesn't support sharing...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        else if (id == R.id.nav_send) {
            Snackbar.make(frag.findViewById(R.id.recyclerView),"This app actually does not have access to your messages or email...",Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
