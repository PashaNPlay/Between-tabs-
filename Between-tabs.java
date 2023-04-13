/*
Between-tabs
*/

import java.util.ArrayList;

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        if (string.replaceFirst("\t", "").contains("\t")) {
            return string.split("\t")[1];
        }
        throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
