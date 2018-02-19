package com.example.kiran.cardview;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();

    RecyclerView recyclerView;



    List<product> productList;//represent a list of data for out class product items

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));//linear layout manager is by default vertical so we will see a vertical recycle view




        //initializing the productlist
        productList = new ArrayList<>();











            //adding some items to our list
            productList.add(
                    new product(//product is our class
                            1,
                            "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                            "13.3 inch, Silver, 1.35 kg",
                            4.3,
                            60000,
                            R.drawable.civilwar));

            productList.add(
                    new product(
                            1,
                            "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                            "14 inch, Gray, 1.659 kg",
                            4.3,
                            60000,
                            R.drawable.spider_man));

            productList.add(
                    new product(
                            1,
                            "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                            "13.3 inch, Silver, 1.35 kg",
                            4.3,
                            60000,
                            R.drawable.tonystark));





            //now using adapterclass object and  passing data


          productAdapter  adapter = new productAdapter(this, productList);
            recyclerView.setAdapter(adapter);


        }
    }



