package akimt.bstorm.polymorphisme;

public class ClassB {

    private int base = 0;

    public int addition(int a, int b){
        System.out.println( "a + b = " + (a+b));
        return a+b;
    }

    public int addition(int a){
        base += a;
        return base;
    }

    public float addition(float a, int b){
        return 0.2f;
    }

    public float addition(int a, float b){
        return (float) a+b;
    }
}
