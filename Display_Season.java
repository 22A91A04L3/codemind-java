import java.util.*;
public class praveen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        if(n==4 || n==5 ||n==6)
        System.out.println("Summer");
        else if(n==7 || n==8 ||n==9)
        System.out.println("Rainy");
        else if(n==11 || n==12 ||n==1)
        System.out.println("Winter");
        else if(n==2 || n==3)
        System.out.println("Spring");
        else
        System.out.println(-1);
    }
}

