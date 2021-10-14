package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5.5);
        Circle circle3 = new Circle(7.3);
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(3.5, 15.2);

        Figure[] figures = {circle1, circle2, circle3, rectangle1, rectangle2};

        Calculator calculator = new Calculator();
        System.out.println(calculator.areasSum(figures));
    }
}