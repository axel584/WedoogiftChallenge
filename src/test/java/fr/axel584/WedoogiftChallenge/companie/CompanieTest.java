package fr.axel584.WedoogiftChallenge.companie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fr.axel584.WedoogiftChallenge.deposit.Deposit;
import fr.axel584.WedoogiftChallenge.deposit.GiftDeposit;
import fr.axel584.WedoogiftChallenge.user.User;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CompanieTest {

	
	@Autowired
	ICompanieService companieService;
	
	@Test
	public void distributeDepositTest() {
		User user = new User();
		user.setName("Jean-Pierre");
		Companie companie = new Companie();
		companie.setBalance(500.0);
		
		try {
			// add a valid gift deposit on the user account
			Deposit gift1 = new GiftDeposit();
			gift1.setValue(300.0);
			gift1.setCreateDate(LocalDate.now());
			companieService.distributeDeposit(companie, user, gift1);
			Assertions.assertEquals(1, user.getDeposits().size(),"The user owns the gift deposit");
		} catch (BalanceTooLowException e) {
			e.printStackTrace();
		}
		
		// add a gift deposit on the user account which is higher that the balance of the companie
		// exception should be thrown
		Deposit gift2 = new GiftDeposit();
		gift2.setValue(300.0);
		gift2.setCreateDate(LocalDate.now());
		Assertions.assertThrows(BalanceTooLowException.class, () -> {companieService.distributeDeposit(companie, user, gift2);}, "BalanceTooLowException was expected");

		
	}
	
}
