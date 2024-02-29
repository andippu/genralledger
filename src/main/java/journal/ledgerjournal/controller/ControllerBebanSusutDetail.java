package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.BebanSusutDetail;
import journal.ledgerjournal.services.ServiceBebanSusutDetail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBebanSusutDetail {
	@Autowired
	ServiceBebanSusutDetail servBbnSstDtl;
	
	@GetMapping("/msjur/getsusutdtlList")
	public List<BebanSusutDetail> getSusutDtl(String sstNo){
		return servBbnSstDtl.getSusutDtlList(sstNo);
	}
	
}
