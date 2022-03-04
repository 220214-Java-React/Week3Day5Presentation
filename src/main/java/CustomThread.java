public class CustomThread extends Thread
{
    /**
     * Just an identifier for the thread
     */
    private int threadNum;

    /**
     * Default constructor
     */
    public void BeginThread(){}

    /**
     * Constructor for when the thread is created (aka New state)
     * @param i The id
     */
    public void BeginThread(int i)
    {
        threadNum = i;
        start();
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello, I am a thread" +
                    threadNum +
                    "!");
            if (i == 5)
            {
                try
                {
                    Thread.sleep(2000);
                    i++;
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Thread " + threadNum + " done---");
    }
}
