public class HasCard implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine) {
		
		atmMachine = newATMMachine;
		
	}

	@Override
	public void insertCard() {
		
		System.out.println("You can't insert more than one card");
		
	}

	@Override
	public void ejectCard() {
		
		System.out.println("Ejecting Card");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234) {
			System.out.println("Correct PIN Entered");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("Wrong PIN Entered");
			atmMachine.correctPinEntered = false;
			System.out.println("Ejecting Card");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		
		System.out.println("Enter PIN First !");
		
	}

}
