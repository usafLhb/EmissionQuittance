package Quittance.EmissionQuittance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class EmissionQuittanceApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmissionQuittanceApplication.class, args);
		System.out.println("Compiled");
	}
/*	public Docket apis(){
		return new Docket(DocumentationType.SWAGGER_12).select().apis(RequestHandlerSelectors.basePackage("com.demo")).build();
	}*/

}
