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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list1= new ArrayList();
        list1.add("qwe");
        list1.add("asd");
        list1.add("zxc");
        list1.add("rty");
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+"  ");
        }
       
        System.out.println("  ");
        ArrayList list2= new ArrayList();
        list2.add("qwe");
        list2.add("asdsdf");
        list2.add("asd");
        list2.add("asdfgsd");
        list2.add("zxc");
        list2.add("asasdfd");
        list2.add("assdd");
        list2.add("rty");
        list2.add("assdfgd");
        
       
        for(int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+"  ");
        }
        System.out.println("  ");
        //System.out.println(list1.get(3));
        Subsequence sub = new Subsequence();
        System.out.println(sub.find(list1, list2));

       
    }
    
}
