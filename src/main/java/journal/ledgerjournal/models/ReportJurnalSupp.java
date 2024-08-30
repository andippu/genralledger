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
public class ReportJurnalSupp {
	   @Id
	   @Column(name="RJSU_VOUCHER",length=14,  nullable = false)
	   private String rjsuVoucherNo;
	   
	   @Column(name="RJSU_DATE",length=2)
	   private String rjsuDate;
	   
	   @Column(name="RSJU_PERIOD",length=7)
	   private String rjsuPeriod;
	   
	   @Column(name="RSJU_PERIODMONTH",length=20)
	   private String rjsuPeriodMonth;
	   
	   @Column(name="RJSU_TYPE",length=100)
	   private String rjsuType;
	   
}
