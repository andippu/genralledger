package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.Account;
import journal.ledgerjournal.services.ServiceAccount;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerAccount {
	@Autowired
	ServiceAccount servAcc;
	
	@GetMapping("/msjur/getaccountlist")
	public List<Account> getAccountList(){
		return servAcc.getAccountList();
	}
	
	

}
