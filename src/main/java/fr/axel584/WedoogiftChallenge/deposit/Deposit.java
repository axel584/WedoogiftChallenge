package fr.axel584.WedoogiftChallenge.deposit;

import java.time.LocalDate;

import lombok.Data;

@Data
public abstract class Deposit {
	
	private Double value;
	
	private LocalDate createDate;
	
	public abstract LocalDate getExpireDate();
	
	public Boolean isValid() {
		return this.getExpireDate().isAfter(LocalDate.now());
	}
	
}
