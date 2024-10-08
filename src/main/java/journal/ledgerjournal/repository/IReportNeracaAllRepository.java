package journal.ledgerjournal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.ReportNeracaAll;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface IReportNeracaAllRepository extends JpaRepository<ReportNeracaAll, BigDecimal>{
	@Procedure(procedureName = "P_RPT_NERACA_ALL")
	String getNeracaAll(String period, String ac1, String ac2);
	
	@Procedure(procedureName = "P_TRIAL_BALANCED")
	String getTbToExcel(String period, String ac1, String ac2);
	
	@Procedure(procedureName = "P_TRIAL_BALANCED_ALL")
	String getTbToExcelAll(String period, String ac1, String ac2);
	
	
}
