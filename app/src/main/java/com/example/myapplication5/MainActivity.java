package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    HashMap<String, String> dict = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dict.put("Привет", "Suilad");
        dict.put("Пока", "Mara Mesta");

        // Мои хотелки
        // 1. Хочу загрузить activity_main.xml
        setContentView(R.layout.activity_main);

        // 2. Хочу управлять кнопкой
        Button myButton = findViewById(R.id.button);

        // 3. Завладеть вьюшкой для отображения результата
        TextView result = findViewById(R.id.textResult);

        // 4. Завладеть вьюшкой для отображения результата
        EditText input = findViewById(R.id.editText);

        // 5. Хочу слушателя на кнопку добавить
        myButton.setOnClickListener(v -> {
            String res = translateFromRussianToElvish(input.getText().toString());

            result.setText(res);
        });

    }

    String translateFromRussianToElvish(String word) {

        for(Map.Entry<String, String> entry : dict.entrySet()) {
            if (entry.getKey().equals(word)) return entry.getValue();
        }

        return null;
    }
}