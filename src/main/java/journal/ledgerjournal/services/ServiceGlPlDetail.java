package journal.ledgerjournal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import journal.ledgerjournal.repository.IGlPlDetailRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceGlPlDetail {
	@Autowired
	IGlPlDetailRepository repoPlDtl;

}
