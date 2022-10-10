/*this class uses an array to simulate a queue, numbers are added to the array through
a loop, passed by the main method on file Chapter4_15_PatriciaAntlitz.java.
This class can print the size and the list of numbers, remove, add from both front and end of the list
 */

public class DeQue
{
    private int[] elements;                 // array that holds queue elements
    private final int MAXSIZE = 100;        // default capacity
    private int numElements;                // number of elements in this queue
    protected int front = 0;                // index of front of queue
    protected int rear;                     // index of rear of queue

    public DeQue()
    {
        numElements = 0;
        elements = new int[MAXSIZE];
        rear = MAXSIZE - 1;
    }

    public boolean isEmpty()
    // Returns true if this queue is empty; otherwise, returns false.
    {
        return (numElements == 0);
    }

    public boolean isFull()
    // Returns true if this queue is full; otherwise, returns false.
    {
        return (numElements == elements.length);
    }

    public int size()
    // Returns the number of elements in this queue.
    {
        return numElements;
    }

    public String toString()
    {
        String printData = "";

        if (isEmpty())
        {
            System.out.println("Print attempted on empty queue.");
        }
        else
        {
            //loops from the beginning of the queue to the end
            for(int i = front; i <= rear; i++)
            {
                //set the list to string and print it
                System.out.print(elements[i] + " ");
            }
        }
        return printData;
    }

    public void addToFront(int num)
    {
        //uses a temporary array to create "a new" one
        int[] tempArr = new int[elements.length + 1];

        System.out.println("\nAdding " + num + " to The Front:");

        if(isFull())
        {
            System.out.println("The Queue is Full.");
        }
        else
        {
            for (int i = 0, j = 0; i < elements.length; i++, j++)
            {
                if (i == 0)
                {
                    //when index is 0, add the value passed to the 0 position
                    tempArr[j] = num;
                    j++;
                }
                //pass the rest
                tempArr[j] = elements[i];
            }
            //move the last item position
            rear++;
            //copy the temporary array into elements array
            elements = tempArr.clone();
            //counts size up
            numElements++;
        }
    }

    public void addToEnd(int num)
    {
        if(isFull())
        {
            System.out.println("Queue is Full.");
        }
        else
        {
            rear = (rear + 1) % elements.length;
            elements[rear] = num;
            numElements++;
        }
    }

    public int removeFirstElement()
    {
        int num = elements[0];
        System.out.println("\nRemoving First Element:");

        if(isEmpty())
        {
            System.out.println("Queue is empty.");
            return 0;
        }
        else
        {
            for (int i = 0; i < numElements; i++)
            {
                elements[i] = elements[i + 1];
            }
            //size down
            numElements--;
            //shrink list
            rear--;
            return num;
        }
    }

    public int removeLastElement()
    {
        System.out.println("\nRemoving Last Element:");

        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return  0;
        }
        else {
            rear--;
            return elements[--numElements];
        }
    }
}
