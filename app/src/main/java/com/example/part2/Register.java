package com.example.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class Register extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextPassword;
    // Button buttonLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        editTextEmail = findViewById(R.id.register_activity_et_email);
        editTextPassword = findViewById(R.id.register_activity_et_password);
        //   buttonLanguage=findViewById(R.id.bu_language);
    }


    public void register(View view) {
       String email = editTextEmail.getText().toString();

        if (email.isEmpty()) {
            editTextEmail.setError(getString(R.string.email_required));
            return;
        }
        String password = editTextPassword.getText().toString();

        if (password.isEmpty()) {
            editTextPassword.setError(getString(R.string.password_required));
        }

        if (email.equals("mohamed@gmail.com") && password.equals("123456")) {
            Intent intent = new Intent(Register.this, MainActivity.class);

            // لكن لو عندي 20 variable ببعت object
            MyUser myUser=new MyUser("7843652990", "mohamed","mohamed@gmail.com",21);
           // ابعت داتا لو هو متغير واحد
            intent.putExtra("Email", email);
            // لكن لو عندي 20 variable ببعت object
            intent.putExtra("user",myUser);
            startActivity(intent);

        }
        // else{
        // لان التوست بترجع integer وهو هنا text
        //        Toast.makeText(this, R.string.account_created, Toast.LENGTH_LONG).show();
        Toast.makeText(Register.this, R.string.account_created, Toast.LENGTH_SHORT).show();
        //  }

        // عاوزين نقفل ال activity الي انا واقف فيها
        // finish();


    }

    public void Language(View view) {
        setLocale("ar");
    }

    //localization
    public void LanguageEnglish(View view) {
        setLocale("en");
    }

   // كود لتغير لغة التطبيق من خلال الضغط علي الزر
    public void setLocale(String lang) {
        Locale myLocale2 = new Locale(lang);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        Configuration conf = getResources().getConfiguration();
        conf.locale = myLocale2;
        getResources().updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, Register.class);
        startActivity(refresh);

      //  recreate();
        finish();
    }

}

/*         "en" = English
            "hi" =Hindi
            "fr" =French
            "it" =Italian
            "de" =German
            "es" =Spanish
            "ja" =Japanese
            "ko" =Korean
            "nl" =Dutch
            "pt" =Portuguese
            "ru" =Russian
            "zh" =Chinese
            "ar" = arabic
   */
