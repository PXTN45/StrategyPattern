
public class ScanPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid by scan QR code: " + amount);
	}

}
