package fr.axel584.WedoogiftChallenge.user;

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
import fr.axel584.WedoogiftChallenge.deposit.MealDeposit;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserTest {

	@Autowired
	private IUserService userService;
	
	@Test
	public void getBalanceTest() {
		User user = new User();
		List<Deposit> listDeposit=new ArrayList<Deposit>();
		user.setName("Jean-Pierre");
		// add a valid gift deposit on the user account
		Deposit gift = new GiftDeposit();
		gift.setValue(50.0);
		gift.setCreateDate(LocalDate.now());
		listDeposit.add(gift);
		user.setDeposits(listDeposit);
		Assertions.assertEquals(50.0, userService.getBalance(user),"The gift deposit is not correctly count in the user balance");
		// Add an expired deposit on the user account
		Deposit giftExpired = new GiftDeposit();
		giftExpired.setValue(50.0);
		giftExpired.setCreateDate(LocalDate.of(2020,05,11));
		listDeposit.add(giftExpired);
		user.setDeposits(listDeposit);
		Assertions.assertEquals(50.0, userService.getBalance(user),"The expired gift deposit is not correctly count in the user balance");
		// add a meal deposit on the user account
		Deposit mealDeposit = new MealDeposit();
		mealDeposit.setValue(9.0);
		mealDeposit.setCreateDate(LocalDate.now());
		listDeposit.add(mealDeposit);
		user.setDeposits(listDeposit);
		Assertions.assertEquals(59.0, userService.getBalance(user),"The meal deposit is not correctly count in the user balance");
		
		
	}
}
