package pikula.jakub.CalcOperations;

import java.util.ArrayList;

public class Addition implements Counting{


    @Override
    public double count(ArrayList<Double> args) {
        return args.get(0) + args.get(1) ;
    }
}
