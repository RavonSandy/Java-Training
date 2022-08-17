public class ThrdEx
{
public static void main(String[] args)
{
Thrd thread1 = new Thrd();
Thrd thread2 = new Thrd();
System.out.println("Thread1 thread priority : " + thread1.getPriority());   
System.out.println("Thread2 thread priority : " + thread2.getPriority()); 
System.out.println("Thread1 isAlive: "+thread1.isAlive());  
thread1.start();
System.out.println("Thread1 isAlive: "+thread1.isAlive()); 
System.out.println("Next Thread____"); 
System.out.println("Thread2 isAlive: "+thread2.isAlive()); 
thread2.start();
System.out.println("Thread2 isAlive: "+thread2.isAlive()); 

}
}
