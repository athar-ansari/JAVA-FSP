/*  Question : Find Out the first maximum,Second maximum,Third maximum ?

Example :

Input : 

10 20 14 23 5

Output :
23 
20 
14
10
5

*/


import java.util.*;

public class Problem5 {
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        String InputData[]=sc.nextLine().split(" ");
        for(i=0;i<InputData.length;i++)
        {
            list.add(Integer.parseInt(InputData[i]));
        }
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)>max1)
            {
                max1=list.get(i);
            }
        }
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)>max2 && list.get(i)!=max1)
            {
                max2=list.get(i);
            }
        }
        for(i=0;i<list.size();i++)
        {
            if(list.get(i)>max3 && (list.get(i)!=max1 && list.get(i)!=max2))
            {
                max3=list.get(i);
            }
        }
       System.out.print("MAX1 : "+max1+" "+"\nMAX2 : "+max2+" "+"\nMAX3 : "+max3);
}
}



