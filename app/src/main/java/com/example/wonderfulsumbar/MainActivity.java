package com.example.wonderfulsumbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_actionbar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.people_icon:
                Intent gotoabout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(gotoabout);

                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list);
        rvWisata.setAdapter(listWisataAdapter);

        listWisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata data) {
                showSelectedWisata(data);
            }
        });
    }

    private void showSelectedWisata(Wisata wisata) {

        Intent gotodetailactivity = new Intent(MainActivity.this, DetailActivity.class);
        gotodetailactivity.putExtra(DetailActivity.EXTRA_DETAIL_PHOTO, wisata.getPhoto());
        gotodetailactivity.putExtra(DetailActivity.EXTRA_DETAIL_NAME, wisata.getName());
        gotodetailactivity.putExtra(DetailActivity.EXTRA_DETAIL_DESCRIPTION, wisata.getDescription());
        startActivity(gotodetailactivity);
    }
}
