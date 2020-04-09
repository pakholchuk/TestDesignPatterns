package com.pakholchuk.testdesignpatterns.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pakholchuk.testdesignpatterns.R;
import com.pakholchuk.testdesignpatterns.databinding.ActivityObserverBinding;

import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

public class ObserverActivity extends AppCompatActivity {
    ActivityObserverBinding binding;
    DataSource dataSource = new DataSource();
    DataObserver dataObserver = new DataObserver();
    final String tvPreString = "Data from source: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityObserverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dataSource.addObserver(dataObserver);
        binding.observerHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObserverActivity.super.onBackPressed();
            }
        });
        binding.observerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSource.setData(String.valueOf(binding.observerEditText.getText()));
                transferDataToObserver();
            }
        });
    }

    private void transferDataToObserver() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
                dataSource.notifyObservers();
        String s = tvPreString + dataObserver.getDataFromObserver();
        binding.observerTextView.setText(s);
    }


}
