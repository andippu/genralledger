package journal.ledgerjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.BebanSusut;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBebanSusutRepository extends JpaRepository<BebanSusut,String>{
	@Query(value="SELECT * FROM BEBAN_SUSUT_INSERT WHERE to_char(SUSUT_TGL_PEROLEHAN,'Mon dd yyyy')=?1 ORDER BY SUSUT_TGL_PEROLEHAN ",nativeQuery = true)
	List<BebanSusut> getBebanByDate(String day);
	
	@Query(value="SELECT * FROM BEBAN_SUSUT_INSERT WHERE to_char(SUSUT_TGL_PEROLEHAN,'Monyyyy')=?1 ORDER BY SUSUT_TGL_PEROLEHAN ",nativeQuery = true)
	List<BebanSusut> getBebanByMonth(String Month);
	
    @Procedure(procedureName = "PROC_SUSUT_DTL")
    String getProcSstDtl(String susutNo);
    
    @Procedure(procedureName = "PYNS_SUSUT")
    String getProcSstJournal();

}
