package ru.netology.sqr;

public class SQRService {
    public int calculateCountSQR(int lowerBoard, int higherBoard) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int sqr = i * i;
            if (sqr >= lowerBoard & sqr <= higherBoard) {
                count++;
            }
        }
        return count;
    }
}
