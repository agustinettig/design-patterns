package designpatterns.templatemethod;

abstract class OrderProcessTemplate {
	
	private boolean isGift = false;
	
	protected abstract void receivePayment(); 	
	protected abstract void delivery();
	
	public OrderProcessTemplate(boolean isGift) {
		this.isGift = isGift;
	}
	
	public void processOrder() {
		receivePayment();
		if (isGift) { 
			wrapForGift();
		}
		delivery();		
	}
	
	private void wrapForGift() 
    { 
		System.out.println("Wrapping for gift");        
    }
	
}
