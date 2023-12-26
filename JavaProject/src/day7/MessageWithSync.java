package day7;

public class MessageWithSync {
	private String content;

	public MessageWithSync(String content) {
		this.content = content;
	}
	public synchronized void printMessage() throws InterruptedException{
		//This method prints the content using some decoration with some time gap: 1 Second
				System.out.println("***************************");
				Thread.sleep(2000);
				System.out.println(content);
				Thread.sleep(2000);
				System.out.println("***************************");
				Thread.sleep(2000);
	}
	

}
