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
@Table(name = "PERIODE_GL")
public class PeriodeGl {
	 @Id
	 @Column(name="PGL_DATE",  nullable = false)
	 private Date PglDate;
	 
	 @Column(name="PGL_DATE_BEGIN")
	 private Date PglDateBegin;
	 
	 @Column(name="PGL_DATE_END")
	 private Date PglDateEnd;	

}
