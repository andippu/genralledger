package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.VPenyusutanMerk;
import journal.ledgerjournal.services.ServiceVSusutMerk;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVSusutMerk {
	@Autowired
	ServiceVSusutMerk servSusutMerk;
	
	@GetMapping("/msjur/getvsusutmerk")
	public List<VPenyusutanMerk> getSusutMerkList(){
		  return servSusutMerk.getSusutMerkList();
	  }

}
