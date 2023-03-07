package com.hsc.form.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message="User name can't be blank")
	@Size(min=3, max=12, message="User name should be of 3-12 characters")
	private String username;

	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$", message="Your passwordmust have 8-10 characters, at least one uppercase letter, one lowercase letter, one number and one special character")
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid email")
	private String email;

	@AssertTrue(message = "Must accept terms and conditions")
	private boolean agreed;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + ", agreed=" + agreed + "]";
	}

}
