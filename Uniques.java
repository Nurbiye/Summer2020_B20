package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
  1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
 */
public class Uniques {
    public static void main(String[] args) {
        String str ="AABBCDD";
        String uniques= "";

//        ArrayList<Character> list = new ArrayList<>();
//
//        for (char each :str.toCharArray() ){
//            list.add(each);
//        }

        ArrayList<String> list = new ArrayList<>();

        for (String each :str.split("") ){
            list.add(each);
        }
        System.out.println(list);

//        int count = Collections.frequency(list,"A");
//        if (count==1){
//            System.out.println("A");      //this will find out the frequency of A and if it is appears once then print out
//        }
//        //but we need to do this for each element in the list, let's use for each loop
        for (String each: list){
            int count = Collections.frequency(list,"each");
       if (count==1) {
           uniques +=each;
       }
        }
        System.out.println(uniques);

    }
}
