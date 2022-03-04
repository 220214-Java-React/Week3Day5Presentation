public class CustomThread extends Thread
{
    private String threadNum;

    public void BeginThread(Integer i)
    {
        threadNum = i.toString();
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
