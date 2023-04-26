package nemngoaile;

public class ThrowExcep {
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}
// lệnh throw đoạn mã trên dùng để ném ngoại lệ
//  throw new NullPointerException("demo"); dùng để ném ngoại lệ NullPointerException
// throw e dùng để ném ngoại lệ e
// khi thực thi đoạn mã trên in ra Caught inside fun().
// Caught in main.

