package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.DetailJurnal;
import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.services.ServiceDetailJurnal;
import journal.ledgerjournal.services.ServiceMasterJurnal;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class controllerDetailJurnal {
	@Autowired
	ServiceDetailJurnal servdtljurnal;
	
	@GetMapping("/msjur/getdtjurlist")
	public List<DetailJurnal> getDtlJurnalList(String Voucher){
		return servdtljurnal.getDtlJurnalList(Voucher);
	}
	
	@GetMapping("/msjur/getdtjursingle")
	public List<DetailJurnal> getDtlJurnalSingle(String voucher, Integer seqno){
		return servdtljurnal.getDtlJurnalSingle(voucher, seqno);
	}

}
