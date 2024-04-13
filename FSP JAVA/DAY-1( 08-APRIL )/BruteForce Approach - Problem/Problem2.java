/*  QUESTION : PRINT ODD SUB ARRAY AND SUM ?

EXAMPLE : 1

INPUT : 1 2 3 4 5

OUTPUT: 

1 3 5 =>9
3 5 =>8
5 =>5

EXAMPLE : 1         // currently this example not working properly 

INPUT : 2 4 6 8 10 11 13 15

OUTPUT:

11 13 15 =>39
13 15 =>28
15 =>15

 */ 

 import java.util.*;

 class Problem2 {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         String inputData[] = sc.nextLine().split(" ");
 
     
         for (String data : inputData) {
             list.add(Integer.parseInt(data));
         }
 
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i) % 2 != 0) { 
                 int sum = 0;
                 // Print and sum the odd numbers
                 for (int j = i; j < list.size(); j += 2) {
                     sum += list.get(j);
                     System.out.print(list.get(j) + " ");
                 }
                 System.out.println("=>" + sum);
             }
         }
     }
 }
 