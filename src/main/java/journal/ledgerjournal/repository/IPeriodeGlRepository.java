package journal.ledgerjournal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.BebanSusut;
import journal.ledgerjournal.models.PeriodeGl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface IPeriodeGlRepository extends JpaRepository<PeriodeGl, Date> {
	
	@Query(value="SELECT replace((to_char(max(PGL_DATE),'dd-Month-yyyy')),' ') FROM PERIODE_GL",nativeQuery = true)
	String getGlPeriod();
	
	@Query(value="SELECT replace((to_char(max(PGL_DATE),'mmyyyy')),' ') FROM PERIODE_GL",nativeQuery = true)
	String getGlPeriodShort();
	
	  @Procedure(procedureName = "P_CSV_JUEXPENSES")
	  public String exeUpJurExpense();
	  
	  @Procedure(procedureName = "P_CSV_JUPNYS")
	  public String exeUpJurPnys();
	  
	  @Procedure(procedureName = "P_CSV_JUUCI")
	  public String exeUpJurUci();
	  
	  @Procedure(procedureName = "P_CSV_JUVPM")
	  public String exeUpJurVpm();
	
	
	

}
