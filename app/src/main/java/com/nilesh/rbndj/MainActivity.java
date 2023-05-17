package com.nilesh.rbndj;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nilesh.rbndj.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {




    private static final String TAG = "MainActivity";
    private AdView mAdView;

    EditText name,fname,gotra,dob,hght,colorr,edu,job,hobby,mail,phone,addr;
    Button addButton;
    RadioButton male,fmale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


        name = findViewById(R.id.gbname);
        fname = findViewById(R.id.gbpname);
        gotra = findViewById(R.id.gbgotra);
        dob = findViewById(R.id.gbdob);
        hght = findViewById(R.id.gbheight);
        colorr = findViewById(R.id.gbcolor);
        edu = findViewById(R.id.gbedu);
        job = findViewById(R.id.gbjob);
        hobby = findViewById(R.id.gbhobby);
        mail = findViewById(R.id.gbmail);
        phone = findViewById(R.id.gbphone);
        addr = findViewById(R.id.gbaddr);
        addButton = findViewById(R.id.add_details);
        male = findViewById(R.id.rbmale);
        fmale = findViewById(R.id.rbfmale);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Members members = new Members();
                DatabaseReference mDatabase;

                mDatabase = FirebaseDatabase.getInstance().getReference();

                String id, namee, fnamee, gotraa, dobb, hghtt, colorrr, eduu, jobbb, hobbyy, email, phonee, addrr, rbm, rbf;


                namee = name.getText().toString();
                fnamee = fname.getText().toString();
                gotraa = gotra.getText().toString();
                dobb = dob.getText().toString();
                hghtt = hght.getText().toString();
                colorrr = colorr.getText().toString();
                eduu = edu.getText().toString();
                jobbb = job.getText().toString();
                hobbyy = hobby.getText().toString();
                email = mail.getText().toString();
                phonee = phone.getText().toString();
                addrr = addr.getText().toString();
                rbm = male.getText().toString();
                rbf = fmale.getText().toString();

                id = phonee;


                mDatabase.child("biodata").child(id).child("name").setValue(namee);
                mDatabase.child("biodata").child(id).child("father").setValue(fnamee);
                mDatabase.child("biodata").child(id).child("gotra").setValue(gotraa);
                mDatabase.child("biodata").child(id).child("dob").setValue(dobb);
                mDatabase.child("biodata").child(id).child("height").setValue(hghtt);
                mDatabase.child("biodata").child(id).child("color").setValue(colorrr);
                mDatabase.child("biodata").child(id).child("education").setValue(eduu);
                mDatabase.child("biodata").child(id).child("job").setValue(jobbb);
                mDatabase.child("biodata").child(id).child("hobby").setValue(hobbyy);
                mDatabase.child("biodata").child(id).child("email").setValue(email);
                mDatabase.child("biodata").child(id).child("phone").setValue(phonee);
                mDatabase.child("biodata").child(id).child("address").setValue(addrr);

                if (male.isChecked()) {
                    members.setGender(rbm);
                    mDatabase.child("biodata").child(id).child("gender").setValue(rbm);

                } else {
                    members.setGender(rbf);
                    mDatabase.child("biodata").child(id).child("gender").setValue(rbf);
                }

                mDatabase.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                        if (snapshot.hasChild("message")){
                            clearForm();
                        }
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
        });




    }

    public  void  clearForm() {

        ViewGroup group = (ViewGroup) findViewById(R.id.parent_group);
        for (int i = 0, count = group.getChildCount(); i < count; ++i) {
            View view = group.getChildAt(i);
            if (view instanceof EditText) {
                ((EditText) view).setText(null);
            }
        }

    }


}