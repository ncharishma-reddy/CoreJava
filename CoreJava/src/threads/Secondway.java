package threads;

public class Secondway implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondway ob=new Secondway();
		Thread th=new Thread(ob);
		th.start();//runnable
		//th.start();
		th.run();//it will act as normal method calling
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("creation of thread by extending thread");

	}

}