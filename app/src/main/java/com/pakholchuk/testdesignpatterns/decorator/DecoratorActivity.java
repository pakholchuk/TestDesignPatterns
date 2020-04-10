package com.pakholchuk.testdesignpatterns.decorator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.pakholchuk.testdesignpatterns.R;
import com.pakholchuk.testdesignpatterns.databinding.ActivityDecoratorBinding;

public class DecoratorActivity extends AppCompatActivity {
    ActivityDecoratorBinding binding;
    private Pizza pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDecoratorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setButtonsListeners();
    }

    private void setButtonsListeners() {
        binding.decoratorMarinaraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPizza(new MarinaraPizza());
            }
        });
        binding.decoratorPepperoniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPizza(new PepperoniPizza());
            }
        });
        binding.decoratorCheeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPizza(new CheesePizza());
            }
        });
        binding.decoratorOlivesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizza = new Olives(pizza);
            }
        });
        binding.decoratorExtraCheeseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizza = new ExtraCheese(pizza);

            }
        });
        binding.decoratorPearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pizza = new Pear(pizza);

            }
        });
        binding.decoratorBakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = pizza.getName()
                        + ". Total weight is "
                        + pizza.getWeight() + "g.";
                binding.decoratorResultText.setText(s);
                disableExtras();
            }
        });
        binding.decoratorClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enablePizzaButtons();
                disableExtras();
                binding.decoratorResultText.setText("");
            }
        });
        binding.decoratorHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecoratorActivity.super.onBackPressed();
            }
        });

    }

    private void startPizza(Pizza orderedPizza) {
        disablePizzaButtons();
        enableExtras();
        pizza = orderedPizza;

    }

    private void enablePizzaButtons() {
        binding.decoratorPepperoniButton.setEnabled(true);
        binding.decoratorCheeseButton.setEnabled(true);
        binding.decoratorMarinaraButton.setEnabled(true);
        binding.decoratorPizzaText.setTextColor(getResources().getColor(R.color.black));
    }
    private void disablePizzaButtons() {
        binding.decoratorPepperoniButton.setEnabled(false);
        binding.decoratorCheeseButton.setEnabled(false);
        binding.decoratorMarinaraButton.setEnabled(false);
        binding.decoratorPizzaText.setTextColor(getResources().getColor(R.color.light_grey));
    }

    private void enableExtras() {
        binding.decoratorOlivesButton.setEnabled(true);
        binding.decoratorExtraCheeseButton.setEnabled(true);
        binding.decoratorPearButton.setEnabled(true);
        binding.decoratorBakeButton.setEnabled(true);
        binding.decoratorExtrasText.setTextColor(getResources().getColor(R.color.black));
    }
    private void disableExtras() {
        binding.decoratorOlivesButton.setEnabled(false);
        binding.decoratorExtraCheeseButton.setEnabled(false);
        binding.decoratorPearButton.setEnabled(false);
        binding.decoratorBakeButton.setEnabled(false);
        binding.decoratorExtrasText.setTextColor(getResources().getColor(R.color.light_grey));
    }

}
