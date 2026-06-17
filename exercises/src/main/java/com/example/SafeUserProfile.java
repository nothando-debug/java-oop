public class SafeUserProfile {
    private String username;
    private String email;
    private String passwordHash;
    private int loginAttempts;
    private boolean locked;


    public SafeUserProfile(String username, String email){
        this.username = username;
        this.email = email;

    }

    public getUserName(){
        return username;
    }

    public getEmail(){
        return email;
    }

    public setUserName(String newUsername){
        username = newUsername;
    }

    public setEmail(String newEmail){
        email = newEmail;
    }

    
}
