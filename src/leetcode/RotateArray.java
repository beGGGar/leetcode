/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class RotateArray {
    public RotateArray(){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 8);
        for (int item : nums){
            System.out.print(item + " ");
        }
    }
    
    public void rotateWrong(int nums[], int k){
        int buff;
        for (int i = 0; i<k; i++){
            buff = nums[nums.length-1];
            for (int j = nums.length-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = buff;
        }
    }
    
    public void rotate(int[] nums, int k){
        while(k>nums.length){
            k = k - nums.length;
        }
        int[] buff = new int[k];
        for (int i = 0; i<k; i++){
            buff[i] = nums[nums.length-k+i];
        }
        for (int i = nums.length-1; i>=k; i--){
            nums[i] = nums[i-k];
        }
        for (int i = 0; i<k; i++){
            nums[i] = buff[i];
        }
    }
}
