package edu.ncl.csc1035.java101;

public class LoopExample
    {
        public static void main(String[] args)
            {
                //For loop
                for (int i = 2; i < 10; i+=2)
                    {
                        System.out.println("hello, world");
                    }

                //While loop
                int i = 0;
                while (i < 10)
                    {
                        System.out.println(i);
                        i++;
                    }

                //Do while loop
                int j = 0;
                do
                    {
                        System.out.println(j);
                        j++;
                    }
                while (j < 10);
            }
    }
