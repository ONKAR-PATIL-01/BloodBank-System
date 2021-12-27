package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Blood extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6,t7,t8;
    TextView tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8;
    TextView ttt1,ttt2,ttt3,ttt4,ttt5,ttt6,ttt7,ttt8;
DatabaseReference ref,ref1;
member m;
member1 m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);
        t1=findViewById(R.id.t000);
        t2=findViewById(R.id.t111);
        t3=findViewById(R.id.t222);
        t4=findViewById(R.id.t333);
        t5=findViewById(R.id.t444);
        t6=findViewById(R.id.t555);
        t7=findViewById(R.id.t666);
        t8=findViewById(R.id.t777);


        tt1=findViewById(R.id.tt00);
        tt2=findViewById(R.id.tt11);
        tt3=findViewById(R.id.tt22);
        tt4=findViewById(R.id.tt33);
        tt5=findViewById(R.id.tt44);
        tt6=findViewById(R.id.tt55);
        tt7=findViewById(R.id.tt66);
        tt8=findViewById(R.id.tt77);




        ttt1=findViewById(R.id.ttt0);
        ttt2=findViewById(R.id.ttt1);
        ttt3=findViewById(R.id.ttt2);
        ttt4=findViewById(R.id.ttt3);
        ttt5=findViewById(R.id.ttt4);
        ttt6=findViewById(R.id.ttt5);
        ttt7=findViewById(R.id.ttt6);
        ttt8=findViewById(R.id.ttt7);

t1.setText("50");
t2.setText("50");
t3.setText("50");
t4.setText("50");
t5.setText("50");
t5.setText("50");
t6.setText("50");
t7.setText("50");
t8.setText("50");

        tt1.setText("0");
        tt2.setText("0");
        tt3.setText("0");
        tt4.setText("0");
        tt5.setText("0");
        tt5.setText("0");
        tt6.setText("0");
        tt7.setText("0");
        tt8.setText("0");



        ttt1.setText("0");
        ttt2.setText("0");
        ttt3.setText("0");
        ttt4.setText("0");
        ttt5.setText("0");
        ttt5.setText("0");
        ttt6.setText("0");
        ttt7.setText("0");
        ttt8.setText("0");
ref= FirebaseDatabase.getInstance().getReference("member");
ref1=FirebaseDatabase.getInstance().getReference("member1");
ref.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        for(DataSnapshot ds:dataSnapshot.getChildren())
        {
            m=ds.getValue(member.class);

            if("A+".equalsIgnoreCase(m.getBg()))
            {
              int i=Integer.parseInt(t3.getText().toString());
                i++;
                  String s=""+i;
                t3.setText(s);
                int b=Integer.parseInt(tt3.getText().toString());
                b++;
                 String ss=""+b;
                  tt3.setText(ss);



            }
            if("B+".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t1.getText().toString());
                i++;
                String s=""+i;

                t1.setText(s);
                int b=Integer.parseInt(tt1.getText().toString());
                b++;
                String ss=""+b;
                tt1.setText(ss);
            }
            if("B-".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t2.getText().toString());
                i++;
                String s=""+i;

                t2.setText(s);
                int b=Integer.parseInt(tt2.getText().toString());
                b++;
                String ss=""+b;
                tt2.setText(ss);
            }
            if("A-".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t4.getText().toString());
                i++;
                String s=""+i;

                t4.setText(s);
                int b=Integer.parseInt(tt4.getText().toString());
                b++;
                String ss=""+b;
                tt4.setText(ss);
            }
            if("AB+".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t5.getText().toString());
                i++;
                String s=""+i;

                t5.setText(s);
                int b=Integer.parseInt(tt5.getText().toString());
                b++;
                String ss=""+b;
                tt5.setText(ss);
            }
            if("AB-".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t6.getText().toString());
                i++;
                String s=""+i;

                t6.setText(s);
                int b=Integer.parseInt(tt6.getText().toString());
                b++;
                String ss=""+b;
                tt6.setText(ss);
            }
            if("O+".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t7.getText().toString());
                i++;
                String s=""+i;

                t7.setText(s);
                int b=Integer.parseInt(tt7.getText().toString());
                b++;
                String ss=""+b;
                tt7.setText(ss);
            }
            if("O-".equalsIgnoreCase(m.getBg()))
            {
                int i=Integer.parseInt(t8.getText().toString());
                i++;
                String s=""+i;

                t8.setText(s);
                int b=Integer.parseInt(tt8.getText().toString());
                b++;
                String ss=""+b;
                tt8.setText(ss);
            }



        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});
ref1.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        for(DataSnapshot ds:dataSnapshot.getChildren())
        {
            m1=ds.getValue(member1.class);

            if("A+".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t3.getText().toString());
                i--;
                String s=""+i;

                t3.setText(s);
                int c=Integer.parseInt(ttt3.getText().toString());
                c++;
                String sss=""+c;
                ttt3.setText(sss);

            }
            if("B+".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t1.getText().toString());
                i--;
                String s=""+i;

                t1.setText(s);
                int c=Integer.parseInt(ttt1.getText().toString());
                c++;
                String sss=""+c;
                ttt1.setText(sss);
            }
            if("B-".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t2.getText().toString());
                i--;
                String s=""+i;

                t2.setText(s);
                int c=Integer.parseInt(ttt2.getText().toString());
                c++;
                String sss=""+c;
                ttt2.setText(sss);
            }
            if("A-".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t4.getText().toString());
                i--;
                String s=""+i;

                t4.setText(s);
                int c=Integer.parseInt(ttt4.getText().toString());
                c++;
                String sss=""+c;
                ttt4.setText(sss);
            }
            if("AB+".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t5.getText().toString());
                i--;
                String s=""+i;

                t5.setText(s);
                int c=Integer.parseInt(ttt5.getText().toString());
                c++;
                String sss=""+c;
                ttt5.setText(sss);
            }
            if("AB-".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t6.getText().toString());
                i--;
                String s=""+i;

                t6.setText(s);
                int c=Integer.parseInt(ttt6.getText().toString());
                c++;
                String sss=""+c;
                ttt6.setText(sss);
            }
            if("O+".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t7.getText().toString());
                i--;
                String s=""+i;

                t7.setText(s);
                int c=Integer.parseInt(ttt7.getText().toString());
                c++;
                String sss=""+c;
                ttt7.setText(sss);
            }
            if("O-".equalsIgnoreCase(m1.getBg()))
            {
                int i=Integer.parseInt(t8.getText().toString());
                i--;
                String s=""+i;

                t8.setText(s);
                int c=Integer.parseInt(ttt8.getText().toString());
                c++;
                String sss=""+c;
                ttt8.setText(sss);
            }



        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});
if(t1.getText().equals("0"))
{
    Toast.makeText(this, "B+ Blood is unavailable", Toast.LENGTH_SHORT).show();
}
        if(t2.getText().equals("0"))
        {
            Toast.makeText(this, "B- Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t3.getText().equals("0"))
        {
            Toast.makeText(this, "A+ Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t4.getText().equals("0"))
        {
            Toast.makeText(this, "A- Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t5.getText().equals("0"))
        {
            Toast.makeText(this, "AB+ Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t6.getText().equals("0"))
        {
            Toast.makeText(this, "AB- Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t7.getText().equals("0"))
        {
            Toast.makeText(this, "O+ Blood is unavailable", Toast.LENGTH_SHORT).show();
        }
        if(t8.getText().equals("0"))
        {
            Toast.makeText(this, "O- Blood is unavailable", Toast.LENGTH_SHORT).show();
        }

    }
}
