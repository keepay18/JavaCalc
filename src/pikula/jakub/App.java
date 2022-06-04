package pikula.jakub;

import pikula.jakub.CalcOperations.Addition;
import pikula.jakub.CalcOperations.Division;
import pikula.jakub.CalcOperations.Multiplication;
import pikula.jakub.CalcOperations.Substraction;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main (String[] args){

        System.out.println("Enter the first number");
        double Num1 = getDouble();

        System.out.println("Enter the second number");
        double Num2 = getDouble();

        ArrayList<Double> argument = new ArrayList<Double>();
        argument.add(Num1);
        argument.add(Num2);


        //Multiplication of nums
        Calc Calculator1 = new Calc(new Multiplication());
        double MultiplicationResult = Calculator1.execute(argument);
        System.out.println("The mutiplication is: "+ MultiplicationResult);

        //Dividing of nums
        Calc Calculator4 = new Calc(new Division());
        double DivisionResult = Calculator4.execute(argument);
        System.out.println("The result of the division is: " + DivisionResult);

        //Addition of nums
        Calc Calculator3 = new Calc(new Addition());
        double AdditionResult = Calculator3.execute(argument);
        System.out.println("The sum is: "+ AdditionResult);

        //Substraction of nums
        Calc Calculator2 = new Calc(new Substraction());
        double SubstractionResult = Calculator2.execute(argument);
        System.out.println("The substraction is: "+ SubstractionResult);


    }

    public static double getDouble(){
        return new Scanner (System.in).nextDouble();
    }
}
