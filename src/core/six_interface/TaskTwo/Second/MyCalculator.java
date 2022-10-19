package core.six_interface.TaskTwo.Second;

import core.six_interface.TaskTwo.First.Numerable;

public class MyCalculator implements Numerable {
    @Override
    public double Divide(double firstNumber, double secondNumber ) {
        if(secondNumber == 0){
            System.out.print("Неможливість ділення на 0 - ");
        }
        return firstNumber / secondNumber ;
    }

    @Override
    public double Minus(double firstNumber, double secondNumber ) {
        return firstNumber - secondNumber;
    }

    @Override
    public double Multiply(double firstNumber, double secondNumber ) {
        return firstNumber * secondNumber;
    }

    @Override
    public double Plus(double firstNumber, double secondNumber ) {
        return firstNumber + secondNumber;
    }
}
