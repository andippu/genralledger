package journal.ledgerjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import journal.ledgerjournal.services.ServiceReportsGL;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin("http://localhost:4200")
public class ControllerReportsGL {
	@Autowired
	ServiceReportsGL servGL;
	
	 @GetMapping("/pdf/reportJurnalAll")
	 public void JurnalAllPDF(String period, String voucher, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapJurnalAll(period, voucher, response);
	    }
	 
	 @GetMapping("/pdf/reportJurnalAllDesc")
	 public void JurnallAllDescPDF(String period, String voucher, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapJurnalAllDesc(period, voucher, response);
	    }
	 
	 @GetMapping("/pdf/reportBukuBesarAll")
	 public void BukuBesarAllPDF(String period, String ac1, String ac2, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapBukuBesarAllc(period, ac1, ac2, response);
	    }
	 
	 @GetMapping("/pdf/reportNeracaAll")
	 public void NeracaAllPDF(String period, String ac1, String ac2, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapNeracaAll(period, ac1, ac2, response);
	    }
	 
	 @GetMapping("/pdf/reportJurnalSup")
	 public void JurnalSuppPDF(String Period, String voucher, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapJurnalSupp(Period, voucher,  response);
	   }

}
