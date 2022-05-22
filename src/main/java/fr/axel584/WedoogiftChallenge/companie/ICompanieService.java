package fr.axel584.WedoogiftChallenge.companie;

import fr.axel584.WedoogiftChallenge.deposit.Deposit;
import fr.axel584.WedoogiftChallenge.user.User;

public interface ICompanieService {
	
	void distributeDeposit(Companie companie, User user, Deposit deposit) throws BalanceTooLowException;

}
