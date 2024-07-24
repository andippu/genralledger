package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.models.PeriodeGl;
import journal.ledgerjournal.services.ServiceMasterJurnal;
import journal.ledgerjournal.services.ServicePeriodeGl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerPeriodeGl {
	@Autowired
	ServicePeriodeGl servPgl;
	
	@GetMapping("/msjur/getGlPeriod")
	public String getGlPeriod (){
		return servPgl.getGlPeriod();
	}
	
	@GetMapping("/msjur/getGlPeriodshort")
	public String getGlPeriodShort (){
		return servPgl.getGlPeriodShort();
	}
	
	@GetMapping("/msjur/getGlPeriodList")
	public List<PeriodeGl> getPeriodGlList(){
		return servPgl.getPeriodGlList();
	}
	
	@GetMapping("/msjur/exeupljurvpm")
	public String exeUpJurVpm() {
		return servPgl.exeUpJurVpm();
	}
	
	@GetMapping("/msjur/exeupljuruci")
	 public String exeUpJurUci() {
		 return servPgl.exeUpJurUci();
	 }
	 
	@GetMapping("/msjur/exeupljurpnys")
	 public String exeUpJurPnys() {
		 return servPgl.exeUpJurPnys();
	 }
	 
	@GetMapping("/msjur/exeupljurexpense")
	 public String exeUpJurExpense() {
		 return servPgl.exeUpJurExpense();
	 }

}
