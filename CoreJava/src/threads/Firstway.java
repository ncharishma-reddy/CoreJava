package threads;

public class Firstway extends Thread {
	 public void run()
	 {
		 System.out.println("creation of thread by extending thread");
	 }
	public static void main(String[]args)
	{
		Firstway ob=new Firstway();
		ob.start();
		ob.stop();
		
	}

}
