package journal.ledgerjournal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GlCcDetailCompKey implements Serializable{
	
private String glCcDtlCode;
private Integer glCcDtlSeqNo;

}
