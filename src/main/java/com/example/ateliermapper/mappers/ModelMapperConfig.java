package com.example.ateliermapper.mappers;

import com.example.ateliermapper.dtos.CustomerDTO;
import com.example.ateliermapper.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {
    private final ModelMapper modelMapper=new ModelMapper();

    public CustomerDTO fromCustomer(Customer customer){
        return this.modelMapper.map(customer, CustomerDTO.class);
    }

}
