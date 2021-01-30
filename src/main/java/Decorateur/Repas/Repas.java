package Decorateur.Repas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Repas {
    List<IRepas> repas = new ArrayList<IRepas>();

    public void add(IRepas repas){
        this.repas.add(repas);
    }

    public Double getCost(){
        Double cost = 0.0;
        Iterator<IRepas> iterator = repas.iterator();
        while(iterator.hasNext()){
            cost = cost + iterator.next().getCost();
        }
        return cost;
    }


    public String getDescription(){
        String description = "";
        Iterator<IRepas> iterator = repas.iterator();
        while(iterator.hasNext()){
            if(description.length()>0){
                description =  description + "\n" +  iterator.next().getDescription();
            }else{
                description = iterator.next().getDescription();
            }

        }
        description +="\n";
        return description;
    }

}
