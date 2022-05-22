package fr.axel584.WedoogiftChallenge.companie;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@Slf4j
public class Companie implements Serializable {

	private Integer Id;
	
	private String name;
	
	private Double balance;
	
}
