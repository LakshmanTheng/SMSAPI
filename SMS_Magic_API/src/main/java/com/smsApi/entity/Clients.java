package com.smsApi.entity;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Clients {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotBlank
	    private String name;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	    
	    @ManyToOne
	    @JoinColumn(name = "company_id")
	    private Company company;
	    
	    @Email
	    private String email;
	    
	    @Pattern(regexp="[0-9]+")
	    private String phone;

		public Clients() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Clients(Long id, @NotBlank String name, User user, Company company, @Email String email,
				@Pattern(regexp = "[0-9]+") String phone) {
			super();
			this.id = id;
			this.name = name;
			this.user = user;
			this.company = company;
			this.email = email;
			this.phone = phone;
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the user
		 */
		public User getUser() {
			return user;
		}

		/**
		 * @param user the user to set
		 */
		public void setUser(User user) {
			this.user = user;
		}

		/**
		 * @return the company
		 */
		public Company getCompany() {
			return company;
		}

		/**
		 * @param company the company to set
		 */
		public void setCompany(Company company) {
			this.company = company;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the phone
		 */
		public String getPhone() {
			return phone;
		}

		/**
		 * @param phone the phone to set
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Clients [id=" + id + ", name=" + name + ", user=" + user + ", company=" + company + ", email="
					+ email + ", phone=" + phone + "]";
		}	
	
	    
}
