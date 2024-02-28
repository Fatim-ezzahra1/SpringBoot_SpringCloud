package org.fz;

import java.util.stream.Stream;

import org.fz.dao.CompanyRepository;
import org.fz.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CompanyServiceApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
	
	
	
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				companyRepository.save(new Company(null,cn,100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);
			System.out.println("test");
			System.out.println("test2");
		};
	}



	/*@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Second Method");
		// TODO Auto-generated method stub
		
	}*/

}

