package journal.ledgerjournal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.ReportBukuBesarAll;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface IReportBukuBesarAllRepository  extends JpaRepository<ReportBukuBesarAll, BigDecimal> {
	
	  @Procedure(procedureName = "P_RPT_BUKU_BESAR")
	  String getBukuBesarAll(String period, String ac1, String ac2);
	  
	  @Procedure(procedureName = "P_RPT_BUKU_BESAR_HUTANG")
	  String getBukuBesarHutang(String period, String ac1, String ac2);
	  
	  

}
