package com.example.Custom_Serial_Deserial;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {
    @JsonProperty("customerId")
    private Long id;

    @JsonProperty("customerName")
    private String name;

    @JsonProperty("customerEmail")
    private String email;

    
}
