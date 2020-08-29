package designpatterns.observer;

public class Store {
	
	public EventManager events;
	
	public Store() {
        this.events = new EventManager("discount", "advertise");
    }
	
	public void giveDiscount() {
		System.out.println("Giving discount...");
        events.notify("discount");
    }

    public void advertise()  {
    	System.out.println("Advertising...");
        events.notify("advertise");
    }

}
