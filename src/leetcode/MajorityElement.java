/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author vdmoi
 */
public class MajorityElement {
    public MajorityElement(){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int item : nums){
            if(!dict.containsKey(item))dict.put(item, 1);
            else dict.put(item, dict.get(item)+1);
        }
        int maxnum = nums[0], maxcount = 0;
        for (int value : dict.values()){
            if (value > maxcount)maxcount = value;
        }
//        for(int key : dict.keySet()){
//            if(dict.get(key) > maxcount){
//                maxnum = key; 
//                maxcount = dict.get(key);
//            }
//        }
        for (int key : dict.keySet()){
            if(dict.get(key) == maxcount)return key;
        }
        //return dict.compute(maxnum, remappingFunction);
        return 0;
    }
}
