package uk.co.techblue.docusign.client.dto.user;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import uk.co.techblue.docusign.client.BaseDto;
import uk.co.techblue.docusign.client.dto.ForgottenPasswordInfo;

/**
 * The class for constructing password change request.
 * 
 * @author Ajay
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class ChangePasswordRequest  extends BaseDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5694380109028139818L;

	/** The current password. */
	@JsonProperty
	private String currentPassword;

	/** The email. */
	@JsonProperty
	private String email;

	/** The forgotten password info. */
	@JsonProperty
	private ForgottenPasswordInfo forgottenPasswordInfo;

	/** The new password. */
	@JsonProperty
	private String newPassword;

	/**
	 * Gets the current password.
	 * 
	 * @return the current password
	 */
	public String getCurrentPassword() {
		return currentPassword;
	}

	/**
	 * Sets the current password.
	 * 
	 * @param currentPassword
	 *            the new current password
	 */
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	/**
	 * Gets the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 * 
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the forgotten password info.
	 * 
	 * @return the forgotten password info
	 */
	public ForgottenPasswordInfo getForgottenPasswordInfo() {
		return forgottenPasswordInfo;
	}

	/**
	 * Sets the forgotten password info.
	 * 
	 * @param forgottenPasswordInfo
	 *            the new forgotten password info
	 */
	public void setForgottenPasswordInfo(
			ForgottenPasswordInfo forgottenPasswordInfo) {
		this.forgottenPasswordInfo = forgottenPasswordInfo;
	}

	/**
	 * Gets the new password.
	 * 
	 * @return the new password
	 */
	public String getNewPassword() {
		return newPassword;
	}

	/**
	 * Sets the new password.
	 * 
	 * @param newPassword
	 *            the new new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}