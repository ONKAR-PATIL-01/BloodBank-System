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

public class a2 extends AppCompatActivity {
    DatabaseReference ref;
    ListView lv;
    ArrayList<String> aa;
    ArrayAdapter<String> aad;
    member1 m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        lv=(ListView) findViewById(R.id.lv1);
        aa=new ArrayList<String>();
        aad=new ArrayAdapter<String>(this, R.layout.c,R.id.t11,aa);
        m=new member1();
        ref= FirebaseDatabase.getInstance().getReference("member1");
ref.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        for(DataSnapshot ds:dataSnapshot.getChildren())
        {
            m=ds.getValue(member1.class);
            aa.add(m.getName().toString()+"  "+m.getBg().toString()+"  "+m.getMn());


        }
        lv.setAdapter(aad);

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});
    }
}
