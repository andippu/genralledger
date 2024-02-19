package journal.ledgerjournal.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.MasterJurnal;
import journal.ledgerjournal.models.MasterJurnalCompKey;

import java.math.BigDecimal;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IMasterJurnalRepository extends JpaRepository<MasterJurnal,MasterJurnalCompKey> {
	@Query(value="SELECT * FROM MASTER_JURNAL s WHERE TO_CHAR(s.MJ_DATE,'Mon dd yyyy')=?1",nativeQuery = true)
	List<MasterJurnal> getMstJurByDay(String day);
	
	@Query(value="SELECT * FROM MASTER_JURNAL s WHERE TO_CHAR(s.MJ_DATE,'Monyyyy')=?1",nativeQuery = true)
	List<MasterJurnal> getMstJurByMonth(String month);
	
    @Procedure(procedureName = "P_JOURNAL_SUM_CREDIT")
    BigDecimal getSumCreditJournal(String novoucher);
    
    @Procedure(procedureName = "P_JOURNAL_SUM_DEBET")
    BigDecimal getSumDebetJournal(String novoucher);
    
}
