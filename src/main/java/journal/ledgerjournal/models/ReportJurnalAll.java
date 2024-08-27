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
@Table(name = "RPT_JURNAL_ALL")
@IdClass(ReportJurnalAllCompKey.class)
public class ReportJurnalAll {
	
	   @Id
	   @Column(name="RJAL_VOUCHERNO",length=14,  nullable = false)
	   private String rjalVoucherNo;
	   
	   @Id
	   @Column(name="RJAL_HARI", length=2)
	   private String rjalHari;
	   
	 
	   @Column(name="RJAL_PERIOD", length=7)
	   private String rjalPeriod;	   
	   
	   @Column(name="RJAL_PERIODMONTH", length=18)
	   private String rjalPeriodMoth;	   
	   
	   @Column(name="RJAL_TYPE", length=17)
	   private String rjalType;

}
