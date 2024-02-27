package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.DetailJurnal;
import journal.ledgerjournal.repository.IDetailJurnalRepository;
import journal.ledgerjournal.repository.IMasterJurnalRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceDetailJurnal {
	@Autowired
	IDetailJurnalRepository repoDtljur;
	
	public List<DetailJurnal> getDtlJurnalList(String Voucher){
		return repoDtljur.findByDjMjNoVoucherOrderByDjSeq(Voucher);
	}
	
	public List<DetailJurnal> getDtlJurnalSingle(String Voucher, Integer seqNo){
		return repoDtljur.getDtlJurSingle(Voucher,seqNo);
	}

}
