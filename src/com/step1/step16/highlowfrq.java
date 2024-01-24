
/* Problem statement
Given an array 'v' of 'n' numbers.
Your task is to find and return the highest and lowest frequency elements.
If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.
Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2
Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6
1 2 3 1 1 4
Sample Output 1 :
1 2
Sample Explanation 1:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2
Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
Sample Input 2 :
6
10 10 10 3 3 3
Sample Output 2 :
3 3
Sample Explanation 2:
Input: ‘n' = 6, 'v' = [10, 10, 10, 3, 3, 3]

Output: 3 3

Explanation: Since the frequency of '3' and '10' is 3. Therefore, the element with the maximum and minimum frequency is '3'.
Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.
Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.
Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
Time Limit: 1 sec */


package com.step1.step16;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import static sun.security.util.Debug.args;

public class highlowfrq {
    public static int[] getFrequencies(int[] v) {
       int  n=v.length;

        HashMap<Integer,Integer> mapp=new HashMap<>();
        //this is how we create a var for Hashmap.
        //Hashmap consists of key,value pair &there datatypes are mentioned here <Integer,Integer>
        ///now we need insert the values in the array to hash map and keep the count on the frequency of elements in the array
        //in Hashmap 'mapp'key is the element ,whereas the value is the frequency of the element
        for(int nums:v){
            mapp.put(nums,mapp.getOrDefault(nums,0)+1);
            /*this loop iterates through all elemnts of v
            * getOrDefault gets the default value of the key
            * for ex-int k=mapp.getOrDefault(nums,6)
            * then the output would be k=6
            * by putting mapp.getOrDefault(nums,0) in the place of val we are determining that initially the occurance of all numbers is 0
            * and incremnts by 1 if it occurs
            * what we are basically doing in this for loop is explained through an example-
            * if v=[10,1,2,10,2,3]-this loop itertaes through all elements of v
            * 1]mapp.put(10,0(default val)+1) we are incrementing the val here by 1 as no. 10 occurs once hence count is (10,1)
            * 2]mapp.put(1,0(default val)+1) now the hashed list is (10,1),(1,1)
            * 3]mapp.put(2,0(default val)+1) now the hashed list is (10,1), (1,1),(2,1)
            * 4]mapp.put(10,1+1) now the hashed list is (10,2), (1,1),(2,1)
            *5]mapp.put(2,1+1) now the hashed list is (10,2), (1,1),(2,2)
            *6]mapp.put(2,1+1) now the hashed list is (10,2), (1,1),(2,2),(3,1)
            *(10,2), (1,1),(2,2),(3,1) is is the final hashed list
             */

        }

        int minFreq=n,maxFreq=0;//n is the length of the array,We are keeping the min freq to be n as it it is the max possible occurrences
        int minEle=0,maxEle=0;





        //After inserting the elements in the Hashed list and finding their occurrences now we have to
        // find the element with max freq and the elemrnt with min freq
        for(Map.Entry<Integer,Integer>entry:mapp.entrySet()){
            /*
            Its a traditional for loop
            Map.Entry<Integer,Integer>  ----> This is similar when declaring HashMap<Integer,Integer> to create a hash function but here
            we create an (nested)interface[Map.Entry] withinhe Map interface.It provides methods to access and manipulate
            the key and value associated with an entry in a map.
entry is a temp name given to this interface
mapp.entrySet() returns a set of key-value pairs (entries) from the map.

So, when you see for '''''(Map.Entry<Integer, Integer> entry : map.entrySet())''''', it means:

Go through each key-value pair in the map.
For each pair, temporarily call it entry.
Do something with entry inside the loop.

             */

            int count=entry.getValue();
            int element=entry.getKey();
            if(count>maxFreq){
                maxFreq=count;
                        maxEle=element;
            }
            if(count==maxFreq && element<maxEle){
                maxFreq=count;
                maxEle=element;
            }

            if(count<minFreq){
                minFreq=count;
                minEle=element;
            }
            if(count==maxFreq && element<minEle){
                minFreq=count;
                minEle=element;
            }



int result[]=new int[2];
            result[0]=maxEle;
            result[1]=minEle;
            return result;

        }










    }
























}
