package com.example.application_bangladesh_bloodbank;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.List;

public class opos extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    FirebaseStorage firebaseStorage;

    RecyclerView recycle_dhaka,recycle_mym,recycle_khul,recycle_bar,recycle_syl,recycle_ctg,recycle_dij,recycle_raj;
    List<notice_data> list1,list2,list3,list4,list5,list6,list7,list8;
    Adapter_class adapter1,adapter2,adapter3,adapter4,adapter5,adapter6,adapter7,adapter8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opos);
        getSupportActionBar().hide();
        database=FirebaseDatabase.getInstance();
        reference= database.getReference().child("Data");
        firebaseStorage=FirebaseStorage.getInstance();



        recycle_dhaka=(RecyclerView) findViewById(R.id.dhaka_view);
        recycle_dhaka.setHasFixedSize(true);
        recycle_dhaka.setLayoutManager(new LinearLayoutManager(this));
        recycle_mym=(RecyclerView) findViewById(R.id.mymensingh_view);
        recycle_mym.setHasFixedSize(true);
        recycle_mym.setLayoutManager(new LinearLayoutManager(this));
        recycle_khul=(RecyclerView) findViewById(R.id.khulna_view);
        recycle_khul.setHasFixedSize(true);
        recycle_khul.setLayoutManager(new LinearLayoutManager(this));
        recycle_bar=(RecyclerView) findViewById(R.id.barishal_view);
        recycle_bar.setHasFixedSize(true);
        recycle_bar.setLayoutManager(new LinearLayoutManager(this));
        recycle_syl=(RecyclerView) findViewById(R.id.syet_view);
        recycle_syl.setHasFixedSize(true);
        recycle_syl.setLayoutManager(new LinearLayoutManager(this));
        recycle_ctg=(RecyclerView) findViewById(R.id.chattagram_view);
        recycle_ctg.setHasFixedSize(true);
        recycle_ctg.setLayoutManager(new LinearLayoutManager(this));
        recycle_dij=(RecyclerView) findViewById(R.id.dinajpur_view);
        recycle_dij.setHasFixedSize(true);
        recycle_dij.setLayoutManager(new LinearLayoutManager(this));
        recycle_raj=(RecyclerView) findViewById(R.id.Rajshahi_view);
        recycle_raj.setHasFixedSize(true);
        recycle_raj.setLayoutManager(new LinearLayoutManager(this));


        list1=new ArrayList<notice_data>();
        adapter1=new Adapter_class(list1,opos.this);
        recycle_dhaka.setAdapter(adapter1);
        list2=new ArrayList<notice_data>();
        adapter2=new Adapter_class(list2,opos.this);
        recycle_mym.setAdapter(adapter2);
        list3=new ArrayList<notice_data>();
        adapter3=new Adapter_class(list3,opos.this);
        recycle_khul.setAdapter(adapter3);
        list4=new ArrayList<notice_data>();
        adapter4=new Adapter_class(list4,opos.this);
        recycle_bar.setAdapter(adapter4);
        list5=new ArrayList<notice_data>();
        adapter5=new Adapter_class(list5,opos.this);
        recycle_syl.setAdapter(adapter5);
        list6=new ArrayList<notice_data>();
        adapter6=new Adapter_class(list6,opos.this);
        recycle_ctg.setAdapter(adapter6);
        list7=new ArrayList<notice_data>();
        adapter7=new Adapter_class(list7,opos.this);
        recycle_dij.setAdapter(adapter7);
        list8=new ArrayList<notice_data>();
        adapter8=new Adapter_class(list8,opos.this);
        recycle_raj.setAdapter(adapter8);
        reference.child("O+").child("Dhaka").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list1.add(studentModel);
                adapter1.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reference.child("O+").child("Mymensingh").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list2.add(studentModel);
                adapter2.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference.child("O+").child("Khulna").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list3.add(studentModel);
                adapter3.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference.child("O+").child("Barishal").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list4.add(studentModel);
                adapter4.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference.child("O+").child("Sylet").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list5.add(studentModel);
                adapter5.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {


            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {


            }
        });
        reference.child("O+").child("Chattagram").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list6.add(studentModel);
                adapter6.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference.child("O+").child("Dinajpur").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list7.add(studentModel);
                adapter7.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference.child("O+").child("Rajshahi").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                notice_data studentModel = snapshot.getValue(notice_data.class);
                list8.add(studentModel);
                adapter8.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void home(View view) {
        startActivity(new Intent(this, home.class));
    }
}