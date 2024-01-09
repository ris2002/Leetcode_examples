package com.step1.step14;

public class pallindrome {
    /* the following my brute force method which executes successfully
     public static void main (String[]args)
  {

    List < Integer > l1 = new ArrayList <> ();
    List < Integer > l2 = new ArrayList <> ();
    int x = 1032;
    while (x > 0)
      {
	int digit = x % 10;
	  l1.add (0, digit);
	  x = x / 10;
	  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
this above step converts a number into a list with each digit having its own index.
ex-x=122
S1
123>0
d=123%10 -->d=3 [NOTE % gives the remainder]
l1.add(0,d)--> adding d to the first element the element now is 3
x=x/10-->x==122/10--->x==12
S2
d=12%10-->d=2
l1.add(0,d) adding d to the first element so the current list is 2,3
x=x/10-->x=12/10-->1
S3
x=1%10-->d=1
l1.add(0,d) adding d to the first element ,the curr_list=[1,2,3]
loop breaks as x=0/10=0

	  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


      }
    System.out.println (l1);
    int size = l1.size ();
    for (int i = size - 1; i >= 0; i--)
      {
	int e = l1.get (i);
	l2.add (e);

      }
    System.out.println (l2);
    int h=0;
    for(int j=0;size>=j;j++){


            h=l2.get(j)*(int)Math.pow(10,size-1)+h;
            size=size-1;

    }
    h=h+l1.get(0);//here we add first element of l1 i.e last element of l2 the as (int)Math.pow(10,0)=0 not 1
    System.out.println (h);





  }
  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
  The below problem is the solved problem in coding Ninjas
    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int originalN = n;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        while (n > 0) {
            int digit = n % 10;
            l1.add(0, digit);
            n = n / 10;
        }

        int size = l1.size();

        for (int i = size - 1; i >= 0; i--) {
            int e = l1.get(i);
            l2.add(e);
        }

        int reversedNumber = 0;
        for (int j = 0; j < size - 1; j++) {
        ****
        The main difference btw above code and below is this line 'j < size - 1'. it should be j<size as we are are interasting j through the
        size not the other way around and to avoid index out of bounds error.




        ****
            reversedNumber = l2.get(j) * (int) Math.pow(10, size - 1 - j) + reversedNumber;
        }

        reversedNumber = reversedNumber + l1.get(0);
        return originalN == reversedNumber;
    }
}

     */