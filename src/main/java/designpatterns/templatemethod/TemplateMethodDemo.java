package designpatterns.templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		EcommerceOrder ecommerceOrder = new EcommerceOrder(false);
		StoreOrder storeOrder = new StoreOrder(true);
		
		System.out.println("Ecommerce order:");
		ecommerceOrder.processOrder();
		
		System.out.println("Store order:");
		storeOrder.processOrder();
	}
}
