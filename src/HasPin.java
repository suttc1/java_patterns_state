public class HasPin implements ATMState {
	
	ATMMachine atmMachine;
	
	public HasPin(ATMMachine newATMMachine) {
		
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
		
		System.out.println("PIN already entered");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		
		if(cashToWithdraw > atmMachine.cashInMachine) {
			
			System.out.println("Not enough cash in Machine");
			System.out.println("Ejecting Card");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		} else {
			
			System.out.println(cashToWithdraw + " is provided now");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			System.out.println("Ejecting Card");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
		
	}

}
