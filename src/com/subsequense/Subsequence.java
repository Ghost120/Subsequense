/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.subsequense;

import java.util.ArrayList;


/**
 *
 * @author kasyan
 */
public class Subsequence {
 
    boolean find(ArrayList list1, ArrayList list2){
        int j=0;
        int k=0;
        for(int i=0; i<list2.size(); i++){ //сверяем  элемент второго листа с первым и если равны увеличиваем счетчик
            if(list2.get(i).equals(list1.get(j))){ 
               if(list1.size()-1 > j) j++; 
               k++;
            }
        }
       return (k == list1.size());
    }
}
