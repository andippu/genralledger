package journal.ledgerjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LedgerjournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedgerjournalApplication.class, args);
	}

}
