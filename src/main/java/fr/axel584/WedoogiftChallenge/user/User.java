package fr.axel584.WedoogiftChallenge.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.axel584.WedoogiftChallenge.deposit.Deposit;
import lombok.Data;

@Data
public class User implements Serializable{


	private Integer Id;
	
	private String name;
	
	private List<Deposit> deposits;

	public User() {
		super();
		deposits = new ArrayList<>();
	} 
	
	
	
}
