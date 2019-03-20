public class NoCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newATMMachine) {
		
		atmMachine = newATMMachine;
		
	}

	@Override
	public void insertCard() {
		
		System.out.println("Please Enter PIN");
		atmMachine.setATMState(atmMachine.getYesCardState());
		
	}

	@Override
	public void ejectCard() {

		System.out.println("Insert a card first");
		
	}

	@Override
	public void insertPin(int pinEntered) {

		System.out.println("Insert a card first");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {

		System.out.println("Insert a card first");
		
	}

}
