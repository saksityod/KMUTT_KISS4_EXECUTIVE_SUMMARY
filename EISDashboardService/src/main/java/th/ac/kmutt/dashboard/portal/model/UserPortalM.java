package th.ac.kmutt.dashboard.portal.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import th.ac.kmutt.dashboard.xstream.common.ImakeXML;

import java.io.Serializable;

@XStreamAlias("UserPortalM")
public class UserPortalM extends ImakeXML implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer userId;
	
	private String emailAddress;
	
	private String firstName;
	
	private String lastName;
	
	private String screenName;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
}
