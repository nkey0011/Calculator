package edu.jsu.mcis.cs408.calculator;

// controller class

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import edu.jsu.mcis.cs408.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    class CalculatorClickHandler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String tag = ((Button) view).getTag().toString();
            Toast toast = Toast.makeText(binding.getRoot().getContext(), tag, Toast.LENGTH_SHORT);
            toast.show();
            // INSERT EVENT HANDLING CODE HERE
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        CalculatorClickHandler click = new CalculatorClickHandler();
        ConstraintLayout layout = binding.layout;

        for (int i = 0; i < layout.getChildCount(); ++i) {
            View child = layout.getChildAt(i);
            if(child instanceof Button) {
                child.setOnClickListener(click);
            }
        }


    }
}