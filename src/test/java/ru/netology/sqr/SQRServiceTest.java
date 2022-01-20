package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldCountSquaresbetweentwoboard() {
        SQRService service = new SQRService();
        int lowBoard = 100;
        int highBoard = 9801;
        int actual = service.calculateCountSQR(lowBoard, highBoard);
        int expected = 90;
        assertEquals(expected, actual);

    }
}