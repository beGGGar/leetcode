/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class HIndex {
    public HIndex(){
        int[] nums = new int[]{9, 5, 3, 2, 1, 0 ,5, 5, 3, 6, 7};
        int[] nums1 = new int[]{11, 15};
        System.out.println(hIndex(nums1));
    }
    
    public static void print(int[] nums ){
        for (int item : nums){
            System.out.print(item + " ");
        }
        System.out.println();
    }
    
    public int hIndex(int[] citations) {
        print(citations);
        MyToolKit.quickSort(citations, 0, citations.length-1);
        print(citations);
        int h = 0;
        for (int i = citations.length-1; i>=0; i--){
            if(h+1<=citations[i])h++;
            else break;
        }
        return h;
    }
}
