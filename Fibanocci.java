import java.util.Scanner;
import java.util.*;
public class Fibanocci {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a=0,b=a+1,c=0;
        System.out.println("Please insert the starting number of fibanocci series ");
        a=scan.nextInt();
        System.out.println("Enter the max number of fibanocci series to be displayed  ");
        int x=scan.nextInt();
        System.out.print(a+"\t"+b);
        for(int i=1;i<x;i++){
            c=a+b;
            System.out.print("\t"+c);
            a=b;
            b=c;
        }

    
}
}