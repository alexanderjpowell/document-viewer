package com.photo.alexanderpowell.documentviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.DividerItemDecoration;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener {

    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("English");
        animalNames.add("French");
        animalNames.add("History");
        animalNames.add("Geography");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("Chemistry");
        animalNames.add("History");
        animalNames.add("Chemistry");
        animalNames.add("History");

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
