package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);  // Corrected ID
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List<Item> itemlist = new ArrayList<>();
        // Populate itemlist with items

        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));
        itemlist.add(new Item(R.drawable.image, "item_1", "This is Item_1", "320"));

        itemAdapter = new ItemAdapter(itemlist);
        recyclerView.setAdapter(itemAdapter);
    }

}