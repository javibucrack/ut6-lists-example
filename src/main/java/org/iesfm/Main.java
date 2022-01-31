package org.iesfm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;


public class Main {

    private final static Logger log= LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int[]numbers={1,2,3,4};

        List<Integer>numbersList=new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        // {1,2,3,4}.add(0,5)=> {5,1,2,3,4}
        // {1,2,3,4}.add(2,5)=> {1,2,5,3,4}
        // {1,2,3,4}.set(1,7)=> {1,7,5,3,4}

        for (int i = 0; i < numbers.length; i++) {
            log.info(""+numbers[i]);
        }
        //1=1
        //2=2
        //3=3
        //4=4
        //Tarda 10, muy poco eficiente O(n²)
        for (int i = 0; i < numbersList.size(); i++) {
            log.info(""+numbersList.get(i));
        }
        //1
        //1
        //1
        //1
        //Tarda n, mucho más eficiente O(n)
        for (int number:numbersList){
            log.info(""+number);
        }

        numbersList.remove(0);

        // {1,2,3,4}.remove(0)=>{2,3,4}
        log.info(""+numbersList.get(0));

        //Elimina todos los elementos
        numbersList.clear();
    }
}
