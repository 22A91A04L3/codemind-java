import java.util.*;
import java.lang.Math;
 public class praveen{
    public static void main(String args[]){
        int a,b,c;
        double s,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2.0;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
    }
}
