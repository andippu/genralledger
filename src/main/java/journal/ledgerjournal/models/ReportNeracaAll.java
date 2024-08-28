package journal.ledgerjournal.models;


import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_NERACA_ALL")
public class ReportNeracaAll {
	 @Id
	 @Column(name="RNAL_ID",  nullable = false)
	 private BigDecimal rnalId;
	 
	 @Column(name="RNAL_PERIOD", length=8)
	 private String rnalPeriod;
	 
	 @Column(name="RNAL_PERIODMONTH", length=20)
	 private String rnalPeriodMonth;
	 
	 @Column(name="RNAL_ACCNO", length=15)
	 private String rnalAccNo;
	 
	 @Column(name="RNAL_ACCDESC", length=100)
	 private String rnalAccDesc;
	 
	 @Column(name="RNAL_DEBETAWAL")
	 private BigDecimal rnalDebetAwal;
	 
	 @Column(name="RNAL_CREDITAWAL")
	 private BigDecimal rnalCreditAwal;
	 
	 @Column(name="RNAL_DEBETMUTASI")
	 private BigDecimal rnalDebetMut;
	 
	 @Column(name="RNAL_CREDITMUTASI")
	 private BigDecimal rnalCreditMut;
	 
	 @Column(name="RNAL_DEBETAKHIR")
	 private BigDecimal rnalDebetAkhir;
	 
	 @Column(name="RNAL_CREDITAKHIR")
	 private BigDecimal rnalCreditAkhir;

}
