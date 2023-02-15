package edu.ncl.csc1035.java101;

public class Method
    {
        public static void main(String[] args)
            {
                int answer = calculate(5, 10);
                System.out.println(answer);
            }
        public static int calculate (int x, int y)
            {
                int answer = (x * y) / 2 * 100;
                return answer;
            }
    }
