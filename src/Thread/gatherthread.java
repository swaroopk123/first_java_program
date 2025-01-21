package Thread;

public class gatherthread implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" one by one thread print seconde"+Thread.currentThread().getName()+i);
			try {
				Thread.sleep(4500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
