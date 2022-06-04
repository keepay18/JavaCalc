package pikula.jakub;
import pikula.jakub.CalcOperations.Counting;
import java.util.ArrayList;

public class Calc {

    private final Counting calculator;

    public Calc(Counting operation){
        calculator = operation;
    }

    public double execute(ArrayList<Double> args){
        return calculator.count(args);
    }
}
