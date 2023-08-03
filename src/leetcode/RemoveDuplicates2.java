/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class RemoveDuplicates2 {
    public RemoveDuplicates2(){
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        for (int item : nums){
            System.out.print(item + " ");
        }
    }
    
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i<nums.length-1-count; i++){ 
            while(nums[i+1] == nums[i-1]){
                count++;
                for (int j = i+1; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }            
                nums[nums.length-1] = nums[i]-1;
            }
        }
        return nums.length - count;
    }
}
