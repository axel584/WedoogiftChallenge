package fr.axel584.WedoogiftChallenge.user.impl;

import org.springframework.stereotype.Service;

import fr.axel584.WedoogiftChallenge.deposit.Deposit;
import fr.axel584.WedoogiftChallenge.user.IUserService;
import fr.axel584.WedoogiftChallenge.user.User;

@Service
public class UserService implements IUserService{
	
	public Double getBalance(User user) {
		Double sum=0.0;
		for(Deposit deposit : user.getDeposits()) {
			if (deposit.isValid()) {
				sum+=deposit.getValue();
			}
		}
		return sum;
	}

}
