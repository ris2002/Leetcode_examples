package com.step1.step14;

public class pallindrome {
    /* the following my brute force method which executes successfully but has larger time complexity
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
    h=h+l1.get(0);
    System.out.println (h);





  }

    * */

}
