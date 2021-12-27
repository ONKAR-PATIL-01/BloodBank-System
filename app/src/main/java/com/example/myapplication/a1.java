package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class a1 extends AppCompatActivity {
DatabaseReference ref;
ListView lv;
ArrayList<String> a;
ArrayAdapter<String> ad;
member m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        lv=(ListView) findViewById(R.id.lv);
a=new ArrayList<String>();
ad=new ArrayAdapter<String>(this, R.layout.d,R.id.t11,a);
m=new member();


        ref= FirebaseDatabase.getInstance().getReference("member");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren())
                {
                    m=ds.getValue(member.class);
                    a.add(m.getName().toString()+"  "+m.getBg().toString()+"  "+m.getMn());


                }
                lv.setAdapter(ad);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
