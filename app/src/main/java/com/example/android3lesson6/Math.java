package com.example.android3lesson6;

import java.util.Arrays;
import java.util.Collections;

public class Math {
    public int sum(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        if (b == 0)
            return 0;
        else
            return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public String reversWords(String str) {
        if (str == null)
            return "";
        else {
            String[] words = str.split(" ");
            Collections.reverse(Arrays.asList(words));
            StringBuilder builder = new StringBuilder();
            int k = words.length;
            for (String s:words) {
                k--;
                if (k == 0)
                    builder.append(s);
                else
                    builder.append(s).append(" ");
            }
            return builder.toString();
        }
    }
}
