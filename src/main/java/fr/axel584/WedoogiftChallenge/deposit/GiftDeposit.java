package fr.axel584.WedoogiftChallenge.deposit;

import java.time.LocalDate;

public class GiftDeposit extends Deposit {

	
	public LocalDate getExpireDate() {
		return this.getCreateDate().plusDays(364);
	}
	
}
