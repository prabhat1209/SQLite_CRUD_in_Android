package com.example.firtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.firtry.adapter.RecyclerViewAdapter;
import com.example.firtry.data.MyDbHelper;
import com.example.firtry.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recyclerview initialization
        recyclerView = findViewById(R.id.recView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyDbHelper db = new MyDbHelper(MainActivity.this);

        // Creating a contact object for the db
        Contact contact = new Contact();
        contact.setPhoneNumber("8126674230");
        contact.setName("Prabhat Bharadwaj");
        Contact contact2 = new Contact();
        contact2.setPhoneNumber("7898026209");
        contact2.setName("Mohit Swami");

        // Adding a contact to the db
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);
        db.addContact(contact2);


        // Get all contacts
        List<Contact> contactList = db.getAllContacts();

//        Use your recyclerView
        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, contactList);
        recyclerView.setAdapter(recyclerViewAdapter);

        Log.d("dbPrabhat", "Bro you have "+ db.getCount()+ " contacts in your database");


    }
}
