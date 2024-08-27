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
@Table(name = "RPT_BUKU_BESAR")
public class ReportBukuBesarAll {
	
	 @Id
	 @Column(name="RBBA_ID",  nullable = false)
	 private BigDecimal rbbaId;
	 
	 @Column(name="RBBA_ACCNO", length=15)
	 private String rbbaAccNo;
	 
	 @Column(name="RBBA_ACCDESC", length=100)
	 private String rbbaAccDesc;
	 
	 @Column(name="RBBA_NILAI")
	 private BigDecimal rbbaNilai;
	 
	 @Column(name="RBBA_PERIOD", length=7)
	 private String rbbaPeriod;
	 
	 @Column(name="RBBA_PERIODMONTTH", length=20)
	 private String rbbaPeriodMonth;
	 
	 @Column(name="RBBA_HARI", length=2)
	 private String rbbaHari;
	 
	 @Column(name="RBBA_VOUCHER", length=20)
	 private String rbbaVoucher;
	 
	 @Column(name="RBBA_DESC", length=100)
	 private String rbbaDesc;
	 
	 @Column(name="RBBA_DEBET")
	 private BigDecimal rbbaDebet;
	 
	 @Column(name="RBBA_CREDIT")
	 private BigDecimal rbbaCredit;
	 
	 @Column(name="RBBA_TOTAL")
	 private BigDecimal rbbaTotalt;
	 
	 @Column(name="RBBA_AKHIR")
	 private BigDecimal rbbaAkhir;

}
