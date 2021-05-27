package Fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    private ArrayList<T> boxArray;

    public Box(T... boxArray) {
        this.boxArray = new ArrayList<T>(Arrays.asList(boxArray));
    }

    public void add(T...boxArray){
        this.boxArray.addAll(Arrays.asList(boxArray));
    }

   public float getWeight(){
        if (boxArray.size() == 0) return 0;
        float weight = 0;
       for (T boxArr : boxArray) weight += boxArr.getWeight();
        return weight;
   }

   public void clear(){
        boxArray.clear();
   }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    public void putInBox(Box<? super T> box){
        box.boxArray.addAll(this.boxArray);
        clear();
    }
}
