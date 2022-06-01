package com.example.myloginapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    Button btgregister;
    Button btgLogMasuk;
    TextView emelMasuk;
    TextView passwordMasuk;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        btgregister = findViewById(R.id.register);
        btgLogMasuk = findViewById(R.id.btnMasuk);
        emelMasuk = findViewById(R.id.emelLogin);
        passwordMasuk = findViewById(R.id.passwordLogin);

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);


        FirebaseUser user = firebaseAuth.getCurrentUser();



        btgLogMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(emelMasuk.getText().toString(),passwordMasuk.getText().toString());
            }
        });

        btgregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LoginActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
    }


    private void validate(String Emel, String Password){
        progressDialog.setMessage("Tunggu Jap");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(Emel,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progressDialog.dismiss();
                    Toast.makeText(LoginActivity.this, "Log Masuk Berjaya", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this,MenuUtama.class));
                }else{
                    Toast.makeText(LoginActivity.this, "Log Masuk Gagal", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }

            }
        });

    }
}