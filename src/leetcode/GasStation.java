/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author vdmoi
 */
public class GasStation {
    public GasStation(){
        int[] gas = new int[]{};
        int[] cost = new int[]{};
        
        int len = 100000;
        int[] gas1 = new int[len];
        int[] cost1 = new int[len];
        gas1[gas1.length-1] = 2;
        cost1[cost1.length-2] = 1;
        System.out.println(canCompleteCircuit(gas, cost));
    
}
    
    public static void rotate(int[] nums, int k){
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
    
    
    
    
    public int canCompleteCircuitNotPerfect(int[] gas, int[] cost) {
        int fuel = 0, rotateCount = 0;
        long start;
        start = System.currentTimeMillis();
        for (int i = 0; i<gas.length; i++){
            gas[i] = gas[i] - cost[i];
            fuel += gas[i];
        }
        
        System.out.println(System.currentTimeMillis()-start + " with sum");
//        
//        if (fuel<0)return -1;
//        fuel = 0;
//        
//        for(int i = 0; i<gas.length; i++){
//            for(int j = 0; j<gas.length; j++){
//                fuel += gas[j];
//                if (fuel<0 || (fuel == 0 && j != gas.length-1)){
//                    fuel = 0;
//                    rotate(gas, 1);
//                    rotateCount++;
//                    break;
//                }
//                if(fuel>=0 && j == gas.length-1){
//                    System.out.println(System.currentTimeMillis() - start);
//                    if(rotateCount == 0)return 0;
//                    else return gas.length-rotateCount;
//                    
//                    
//                }
//            }
//        }
//        System.out.println(System.currentTimeMillis()-start + " with sum");
        return -1;

    }
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length ==0){
            try {
                Thread.sleep(2);
            } catch (Exception ex) {}
            return -1;
        }
        int fuel = 0, i, pointer = 0;
        
        for (i = 0; i<gas.length; i++){
            gas[i] = gas[i] - cost[i];
            fuel += gas[i];
        }
        if (fuel<0)return -1;
        fuel = 0;

        for (int a = 0; a<gas.length; a++){
            for(i = pointer; i<gas.length; i++){
                fuel += gas[i];
                if (fuel<0){
                    break;
                }
            }
            for (i = 0; i<pointer; i++){
                if(fuel<0){
                    break;
                }
                fuel += gas[i];
            }
            
            if (fuel>=0){
                return pointer;
            }
            pointer++;
            fuel = 0;
        }
        return -1;
    }
}
