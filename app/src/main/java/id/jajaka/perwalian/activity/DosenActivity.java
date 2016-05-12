package id.jajaka.perwalian.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import id.jajaka.perwalian.R;
import id.jajaka.perwalian.fragment.DaftarMhsBlmSetujuiFragment;
import id.jajaka.perwalian.fragment.DaftarMhsPerwalianFragment;
import id.jajaka.perwalian.fragment.DaftarMhsSetujuiFragment;
import id.jajaka.perwalian.fragment.DetailMhsFragment;
import id.jajaka.perwalian.fragment.HomeDosenFragment;
import id.jajaka.perwalian.fragment.RiwayatNilaiFragment;

public class DosenActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);
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
        getMenuInflater().inflate(R.menu.dosen, menu);
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

        if (id == R.id.nav_home) {
            changeContent(HomeDosenFragment.newInstance(this));
        } else if (id == R.id.nav_profile) {

        } else if (id == R.id.nav_dftr_mhs) {
            changeContent(DaftarMhsPerwalianFragment.newInstance(this));
        } else if (id == R.id.nav_telahPerwalian) {
            changeContent(DaftarMhsSetujuiFragment.newInstance(this));
        } else if (id == R.id.nav_belumPerwalian) {
            changeContent(DaftarMhsBlmSetujuiFragment.newInstance(this));
        } else if (id == R.id.nav_riwayatMhs) {
            changeContent(RiwayatNilaiFragment.newInstance(this));
        } else if (id == R.id.nav_dtailMhs) {
            changeContent(DetailMhsFragment.newInstance(this));
        } else if (id == R.id.nav_notif) {

        } else if (id == R.id.nav_setting) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void changeContent(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMain, fragment).commit();
    }
}
