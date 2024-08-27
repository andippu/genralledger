package journal.ledgerjournal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import journal.ledgerjournal.models.BebanSusut;
import journal.ledgerjournal.models.PeriodeGl;
import journal.ledgerjournal.models.ReportJurnalAll;
import journal.ledgerjournal.models.ReportJurnalAllCompKey;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface IReportJurnalAllRepository extends JpaRepository<ReportJurnalAll, ReportJurnalAllCompKey>{
	public List<ReportJurnalAll>findByRjalPeriodAndRjalVoucherNoContainingOrderByRjalVoucherNo (String Period, String voucher);
	
	

}
