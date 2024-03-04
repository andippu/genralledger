package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.models.VPenyusutanMerk;
import journal.ledgerjournal.repository.IVPenyusutanMerkRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceVSusutMerk {
  @Autowired
  IVPenyusutanMerkRepository repoSstMerk;
  
  public List<VPenyusutanMerk> getSusutMerkList(){
	  return repoSstMerk.findAll();
  }
}
