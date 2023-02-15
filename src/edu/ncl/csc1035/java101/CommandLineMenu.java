package edu.ncl.csc1035.java101;

import java.util.Scanner;
public class CommandLineMenu
    {
        public static void main(String[] args)
            {
                Scanner s = new Scanner(System.in);
                boolean quit = false;
                while (!quit)
                    {
                        String choice = s.nextLine();
                        switch (choice)
                            {
                                case "1":
                                    System.out.println("You have selected option 1");
                                    break;
                                case "2":
                                    System.out.println("You have selected option 2");
                                    break;
                                case "3":
                                    System.out.println("You have selected option 3");
                                    break;
                                case "4":
                                    System.out.println("You have selected option 4");
                                    break;
                                case "5":
                                    System.out.println("You have selected option 5");
                                    break;
                                case "6":
                                    System.out.println("You have selected option 6");
                                    System.out.println("Quitting program");
                                    quit = true;
                                    break;
                                default:
                                    System.out.println("Not a valid choice");
                                    break;
                            }
                    }
            }
    }
