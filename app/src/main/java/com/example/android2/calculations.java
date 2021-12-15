package com.example.android2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculations {
    private static String basePattern =  "[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\\\\\/\\s]";

    public static int WordCounter(String input){
        String[] arr = input.split(basePattern.concat("+"));
        return arr.length;
    }

    public static int SymbolCounter(String input) {
        Pattern pattern = Pattern.compile(basePattern);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }
}
