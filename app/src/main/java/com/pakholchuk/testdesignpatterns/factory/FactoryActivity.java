package com.pakholchuk.testdesignpatterns.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pakholchuk.testdesignpatterns.R;
import com.pakholchuk.testdesignpatterns.databinding.ActivityFactoryBinding;

public class FactoryActivity extends AppCompatActivity {

    ActivityFactoryBinding binding;
    private CarFactory factory;
    private View.OnClickListener carClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.factory_cruiser_button :
                    newToyota("Land Cruiser");
                    break;
                case R.id.factory_innova_button :
                    newToyota("Innova");
                    break;
                case R.id.factory_fortuner_button :
                    newToyota("Fortuner");
                    break;
                case R.id.factory_f50_button :
                    newFord("F50");
                    break;
                case R.id.factory_mustang_button :
                    newFord("Mustang");
                    break;
                case R.id.factory_focus_button :
                    newFord("Focus");
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFactoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setButtonsListeners();
    }

    private void setButtonsListeners() {
        binding.factoryInnovaButton.setOnClickListener(carClickListener);
        binding.factoryCruiserButton.setOnClickListener(carClickListener);
        binding.factoryFortunerButton.setOnClickListener(carClickListener);
        binding.factoryF50Button.setOnClickListener(carClickListener);
        binding.factoryFocusButton.setOnClickListener(carClickListener);
        binding.factoryMustangButton.setOnClickListener(carClickListener);
        binding.factoryHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FactoryActivity.super.onBackPressed();
            }
        });
    }

    private void newToyota(String car) {
        factory = new ToyotaFactory();
        Car yourCar = factory.orderCar(car);
        binding.factoryResultTv.setText(yourCar.name);
    }
    private void newFord(String car) {
        factory = new FordFactory();
        Car yourCar = factory.orderCar(car);
        binding.factoryResultTv.setText(yourCar.name);
    }
}
