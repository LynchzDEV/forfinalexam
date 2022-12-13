package int101.array;

import static java.lang.StrictMath.random;
import java.util.Random;

public class student {

    private int id;
    private String name;
    static boolean[] allIds = new boolean[10];

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public student(String name) {
        this.name = name;
        this.id = (new Random()).nextInt(0, 9);
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + '}';
    }

    private void randomStudentId() {
        int randInt = randomInt();
        while (allIds[randInt]) {
            randInt = randommInt();
        }
        id = randInt;
        allIds[randInt] = true;
    }
    
    private int randomInt(){
        return Math.random();
}

}
