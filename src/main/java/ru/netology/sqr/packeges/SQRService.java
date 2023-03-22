package ru.netology.sqr.packeges;

public class SQRService {
    int firstNumber = 10;
    int secondNumber = 99;
    public int squaringCalculation(int x, int y) {
        int count = 0;
        int squareOfNumber = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            squareOfNumber = i* i;
            if (squareOfNumber >= x && squareOfNumber <= y) {
                count = count + 1;
            }
        }
        return count;
    }
}
