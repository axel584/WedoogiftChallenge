package fr.axel584.WedoogiftChallenge.deposit;

import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.TemporalAdjusters.*;

public class MealDeposit extends Deposit {

	@Override
	public LocalDate getExpireDate() {
		LocalDate expireDate = LocalDate.from(getCreateDate()).plusYears(1).withMonth(Month.FEBRUARY.getValue()).with(lastDayOfMonth());
		return expireDate;
	}

}
