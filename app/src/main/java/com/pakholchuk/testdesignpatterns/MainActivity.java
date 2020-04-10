package com.pakholchuk.testdesignpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pakholchuk.testdesignpatterns.databinding.ActivityMainBinding;
import com.pakholchuk.testdesignpatterns.databinding.ActivityObserverBinding;
import com.pakholchuk.testdesignpatterns.decorator.DecoratorActivity;
import com.pakholchuk.testdesignpatterns.factory.FactoryActivity;
import com.pakholchuk.testdesignpatterns.observer.ObserverActivity;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.mainObserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ObserverActivity.class);
                startActivity(intent);
            }
        });
        binding.mainDecorator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DecoratorActivity.class);
                startActivity(intent);
            }
        });
        binding.mainFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FactoryActivity.class);
                startActivity(intent);
            }
        });

    }
}
