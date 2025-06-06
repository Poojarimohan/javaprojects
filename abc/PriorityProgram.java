package abc;

public class PriorityProgram {

	public static void main(String[] args) {
		Thread lowpriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("low priority thread "+i);
			}
		});
	
		
		Thread highPriorityThread=new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("high priority thread "+i);
			}
			
		});
		
		lowpriorityThread.setPriority(Thread.MIN_PRIORITY);
		highPriorityThread.setPriority(Thread.MAX_PRIORITY);
		
		lowpriorityThread.start();
		highPriorityThread.start();

	}

}
