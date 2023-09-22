package com.example.application_bangladesh_bloodbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class Input_Information extends AppCompatActivity {
    Spinner spinner,sindiv;
    EditText name,phone,division,district,location;
    DatabaseReference reference;
    StorageReference storageReference;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_information);
        getSupportActionBar().hide();
        spinner=(Spinner)findViewById(R.id.spinning);
        sindiv=(Spinner)findViewById(R.id.spinnindiv);

        reference= FirebaseDatabase.getInstance().getReference();
        storageReference= FirebaseStorage.getInstance().getReference();
        name=(EditText) findViewById(R.id.name);
        phone=(EditText) findViewById(R.id.Phone);

        district=(EditText) findViewById(R.id.District);
        location=(EditText) findViewById(R.id.location);
        pd=new ProgressDialog(this);

        String[] items=new String[]{"A+","A-","B+","B-","AB+","AB-","O+","O-"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items));
        String[] div=new String[]{"Dhaka","Mymensingh","Khulna","Barishal","Sylet","Dinajpur","Chattagram","Rajshahi"};
        sindiv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,div));

    }

    public void home(View view) {
        startActivity(new Intent(this, home.class));
    }

    public void submit(View view) {
        updateInput();

    }

    private void updateInput() {
        pd.setTitle("Wait");
        pd.setMessage("Processing____________");
        pd.show();
        reference=reference.child("Data");
        String Name=name.getText().toString();
        String Phone=phone.getText().toString();
        String div=sindiv.getSelectedItem().toString();
        String dist=district.getText().toString();
        String loca=location.getText().toString();
        String blood=spinner.getSelectedItem().toString();
        final String uniqKey=reference.push().getKey();


        notice_data data=new notice_data(blood,Name,Phone,div,dist,loca,uniqKey);


        reference.child(blood).child(div).child(uniqKey).setValue(data).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                pd.dismiss();
                Toast.makeText(Input_Information.this, "Successfully Update", Toast.LENGTH_SHORT).show();


            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                pd.dismiss();
                Toast.makeText(Input_Information.this, "Failed", Toast.LENGTH_SHORT).show();

            }
        });







    }
}