package int101.dummy;

public class Dummy {
    public static double rand1(){
        return Math.random();
    }
    public static int rand2(){
        return (new Random().NextInt());
    }
    public int rand3(){
        return 0;
    }
}
