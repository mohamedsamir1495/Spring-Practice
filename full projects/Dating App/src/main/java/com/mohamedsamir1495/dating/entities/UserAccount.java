package com.mohamedsamir1495.dating.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "User Name is mandatory")
	@Length(min=5,max=30,message = "User Name should be minimum 5 chars and maximum 30 char")
	private String userName;
	@NotBlank(message = "Password is mandatory")
	@Length(min=5,max=30,message = "Password should be minimum 5 chars and maximum 30 char")
	private String password;
	@NotNull(message = "Age is mandatory")
	@Min(value=18,message = "Min age is 18")
	@Max(value=45,message="Max age is 45")
	private int age;
	@NotBlank(message = "Email is mandatory")
	@Email(message="Provide a valid email")
	private String email;
	@NotBlank(message = "Email is mandatory")
	@Length(min=10,max=10,message = "Phone number should be 10 digits")
	private String phoneNumber;
	private String gender;
	private String city;
	private String country;
	@OneToOne(mappedBy = "userAccount")
	private Interest interest;

}
