package com.harsh.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	
	
	private Integer userId;
	@Pattern(regexp = "([A-Z]{1}[a-z]+)( [A-Z]{1}[a-z])*", message = "{invalid.customer.format}")
	private String userName;
	@NotNull(message = "{email.absent}")
	@Pattern(regexp = "[a-zA-Z0-9._]+@[a-zA-Z]{2,}\\.[a-zA-Z]+",message="{invalid.email.format}")
	private String emailId;
	@Pattern(regexp="[6-9][0-9]{9}",message="{invalid.contactNumber}")
	private String contactNumber;
	@NotNull(message = "{passowrd.absent}")
	@Pattern(regexp=".*[A-Z]+.*",message="{invalid.password.uppercase.absent}")
	@Pattern(regexp=".*[a-z]+.*",message="{invalid.password.lowercase.absent}")
	@Pattern(regexp=".*[!@#$%^&*].*",message="{invalid.password.specialcharacters.absent}")
	private String password;
	
}
