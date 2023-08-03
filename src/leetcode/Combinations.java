/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vdmoiList<List<Integer>>
 */
public class Combinations {
    public Combinations(){
        List rez = combine(8, 5);
        System.out.println(rez);
    }
    public List<List<Integer>> combineWrong(int n, int k) {
        List rez = new ArrayList<List<Integer>>();
        List<Integer> buff;
        
        if (n == k){
            buff = new ArrayList();
            buff.add(k);
            rez.add(buff);
            return rez;
        }
        int quant = 1;
        int min = Math.min(k, n), max = Math.max(n, k);
        for (int i = min; i<max; i++){
            for(int j = i+1; j<max+1; j++){
                
                buff = new ArrayList();
                buff.add(i);
                buff.add(j);
                rez.add(buff);
                //buff.clear();
            }
                
        }
        return rez;
    }
    public int factorial(int n){
        int rez = 1;
        for (int i = 1; i<=n; i++){
            rez *= i;
        }
        return rez;
    }
    public List<List<Integer>> combine(int n, int k){
        List rez = new ArrayList<List<Integer>>();
        int quant = factorial(n)/factorial(k)/factorial(n-k);
        System.out.println(quant);
        return rez;
    }
}
