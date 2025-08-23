package multi_Threading;

class myrun1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		System.out.println("Current thread name="+Thread.currentThread().getName());
	}
}
public class Myrun {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		myrun1 t=new myrun1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();

	}

}
