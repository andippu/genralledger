package journal.ledgerjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.GlAlMaster;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface IGlAlMasterRepository extends JpaRepository <GlAlMaster, String>{

}
