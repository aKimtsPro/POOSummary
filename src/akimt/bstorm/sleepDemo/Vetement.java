package akimt.bstorm.sleepDemo;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public class Vetement {

    public String couleur;

    boolean trendy(){
        return testTendance.test(this);
    }

    static Predicate<Vetement> testTendance = Vetement::defaultTrend;


    private boolean defaultTrend(){
        return this.couleur.equals("black");
    }
}
