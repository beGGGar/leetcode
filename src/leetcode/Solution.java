/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int quant = n+m;
        int i = quant-1;
        m -=1;
        n -=1;
        
        for(; i>=0; i--){
            if(m>=0 && n>=0){
                if(nums1[m] >= nums2[n]){
                    //System.out.println("   +++" + m);
                    nums1[i] = nums1[m];
                    m--;
                }
                else{
                    nums1[i] = nums2[n];
                    n--;
                }
            }
            else break;
        }
        while(m>=0){
            nums1[i--] = nums1[m--];
        }
        while(n>=0){
            nums1[i--] = nums2[n--];
        }
        
    }
    
    
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 0, 0, 0};
        int[] nums2 = new int[]{2, 3, 5, 7};
        //System.out.println(nums1.length + " " + nums2.length);
        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        
        for(int i = 0; i<nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
    }
    
}
