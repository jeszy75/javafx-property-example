package model;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class DoubleCalculator {

    private DoubleProperty number1 = new SimpleDoubleProperty();
    private DoubleProperty number2 = new SimpleDoubleProperty();
    private ReadOnlyDoubleWrapper result = new ReadOnlyDoubleWrapper();

    public DoubleCalculator() {
        result.bind(Bindings.add(number1, number2));
    }

    public double getNumber1() {
        return number1.get();
    }

    public DoubleProperty number1Property() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1.set(number1);
    }

    public double getNumber2() {
        return number2.get();
    }

    public DoubleProperty number2Property() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2.set(number2);
    }

    public double getResult() {
        return result.get();
    }

    public ReadOnlyDoubleProperty resultProperty() {
        return result.getReadOnlyProperty();
    }

    public static void main(String[] args) {
        var calculator = new DoubleCalculator();
        calculator.setNumber1(Math.PI);
        calculator.setNumber2(Math.PI);
        System.out.printf("%f + %f = %f%n", calculator.getNumber1(), calculator.getNumber2(), calculator.getResult());
    }

}
