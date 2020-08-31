package akimt.bstorm.genericiteDemo;

import akimt.bstorm.exo5.Vehicule;
import akimt.bstorm.exo5.Voiture;

import java.util.ArrayList;
import java.util.List;

public class Boite<TContenu extends Pesable>{

    List<TContenu> list = new ArrayList<>();

    TContenu getCinquiemeContenu(){
        if( list.size() >= 5 )
        {
            return list.get(4);
        }
        return null;
    }

    void ecrireElement(TContenu element){
        System.out.println(element);
        TContenu copie = element;
    }

    float getPoidTotal(){

        float poidTotal = 0;

        for(int i = 0; i < list.size() ; i++){

            poidTotal += list.get(i).getPoid();

        }

        return poidTotal;

    }
}
