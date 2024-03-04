package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.VPenyusutanType;
import journal.ledgerjournal.services.ServiceVSusutType;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVSusutType {
	@Autowired
	ServiceVSusutType servSusutType;
	
	@GetMapping("/msjur/getvsusuttype")
	public List<VPenyusutanType> getSusutType(){
		 return servSusutType.getSusutType();
	 }

}
