package com.step1.step14;

public class isArmstrong {public static boolean Armstrong(int n){

    int Ori_N=n;
    List <Integer> l1=new ArrayList<>();
    while(n!=0){
        int x=n%10;
        l1.add(0,x);
        n=n/10;
    }
    int size=l1.size();
    int a=0;
    for(int i=0;i<size;i++)
    {
        int b=l1.get(i);
        a=(int)Math.pow(b,3)+a;


    }

    return   (Ori_N==a);
}
    public static void Main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        n = sc.nextInt();
        if ( Armstrong(n) )
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}



/////////////////LOGIC IS CORRECT BUT CODE GIVING '''''''''Error: Main method not found in class Main, please define the main method as:
//   public static void main(String[] args)
//or a JavaFX application class must extend javafx.application.Application''''''''