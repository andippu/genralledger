package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.BebanSusutDetail;
import journal.ledgerjournal.repository.IAccountRepository;
import journal.ledgerjournal.repository.IBebanSusutDtlRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceBebanSusutDetail {
	@Autowired
	IBebanSusutDtlRepository repoBbnSstDtl;
	
	public List<BebanSusutDetail> getSusutDtlList(String sstNo){
		return repoBbnSstDtl.findBySusutNo(sstNo);
	}

}
