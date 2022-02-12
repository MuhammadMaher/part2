package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.part2.MyUser;
import com.example.part2.R;

public class MainActivity extends AppCompatActivity {
    TextView textViewEmail;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewEmail=findViewById(R.id.main_activity_tv_email);

        String mail=getIntent().getStringExtra("Email");
        textViewEmail.setText(mail);

      /*
           استقبل داتا من variable واحد
        String email=getIntent().getStringExtra("Email");
        textViewEmail.setText(email);
         استقبل داتا من object
         لما اختار Serializable بيطلع ايرور فبعمل cast عشان احول ال object الي نوع الكلاس بتاعة تاني*/
        MyUser myUser= (MyUser) getIntent().getSerializableExtra("user");
        Log.i(TAG, "onCreate: "+ "\n"+ myUser.Age +"\n"+myUser.Email+"\n"+myUser.id);
//        System.out.println(myUser.Age);
//        System.out.println(myUser.getName());
//        System.out.println(myUser.Email);
//        System.out.println(myUser.id);
        
    }
}