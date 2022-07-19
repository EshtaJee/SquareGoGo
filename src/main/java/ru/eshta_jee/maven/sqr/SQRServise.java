
package ru.eshta_jee.maven.sqr;

public class SQRServise {
    public int calcSquareRoot(int minBorder, int maxBorder) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (minBorder <= i * i && i * i <= maxBorder) {
                x++;
            }
        }
        return x++;
    }
}
