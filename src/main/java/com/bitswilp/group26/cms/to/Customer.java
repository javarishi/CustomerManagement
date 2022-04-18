package com.bitswilp.group26.cms.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CREATE TABLE `customer` (
  `CUSTOMER_ID` int NOT NULL AUTO_INCREMENT,
  `CUSTOMER_TYPE` varchar(45) DEFAULT NULL,
  `FIRST_NAME` varchar(45) DEFAULT NULL,
  `LAST_NAME` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  `HOME_PHONE` varchar(45) DEFAULT NULL,
  `BUSINESS_PHONE` varchar(45) DEFAULT NULL,
  `CELL_PHONE` varchar(13) DEFAULT NULL,
  `MAILING_ADDRESS` varchar(200) DEFAULT NULL,
  `ZIP_CODE` varchar(10) DEFAULT NULL,
  `MAILING_STATE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 *
 */

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id @Column(name = "CUSTOMER_ID")
	@GeneratedValue(generator = "native")
	private int customerId;
	
	@Column(name = "CUSTOMER_TYPE")
	private String customerType;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "HOME_PHONE")
	private String homePhone;
	
	@Column(name = "BUSINESS_PHONE")
	private String businessPhone;
	
	@Column(name = "CELL_PHONE")
	private String cellPhone;
	
	@Column(name = "MAILING_ADDRESS")
	private String mailingAddress;
	
	@Column(name = "ZIP_CODE")
	private String zipCode;
	
	@Column(name = "MAILING_STATE")
	private String mailingState;

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * @return the businessPhone
	 */
	public String getBusinessPhone() {
		return businessPhone;
	}

	/**
	 * @param businessPhone the businessPhone to set
	 */
	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	/**
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return cellPhone;
	}

	/**
	 * @param cellPhone the cellPhone to set
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	/**
	 * @return the mailingAddress
	 */
	public String getMailingAddress() {
		return mailingAddress;
	}

	/**
	 * @param mailingAddress the mailingAddress to set
	 */
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the mailingState
	 */
	public String getMailingState() {
		return mailingState;
	}

	/**
	 * @param mailingState the mailingState to set
	 */
	public void setMailingState(String mailingState) {
		this.mailingState = mailingState;
	}
	

}
