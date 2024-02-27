package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.Account;
import journal.ledgerjournal.models.DetailJurnal;
import journal.ledgerjournal.repository.IAccountRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceAccount {
	@Autowired
	IAccountRepository repoAcc;
	
	public List<Account> getAccountList(){
		return repoAcc.findAll();
	}

}
