// Question : Check Sub String  ?

import java.util.*;

public class Problem3 {
    static boolean checkSubString(String str1, String str2) {
        int i, j;
        int n = str1.length();
        int m = str2.length();
        for (i = 0; i < n; i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                for (j = 0; j < m; j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        break;
                    }
                }
                if (j == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("ENTER FIRST STRING: ");
        String str1 = ip.nextLine();
        System.out.print("ENTER SECOND STRING: ");
        String str2 = ip.nextLine();
        boolean isFound = checkSubString(str1, str2);

        if (isFound == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}