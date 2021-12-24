package hector.developers.molcom.payload;


public class UserIdentityAvailability {

	private Boolean available;

    public UserIdentityAvailability(Boolean isAvailable) {
        this.available = isAvailable;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
