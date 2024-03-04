package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.VPenyusutanDept;
import journal.ledgerjournal.repository.IVPenyusutanDeptRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceVSusutDept {
	@Autowired
	IVPenyusutanDeptRepository repoSstDept;
	
	public List<VPenyusutanDept> getSusutDeptList(){
		return repoSstDept.findAll();
	}
}
