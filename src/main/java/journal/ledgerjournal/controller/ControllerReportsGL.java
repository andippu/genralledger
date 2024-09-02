package journal.ledgerjournal.controller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
import java.io.IOException;
import java.io.OutputStream;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController 
//@RequestMapping("/api/spreadsheet")
@CrossOrigin("http://localhost:4200")
public class ControllerReportsGL {
	@Autowired
	ServiceReportsGL servGL;
	 private final Path fileStorageLocation = Paths.get("D:\\UPLOADFILES");
	 
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
	 
	 @GetMapping("/pdf/reportBukuBesarHutang")
	 public void BukuBesarHutangPDF(String period, String ac1, String ac2, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Jurnal All " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servGL.LapBukuBesarHutang(period, ac1, ac2, response);
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
	 
		   

		@GetMapping("/download/tbtoexcel")
		public ResponseEntity<Resource> downloadFile(@RequestParam String filename, String period, String ac1, String ac2) {
		    	String temp = servGL.getTbToExcel(period, ac1, ac2);
		    	
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(filename).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
		
		@GetMapping("/download/tbtoexcelall")
		public ResponseEntity<Resource> downloadFileAll(@RequestParam String filename, String period, String ac1, String ac2) {
		    	String temp = servGL.getTbToExcelAll(period, ac1, ac2);
		    	
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(filename).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
}
