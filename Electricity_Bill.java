import java.util.*;
 public class praveen{
    public static void main(String args[]){
        double cost,n;
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String name=sc.nextLine();
        n=sc.nextDouble();
        if(n<199)
        cost=1.20*n;
        else if(n<400)
        cost=1.5*n;
        else if(n<600)
        cost=1.8*n;
        else
        cost=2*n;
        if(cost>400)
            cost=(15/100.0)*cost+cost;
        else
        cost=cost+100;
        System.out.format("%.2f",cost);
    }
}