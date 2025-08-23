package multi_Threading;
class Shared{
	int num;
	boolean ready=false;
	synchronized void produce(int n)
	{
		if(ready)return;
		num=n;
		System.out.println("Produce: "+num );
		ready=true;
		notify();
	}
	synchronized void consume()
	{
		while(!ready)
		{
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Cosumed: "+num);
	}
}

public class Wait_demo {

	public static void main(String[] args) 
	{
		Shared s=new Shared();
		new Thread(() -> s.produce(6)).start();
		new Thread(() -> s.consume()).start();

	}

}
