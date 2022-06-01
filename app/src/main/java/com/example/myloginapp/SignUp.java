package com.example.myloginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
    Button btgBalikLogin;
    Button btgRegister;
    EditText emelRegis,passwordRegis,telefonRegis;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setupUIViews();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        firebaseAuth = firebaseAuth.getInstance();


        btgRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    String emel_Regis = emelRegis.getText().toString().trim();
                    String password_regis = passwordRegis.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(emel_Regis,password_regis).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(SignUp.this,"Daftar Berjaya", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUp.this, LoginActivity.class));
                            }else{
                                Toast.makeText(SignUp.this,"Daftar Tidak Berjaya", Toast.LENGTH_SHORT).show();

                            }

                        }
                    });

                }
            }
        });

        btgBalikLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (SignUp.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupUIViews(){
        btgRegister = findViewById(R.id.daftarregis);
        btgBalikLogin = findViewById(R.id.baliklogin);
        emelRegis = findViewById(R.id.emelregis);
        telefonRegis = findViewById(R.id.notelefon);
        passwordRegis = findViewById(R.id.passwordregis);
    }

    private Boolean validate(){
        Boolean result = false;

        String emel = emelRegis.getText().toString();
        String password = passwordRegis.getText().toString();
        String noTelefon = telefonRegis.getText().toString();

        if(emel.isEmpty() || password.isEmpty() || noTelefon.isEmpty() ){
            Toast.makeText(SignUp.this,"Lengkapkan Butiran", Toast.LENGTH_SHORT).show();
        }else{
            result= true;

        }
        return result;
    }
}