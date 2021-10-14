package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {
    public double areasSum(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) {
            res = res + figure.area();
        }
        return res;
    }
}
