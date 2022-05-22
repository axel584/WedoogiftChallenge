package fr.axel584.WedoogiftChallenge.companie.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.axel584.WedoogiftChallenge.deposit.Deposit;
import fr.axel584.WedoogiftChallenge.companie.BalanceTooLowException;
import fr.axel584.WedoogiftChallenge.companie.Companie;
import fr.axel584.WedoogiftChallenge.companie.ICompanieService;
import fr.axel584.WedoogiftChallenge.user.User;

@Service
public class CompanieService implements ICompanieService {

	List<User> users = new ArrayList<User>(); // On stocke les utilisateurs dans le service, dans un projet "normal", on aurait un repository chargé avec un @autowired pour les stocker en base
	
	@Override
	public void distributeDeposit(Companie companie,User user, Deposit deposit) throws BalanceTooLowException {
		if (companie.getBalance()<deposit.getValue()) {
			throw new BalanceTooLowException("The companie balance is too low for this deposit");
		}
		List<Deposit> listDeposit = user.getDeposits();
		listDeposit.add(deposit);
		user.setDeposits(listDeposit);
		companie.setBalance(companie.getBalance()-deposit.getValue());
	}


	
	

}
