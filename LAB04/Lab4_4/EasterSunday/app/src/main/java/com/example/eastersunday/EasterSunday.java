package com.example.eastersunday;

public class EasterSunday {

        private int year;

        public EasterSunday(String year) {
            this.year = Integer.parseInt(year);
        }

        public String getEasterDay() {
            int a = year % 19;
            int b = year / 100;
            int c = year % 100;
            int d = b / 4;
            int e = b % 4;
            int g = (8 * b + 13) / 25;
            int h = (19 * a + b - d - g + 15) % 30;
            int j = c / 4;
            int k = c % 4;
            int m = (a + 11 * h) / 319;
            int r = (2 * e + 2 * j - k - h + m + 32) % 7;
            int n = (h - m + r + 90) / 25;
            int p = (h - m + r + n + 19) % 32;
            String textDate = Integer.toString(p);
            String[] monthText = {"January","February","March","April","May","June","July","August","September","October","November","December"};
            return (monthText[n-1] + ", " + textDate);
        }
}
