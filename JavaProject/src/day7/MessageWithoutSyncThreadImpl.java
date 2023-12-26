package day7;

public class MessageWithoutSyncThreadImpl extends Thread {
	private MessageWithoutSync msg;

	public MessageWithoutSyncThreadImpl(MessageWithoutSync msg) {
		super();
		this.msg = msg;
	}
	
	public void run() {
		try {
			msg.printMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
