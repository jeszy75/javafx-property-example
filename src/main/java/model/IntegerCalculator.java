package model;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;

public class IntegerCalculator {

    private IntegerProperty number1 = new SimpleIntegerProperty();
    private IntegerProperty number2 = new SimpleIntegerProperty();
    private ReadOnlyIntegerWrapper result = new ReadOnlyIntegerWrapper();

    public IntegerCalculator() {
        result.bind(Bindings.add(number1, number2));
    }

    public int getNumber1() {
        return number1.get();
    }

    public IntegerProperty number1Property() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1.set(number1);
    }

    public int getNumber2() {
        return number2.get();
    }

    public IntegerProperty number2Property() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2.set(number2);
    }

    public int getResult() {
        return result.get();
    }

    public ReadOnlyIntegerProperty resultProperty() {
        return result.getReadOnlyProperty();
    }

    public static void main(String[] args) {
        var model = new IntegerCalculator();
        model.setNumber1(30);
        model.setNumber2(12);
        System.out.printf("%d + %d = %d%n", model.getNumber1(), model.getNumber2(), model.getResult());
    }

}
