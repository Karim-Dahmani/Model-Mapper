package com.example.ateliermapper.dtos;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Long Id;
    private  String Name;
    private String Email;
}
