package journal.ledgerjournal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_JURNAL_SUP")
@IdClass(ReportJurnalSuppCompKey.class)
public class ReportJurnalSupp {
	   @Id
	   @Column(name="RJSU_VOUCHER",length=14,  nullable = false)
	   private String rjsuVoucherNo;
	   
	   @Id
	   @Column(name="RJSU_SEQ")
	   private Integer rjsuHari;
	   
	   @Column(name="RJSU_DATE",length=2)
	   private String rjsuDate;
	   
	   @Column(name="RJSU_ACCNO",length=15)
	   private String rjsuAccNo;
	   
	   @Column(name="RSJU_PERIOD",length=7)
	   private String rjsuPeriod;
	   
	   @Column(name="RSJU_PERIODMONTH",length=20)
	   private String rjsuPeriodMonth;
	   
	   @Column(name="RSJU_DESC",length=100)
	   private String rjsuDesc;
	   
	   @Column(name="RJSU_DEBET")
	   private BigDecimal rjsuDebet;
	   
	   @Column(name="RSJU_CREDIT")
	   private BigDecimal rjsuCredit;
	   
	   @Column(name="RJSU_TYPE",length=100)
	   private String rjsuType;
	   
	
}
