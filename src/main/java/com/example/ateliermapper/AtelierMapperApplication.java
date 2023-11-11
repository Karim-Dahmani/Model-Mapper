package com.example.ateliermapper;

import com.example.ateliermapper.dtos.CustomerDTO;
import com.example.ateliermapper.entities.Customer;
import com.example.ateliermapper.mappers.ModelMapperConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class AtelierMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtelierMapperApplication.class, args);
    }

    @Autowired
    private ModelMapperConfig customerMapper;


    @Bean
  public   CommandLineRunner start() {
        return args -> {
            Customer customer = Customer.builder()
                    .Name("karim")
                    .Email("karim@gmail.com")
                    .Password("karim123")
                    .build();
            Customer customer1 = Customer.builder()
                    .Name("youness")
                    .Email("Youness@gmail.com")
                    .Password("y123")
                    .build();
            Customer customer2 = Customer.builder()
                    .Name("Amine")
                    .Email("Amine@gmail.com")
                    .Password("A12345")
                    .build();

            List<Customer> customers = new ArrayList<>();

            customers.add(customer);
            customers.add(customer1);
            customers.add(customer2);

            List<CustomerDTO> customerdtoslist = customers.stream().map(customerMapper::fromCustomer)
                    .collect(Collectors.toList());
            System.out.println(customerdtoslist);

        };

    }

}
