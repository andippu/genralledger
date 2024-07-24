package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.models.PeriodeGl;
import journal.ledgerjournal.repository.IMasterJurnalRepository;
import journal.ledgerjournal.repository.IPeriodeGlRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class ServicePeriodeGl {
	@Autowired
	IPeriodeGlRepository repoPgl;
	
	public String getGlPeriod (){
		return repoPgl.getGlPeriod();
	}
	
	public String getGlPeriodShort (){
		return repoPgl.getGlPeriodShort();
	}
	
	public List<PeriodeGl> getPeriodGlList(){
		return repoPgl.findAll();
	}
	
	public String exeUpJurVpm() {
		return repoPgl.exeUpJurVpm();
	}
	
	 public String exeUpJurUci() {
		 return repoPgl.exeUpJurUci();
	 }
	 
	 public String exeUpJurPnys() {
		 return repoPgl.exeUpJurPnys();
	 }
	 
	 public String exeUpJurExpense() {
		 return repoPgl.exeUpJurExpense();
	 }

}
