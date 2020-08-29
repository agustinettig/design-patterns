package designpatterns.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		Store store = new Store();
		store.events.subscribe("discount", new SmsNotificationListener());
		store.events.subscribe("discount", new EmailNotificationListener());
		store.events.subscribe("advertise", new EmailNotificationListener());

		store.giveDiscount();
		store.advertise();		
	}
}
