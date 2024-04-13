// FIND OUT THE PRIME NUMBER WITHIN THE GIVEN RANGE , AND ALSO FIND OUT THE SUM OF ALL PRIME.

import java.util.*;

public class Problem1 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.print("ENTER START NUMBER : ");
        int start = sc.nextInt();
		System.out.print("ENTER END NUMBER : ");
        int end = sc.nextInt();
        boolean flag = false;
        int i,j, sum=0;

        for(i=start;i<end;i++){
            flag = true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                }
            }

            if(flag==true){
                System.out.print(i+" ");
                sum +=i;
            }
        }
        System.out.println();
        System.out.print("THE SUM OF ALL PRIME : "+sum);
        
    }
}


