public class CustomThread extends Thread
{
    private String threadNum;

    public void BeginThread(Integer i)
    {
        threadNum = i.toString();
        start();
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello, I am a thread" +
                    threadNum +
                    "!");

        }
        System.out.println("Thread " + threadNum + " done---");
    }
}
