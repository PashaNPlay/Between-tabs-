/*
Between-tabs
*/

import java.util.ArrayList;

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        int beginIndex = string.indexOf('\t') + 1;
        int endIndex = string.indexOf('\t', beginIndex);
        if (endIndex != -1) return string.substring(beginIndex, endIndex);
        throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
