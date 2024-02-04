package com.step3.step31;
import java.util.HashMap;
import java.util.Map;
public class getSingleelement {
    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int nums:arr){
            map.put(nums,map.getOrDefault(nums, 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int object=entry.getKey();
            int   val=entry.getValue();
            int value=1;

            if(entry.getValue().equals(value)){
                return entry.getKey();
            }

//USING HASH...
        }
        return 0;
    }
}
