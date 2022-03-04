public class NewThread implements Runnable
{
    int threadNum;

    public NewThread(){}

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
