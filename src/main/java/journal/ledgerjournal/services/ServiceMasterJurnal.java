package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.repository.IMasterJurnalRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceMasterJurnal {
	@Autowired
	IMasterJurnalRepository repoMsJur;
	
	public List<MasterJurnal> getMstVoucherDay(String day){
		return repoMsJur.getMstJurByDay(day);
	}
	
	public List<MasterJurnal> getMstVoucherMonth(String month){
		return repoMsJur.getMstJurByMonth(month);
	}
	
	public List<MasterJurnal> getMstJurnalAll(){
		return repoMsJur.findAll();
	}
	
	public BigDecimal getSumDebet(String novoucher) {
		return repoMsJur.getSumDebetJournal(novoucher);		
	}
	
	public BigDecimal getSumCredit(String novoucher) {
		return repoMsJur.getSumCreditJournal(novoucher);		
	}
	
	public Optional<MasterJurnal> getJourna(String voucher) {
		return repoMsJur.findByMjNoVoucher(voucher);
	}
	


}

