package com.rajeev;

import java.util.ArrayList;

public class FormATriangle {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(28);
        System.out.println(list);
        System.out.println(possibleToMakeTriangle(list));
      }
    public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
        // Write your code here.
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                for (int k = 2; k < arr.size(); k++) {
                    if(arr.get(i)+arr.get(j)>arr.get(k) && arr.get(i)+arr.get(k)>arr.get(j) && arr.get(j)+arr.get(k)>arr.get(i)){
                        return true;
                    }
                }
            }
        }
        return false;
      }
    }

