package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.BebanSusut;
import journal.ledgerjournal.repository.IAccountRepository;
import journal.ledgerjournal.repository.IBebanSusutRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service

public class ServiceBebanSusut {
	@Autowired
	IBebanSusutRepository repoBebanSst;
	
	public List<BebanSusut> getBebanSstByDay(String day){
		return repoBebanSst.getBebanByDate(day);
	}
	
	public Optional<BebanSusut> getBebanSstSingle(String susutNo){
		return repoBebanSst.findById(susutNo);
	}
	
	public String addUpdateSusut(BebanSusut bs) {
		repoBebanSst.save(bs);
		return "Submit Susut Successfully";
	}
	
}
