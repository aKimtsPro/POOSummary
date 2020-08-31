package akimt.bstorm.classeLocale;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<>(){{
            add("test");
            add(new Object());

            // aussi possible de faire d'autres actions sur la liste
            this.clear();
        }};



        // On peut transformer une série d'Object en List en utilisant Arrays.asList
        List<Object> list2 = Arrays.asList("test", new Object());

        // On peut utilisé la liste créée pour instancier une ArrayList
        ArrayList<Object> list3 = new ArrayList<>(Arrays.asList("test", new Object()));
    }
}
