package ini101.puzzling;

import java.util.Random;

public class BoolRandor {
    private double d;
    public BoolRandor(double d) {
        this.d = d;
    }

    public boolean getValue(){
        double r = Math.random();
        return r <= d;
    }
}
