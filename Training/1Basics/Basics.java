import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        // System.out.println(compute(2));
        // printParity(11);
        // forLoop();
        // printAsterisk(4);
        // System.out.println(bitLen(0));
        // nestedLoops(5);
        // printBox(3,5);
        // printArray(new int[]{1,2,3});
        // System.out.println(getMinimum(new int[]{4,7,2,9,3}));
        // System.out.println(average(new double[]{1,2,3,4}));
        /*String[] str = { "((())())", "(()", ")(" };
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            System.out.println(checkParenthesis(str[i]));
        }*/
        //System.out.println(getSubstring("11:33"));
        //System.out.println(isValidTime("11:60"));
        //System.out.println(convertTime("12:34 AM"));
        //System.out.println(almostEqual(1.2, 1.3, 0.05));
        //System.out.println(numOfCols("10,32456,2234"));
        //System.out.println(factorial(3));
        System.out.println(hasEqualColumnWidth("1,2 \n 3,4 \n 5"));

    }

    public static int compute(int v) {
        v += 3;
        if (v % 2 == 1)
            v *= 2;
        if (v % 3 != 0)
            v *= 2;
        return v;
    }

    public static void printParity(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void forLoop() {
        int a = 1;
        for (int i = 1; i <= 8; i++)
            a = 2 * a;
        int x = 1;
        for (int i = 0; i <= 5; i++) {
            x += 1;
        }
        System.out.println("x = " + x);
        System.out.print("a = " + a);
    }

    public static void printAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static int bitLen(int n) {
        int bits = 1;
        if (n > 0) {
            bits = (int) (Math.log(n) / Math.log(2)) + 1;
        }

        return bits;
    }

    public static void nestedLoops(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            int y = 1;
            for (int j = 1; j <= i; j++) {
                y = y * j;
            }
            x += y;
        }
        System.out.println(x);
    }

    public static void printBox(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int getMinimum(int[] arr) {
        int min;
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double average(double[] arr) {
        double avrg;
        double sum = 0;
        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            avrg = sum / arr.length;
        } else {
            avrg = 0;
        }
        return avrg;
    }

    public static boolean checkParenthesisStack(String s) {
        boolean isok = true;
        // (hello)(no)
        Stack<Character> bracetstack = new Stack<>(); // init stack of chars for brackets
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                bracetstack.push(c); // push opening bracket to stack
                continue;
            }
            if (c == ')') {
                if (bracetstack.isEmpty()) { // if no opening brackets str not good
                    isok = false;
                } else {
                    if (bracetstack.pop() == ')') {
                        isok = true;
                    }
                }
            }
        }
        if (!bracetstack.isEmpty()) { // check if stack is empty in the end
            isok = false;
        }
        return isok;
    }
    
    public static String getSubstring(String s) {
        String ss;
        if (s.contains(":")) {
            ss = s.substring(0, s.indexOf(':'));
        }
        else {
            ss = s;
        }
        return ss;
    }
    
    public static boolean isValidTime(String s) {
        boolean isValid = true;
        String ss1;
        String ss2;
        Double num1;
        Double num2;
        if (s.contains(":")) {
            ss1 = s.substring(0, s.indexOf(':'));
            ss2 = s.substring(s.indexOf(':')+1, s.length());
        }
        else {
            ss1 = s;
            ss2 = s;
            isValid = false;
        }
        
        if (ss1.length() > 2 || ss2.length() > 2) {
            isValid = false;
        }
        try {
            num1 = Double.parseDouble(ss1);
            //System.out.println(num1);
            if(num1 > 23){
                isValid = false;
            }
        } catch (Exception e) {
            isValid = false;
            //System.out.println(ss1 + "Not number");
        }
        try {
            num2 = Double.parseDouble(ss2);
            //System.out.println(num2);
            if (num2 > 59) {
                isValid = false;
            }
        } catch (Exception e) {
            isValid = false;
            //System.out.println(ss2 + "Not number");
        }
        return isValid;
    }
    
    public static String convertTime(String s) {
        String time24 = "";
        String sHours = s.substring(0, s.indexOf(':'));
        String sMins = s.substring(s.indexOf(':'), 5);
        Double hours = Double.parseDouble(sHours);

        if(s.contains("PM")){
            if (hours < 12) {
                hours += 12;
            }
            sHours = String.valueOf(hours.intValue()); 
            //System.out.println(hours);
        }
        if (s.contains("AM")) {
            if (hours >= 12) {
                hours -= 12;
            }
            //System.out.println(hours.intValue());
            if (hours < 10) {
                sHours = "0" + String.valueOf(hours.intValue());
            }

            else {
                sHours = String.valueOf(hours.intValue()); 
            }  
        }
        time24 = sHours + sMins;
        return time24;
    }

    public static boolean almostEqual(double a, double b, double c) {
        if (Math.abs(a - b) <= c ) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int numOfCols(String s) {
        int cols = 1;
        if (s.length() == 0) {
            cols = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',') {
                cols++;
            }
        }
        return cols;
    }

    public static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n-1); // recursive call
        }
        else {
            return 1;
        }
    }

    public static boolean hasEqualColumnWidth(String s) {
        String[] lines = s.split(" \n ");
        boolean isTrue = true;
        for (int i = 0; i < lines.length-1; i++) {
            lines[i].split(",");
            //System.out.println(lines[i].length());
            if (lines[i].length() != lines[i+1].length()){
                isTrue = false;
            } else{
                isTrue = true;
            }
        }
        return isTrue;
    }
}