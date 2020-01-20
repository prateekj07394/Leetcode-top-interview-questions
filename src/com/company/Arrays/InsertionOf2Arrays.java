package com.company.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertionOf2Arrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        //insert elements of first array into map
        for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int val = map.get(nums1[i]);
                map.put(nums1[i],val+1);
            } else{
                map.put(nums1[i],1);
            }
        }
        //iterate over second array and check if they exist
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                if(map.get(nums2[i])==1){
                    map.remove(nums2[i]);
                }else{
                    int val = map.get(nums2[i]);
                    map.put(nums2[i],val-1);
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
