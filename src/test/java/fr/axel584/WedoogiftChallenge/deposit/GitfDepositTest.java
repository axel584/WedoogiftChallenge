package fr.axel584.WedoogiftChallenge.deposit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GitfDepositTest {

	
	@Test
    public void giftDepositExpireDateTest() {
		 	// Gift rule
	        GiftDeposit gift = new GiftDeposit();
	        gift.setCreateDate(LocalDate.of(2021, 6, 15));
	        Assertions.assertEquals(LocalDate.of(2022, 6, 14),gift.getExpireDate(),"expire Date test failed for gift deposit");
	    }
	 
	 @Test void mealDepositExpireDateTest() {
		// Meal Deposit rule
	        MealDeposit meal = new MealDeposit();
	        meal.setCreateDate(LocalDate.of(2020, 1, 1));
	        Assertions.assertEquals(LocalDate.of(2021, 02, 28),meal.getExpireDate(),"expire Date test failed for meal deposit");
	 }
	 
	 
	
}
