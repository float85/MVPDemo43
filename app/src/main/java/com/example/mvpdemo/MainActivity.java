package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvpdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ILogin {

    ActivityMainBinding binding;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        loginPresenter = new LoginPresenter(this);

        binding.btnLogin.setOnClickListener(v ->
                loginPresenter.Login(binding.etUserName.getText().toString(),
                binding.etPass.getText().toString()
        ));
    }

    @Override
    public void LoginDone(String mes) {
        Toast.makeText(getBaseContext(), mes, Toast.LENGTH_LONG).show();

    }

    @Override
    public void LoginNotDone(String mes) {
        Toast.makeText(getBaseContext(), mes, Toast.LENGTH_LONG).show();
    }
}
