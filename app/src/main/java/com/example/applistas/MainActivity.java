package com.example.applistas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.applistas.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    private Button btnSimple;
    private Button btnAvanzado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnAvanzado = (Button) findViewById(R.id.btnAvanzado);

        //mTextView = binding.text;
    }
    public void btnSimpleClick(View view){
        Intent intent = new Intent(this, SimpleListActivity.class);
        startActivity(intent);
    }
}