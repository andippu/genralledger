package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import journal.ledgerjournal.models.VPenyusutanDept;
import journal.ledgerjournal.services.ServiceVSusutDept;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVSusutDept {
	@Autowired
	ServiceVSusutDept servSusutDept;
	
	@GetMapping("/msjur/getvsusutdept")
	public List<VPenyusutanDept> getSusutDeptList(){
		return servSusutDept.getSusutDeptList();
	}
	

}
