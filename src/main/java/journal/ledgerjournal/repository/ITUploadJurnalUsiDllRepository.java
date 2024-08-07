package journal.ledgerjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.TUploadJurnalUsiDll;

import java.util.Date;
import java.util.List;

@Repository
public interface ITUploadJurnalUsiDllRepository extends JpaRepository<TUploadJurnalUsiDll, Integer> {

}
