/* Problem Set 4 - 24 Chapter 4 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 10/09/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * newList object is created from the DeQue.java which implements an interface, DequeInterface.java class
 * It uses the node file DLLNode.java for the usage of doubly-linked node lists.
 * The following files are NOT original to this code (not coded by me):
    * DequeInterface.java
    * QueueUnderflowException.java
    * QueueOverflowException.java
 * The following file was coded by me (methods added): DeQue.java
 * This is a simple main class, no user intake is necessary. All values are given by the program as a test
*/

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter4_24_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        DeQue newList = new DeQue();

        System.out.println("Numbers on This List:");
        for(int i = 0; i < 10; i++)
        {
            //enqueue method will received numbers from 0 - 9
            newList.enqueueRear(i);
        }
        newList.toString(); // print list
        System.out.println("\nQueue Size: " + newList.size()); //print size

        //adding to the front
        newList.enqueueFront(93);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        newList.enqueueFront(57);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());
//
//        //adding to the end
        System.out.println("\nAdding to The End:");
        newList.enqueueRear(15);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());
//
//        //removing
        newList.dequeueFront();
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());
//
        newList.dequeueRear();
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        newList.dequeueRear();
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());

        newList.enqueueFront(21);
        newList.toString();
        System.out.println("\nQueue Size: " + newList.size());
    }
}
