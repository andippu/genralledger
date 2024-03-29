package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.BebanSusut;
import journal.ledgerjournal.services.ServiceBebanSusut;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBebanSusut {
	@Autowired
	ServiceBebanSusut servBbnSst;
	
	@GetMapping("/msjur/getsusutlist")
	public List<BebanSusut> getBebanSstByDay(String day){
		return servBbnSst.getBebanSstByDay(day);
	}
	
	@GetMapping("/msjur/getsusutmonthlist")
	public List<BebanSusut> getBebanSstByMonth(String month){
		return servBbnSst.getBebanSstByMonth(month);
	}
	
	@GetMapping("/msjur/getsusutsingle")
	public Optional<BebanSusut> getBebanSstSingle(String susutNo){
		return servBbnSst.getBebanSstSingle(susutNo);
	}
	
	@PostMapping("/msjur/saveupdpenyusutan")
	public String addUpdateSusut(@RequestBody BebanSusut bs) {
		return servBbnSst.addUpdateSusut(bs);		
	}
	
	@GetMapping("/msjur/procSstDtl")
	public String getProcSstDtl(String susutNo) {
		return servBbnSst.getProcSstDtl(susutNo);
	}
	
	@GetMapping("/msjur/procSstJournal")
	public String getJournalSst() {
		return servBbnSst.getJournalSst();
	}

}
