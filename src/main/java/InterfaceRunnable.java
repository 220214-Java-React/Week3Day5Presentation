
public class InterfaceRunnable implements Runnable {
    //A functional interface contains 1 abstract method
    //From jav 8 and on lambda can be used in them to represent an instance of one

    //Runnable, ActionListeners, and Comparable are some examples of them


    //Runable - Does not allow input and Does not return a Value. It is a function without peramiters


    @Override
    public void run() {
        System.out.println("Runnable Traditional approach 1");
    }


    public static void main(String[] args) throws InterruptedException {
        // Tradition approach 1
        InterfaceRunnable first = new InterfaceRunnable();
        Thread traditionalThread = new Thread(first);

        traditionalThread.start();

        // Tradition approach 2
        InterfaceRunnable second = new InterfaceRunnable();
        Thread traditionalThread2 = new Thread(second);
        traditionalThread2.start();

        // Runnable using java 8 lambda
        Runnable myTask = () -> System.out.println("Runnable using Java 8 lambda approach");
        Thread thread = new Thread(myTask);
        thread.start();

        //ActionListeners -This only runs actionPerformed()method
        //Comparable - this can only use compareTo() method

    }
}

