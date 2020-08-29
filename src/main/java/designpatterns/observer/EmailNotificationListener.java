package designpatterns.observer;

public class EmailNotificationListener implements EventListener {

	@Override
	public void execute(String eventType) {
		System.out.println("Email sent, event type: " + eventType);		
	}

}
