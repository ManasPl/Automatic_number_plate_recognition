package com.iamdevnitesh.anpr.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.iamdevnitesh.anpr.R;
import com.iamdevnitesh.anpr.databinding.ActivityLoginBinding;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBar ab = getSupportActionBar();
        assert ab != null;
        ab.setTitle("Login User");
        ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(R.color.ActionBar));
        ab.setBackgroundDrawable(colorDrawable);

        mAuth = FirebaseAuth.getInstance();

        binding.BtnLogin.setOnClickListener(v -> loginUser());

    }

    private void loginUser() {
        String email = binding.EdtTxtUserName.getEditableText().toString().trim();
        String password = binding.EdtTxtPassword.getEditableText().toString().trim();
        if (TextUtils.isEmpty(binding.EdtTxtUserName.toString())) {
            binding.EdtTxtUserName.setError("Email is required");
            binding.EdtTxtUserName.requestFocus();
        } else if (TextUtils.isEmpty(binding.EdtTxtPassword.toString())) {
            binding.EdtTxtPassword.setError("Password is required");
            binding.EdtTxtPassword.requestFocus();
        } else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Error: " + Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}