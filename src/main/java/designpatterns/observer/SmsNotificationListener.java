package designpatterns.observer;

public class SmsNotificationListener implements EventListener {

	@Override
	public void execute(String eventType) {
		System.out.println("SMS sent, event type: " + eventType);
	}

}
