package Main;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	private static final Logger LOG = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);

	}

	  @RequestMapping("/") 
	  public String home() { 
		
		LOG.log(Level.INFO, "Creating new log");
		
	    return "Hello from microservice"; 

	  } 



}
