package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.VPenyusutanType;
import journal.ledgerjournal.repository.IVPenyusutanTypeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceVSusutType {
 @Autowired
 IVPenyusutanTypeRepository repoSstType;
 
 public List<VPenyusutanType> getSusutType(){
	 return repoSstType.findAll();
 }
}
