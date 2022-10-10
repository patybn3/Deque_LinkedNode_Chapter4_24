<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 4 - Exercise 24</h5>

####variables used:

```java
    protected LLNode<T> front;     // reference to the front of this queue
    protected LLNode<T> rear;      // reference to the rear of this queue
    protected int numElements = 0; // number of elements in this queue
    String getString = "";         // used to print the items as a string
    LLNode<T> newNodeBack;
    LLNode<T> newNodeFront;

```

###Methods added to `DeQue.java` as required:

24) A “deque” is like a queue, but it also allows you to add to the front of the queue and
    to remove from the rear of the queue. Create a link-based DeQue class, and a test
    driver that demonstrates that it works correctly.
    
####added files from book:

- LLNode.java
- QueueOverflowException.java
- QueueUnderflowException.java
- DequeInterface.java

`String toString()` creates and returns a string that correctly represents
the current queue. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```

```java
    //adding elements to the front and the rear    
    void enqueueFront(T element) throws QueueOverflowException;
    void enqueueRear(T element) throws QueueOverflowException;
    //removing elements from the front and the rear
    T dequeueFront() throws QueueUnderflowException;
    T dequeueRear() throws QueueUnderflowException;

    boolean isFull();
    boolean isEmpty();
    int size();
```

###Main class: Chapter4_24_PatriciaAntlitz.java

<hr>
<h5>Problems:</h5>

No problems, I used exercise 22 from Chapter 4, as an example for this
removing from the back was a challenge. I still don't know how I was able to make that work. It took a lot of research, but I still dont fully understand how it works.

sources: <br>
https://www.geeksforgeeks.org/remove-last-node-of-the-linked-list/ <br>
https://www.alphacodingskills.com/ds/notes/linked-list-delete-the-last-node.php

<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter4_24_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter4_24_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter4_24_PatriciaAntlitz.java => compile
    * java Chapter4_24_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)