/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class ProductOfArrayExceptSelf {
    public ProductOfArrayExceptSelf(){
        
    }
    
    public int[] productExceptSelf(int[] nums) {
        int[] rez = new int[nums.length];
        int mult = 1, zeroCount = 0, zeroPlace = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=0)mult *= nums[i];
            else {
                zeroCount++;
                zeroPlace = i;
            }
        }
        if(zeroCount>0){
            for (int i = 0; i<nums.length; i++){
                rez[i] = 0;
            }
            if (zeroCount == 1){
                rez[zeroPlace] = mult;
            }
        }
        
        else{
            for (int i = 0; i<nums.length; i++){
                rez[i] = mult/nums[i];
            }
        }
        return rez;
    }
}
