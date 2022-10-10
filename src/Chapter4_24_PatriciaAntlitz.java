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


    }
}
