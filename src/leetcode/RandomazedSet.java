/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author vdmoi
 */
class RandomizedSet {
    Set<Integer> array;
    public RandomizedSet() {
        array = new HashSet<>();
    }
    
    // вставляет элемент если отсутствует
    public boolean insert(int val) {
        if (array.contains(val))return false;
        else{
            array.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!array.contains(val)){
            return false;
        }
        else{
            array.remove(val);
            return true;
        }
    }
    
    // возвращает случайный элемент из набора
    public int getRandom() {
        int i = (int)(Math.random()*array.size()), counter = 0;
        for (int item : array){
            if(i == counter)return item;
            counter++;
        }
        return 0;
    }
}
