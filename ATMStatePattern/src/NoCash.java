public class NoCash implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine) {
		
		atmMachine = newATMMachine;
		
	}

	@Override
	public void insertCard() {

		System.out.println("Sorry, this ATM is currently out of cash");
		
	}

	@Override
	public void ejectCard() {

		System.out.println("Sorry, this ATM is currently out of cash. You did not insert a card");
		
	}

	@Override
	public void insertPin(int pinEntered) {

		System.out.println("Sorry, this ATM is currently out of cash");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {

		System.out.println("Sorry, this ATM is currently out of cash");
		
	}
}
