package com.example.myapplication5;
import java.util.HashMap;
import java.util.Map;

public class Test {

    HashMap<String, String> dict = new HashMap<>();

    public Test() {
        dict.put("Привет", "Suilad");
        dict.put("Пока", "Mara Mesta");
    }

    String translateFromRussianToElvish(String word) {

        for(Map.Entry<String, String> entry : dict.entrySet()) {
            if (entry.getKey().equals(word)) return entry.getValue();
        }

        return null;
    }
}