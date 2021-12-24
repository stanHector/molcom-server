package hector.developers.molcom.payload;

public class UserProfile {
	private Long id;
    private String phone;
	private String email;


	public UserProfile(Long id, String username, String phone, String email) {
	    this.id = id;
	    this.email = this.email;
	    this.phone = this.phone;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}