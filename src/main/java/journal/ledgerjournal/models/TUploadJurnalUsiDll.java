package journal.ledgerjournal.models;

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
@Table(name = "TUP_JURNALUSIDLL")
public class TUploadJurnalUsiDll {
	
	 @Id
	 @Column(name="TUJUD_ID",  nullable = false)
	 private Integer tujudId;
	
	 @Column(name="TUJUD_K1", length =100)
	 private Integer tujudK1;
	 
	 @Column(name="TUJUD_K2", length =100)
	 private Integer tujudK2;
	 
	 @Column(name="TUJUD_K3", length =100)
	 private Integer tujudK3;
	 
	 @Column(name="TUJUD_K4", length =100)
	 private Integer tujudK4;
	 
	 @Column(name="TUJUD_K5", length =100)
	 private Integer tujudK5;
	 
	 @Column(name="TUJUD_K6", length =100)
	 private Integer tujudK6;
	 
	 @Column(name="TUJUD_K7", length =100)
	 private Integer tujudK7;
	 
	 @Column(name="TUJUD_K8", length =100)
	 private Integer tujudK8;
}
