public class Driver
{
    public static void main(String[] args)
    {
        CustomThread t1 = new CustomThread();
        CustomThread t2 = new CustomThread();
        NewThread t3 = new NewThread(3);

        t1.BeginThread(1);
        t2.BeginThread(2);

        t3.run();
    }
}
