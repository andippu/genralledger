package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.services.ServiceMasterJurnal;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerMasterJurnal {
	@Autowired
   ServiceMasterJurnal servMstJur;
	
	@GetMapping("/msjur/getmsjurnalbyday")
	public List<MasterJurnal> getMstVoucherDay(String day){
		return servMstJur.getMstVoucherDay(day);
	}
	
	@GetMapping("/msjur/getmsjurnalbymonth")
	public List<MasterJurnal> getMstVoucherMonth(String month){
		System.out.println("asfasfdsafsafd");
		return servMstJur.getMstVoucherMonth(month);
	}
	
	@GetMapping("/msjur/getmsjurall")
	public List<MasterJurnal> getMstJurnalAll(){
		return servMstJur.getMstJurnalAll();
	}
	
	@GetMapping("/msjur/getsumdebetjournal")
	public BigDecimal getSumDebet(String novoucher) {
		return servMstJur.getSumDebet(novoucher);
	}
	
	@GetMapping("/msjur/getsumcreditjournal")
	public BigDecimal getSumCredit(String novoucher) {
		return servMstJur.getSumCredit(novoucher);
	}
}
