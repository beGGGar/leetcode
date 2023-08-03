/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class RemoveElement {
    public RemoveElement(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        for (int item : nums){
            System.out.print(item + " ");
        }
    }
    
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            while (nums[i] == val && i<nums.length-count){
                count++;
                for (int j = i+1; j<nums.length; j++){
                    nums[j-1] = nums[j];
                }
                nums[nums.length-count] = val;
            }
        }
        return nums.length - count;
    }
}
