public class NewThread implements Runnable
{
    /**
     * Just an identifier for the thread
     */
    int threadNum;

    /**
     * Default constructor
     */
    public NewThread(){}

    /**
     * Constructor for when the thread is created (aka New state)
     * @param i The id
     */
    public NewThread(int i)
    {
        threadNum = i;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 25; i ++)
        {
            System.out.println("Hello, I am a thread" +
                    threadNum +
                    "!");
        }
        System.out.println("Thread " + threadNum + " done---");
    }
}
