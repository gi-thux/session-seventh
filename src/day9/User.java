package day9;

import day9.accessmodifier.SocialUser;

public class User {
    public String name;
    private String email;
    private String userName;
    private String password;

    /**
     * the class should have less variable as much as it can to make it easy to read and create a clean code
     * different class address is made to accomodiate similar variable like country,zipCode,state
     */
    private Address address;

    /**
     * @deprecated
     */
    private SocialUser socialUser;

    public String getName() {
        SocialUser social = new SocialUser();
        social.name="abc";
        return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    /**
     * passwords should be encrpyted..
     * it should not be accessed by other.
     * we avoid getpassword method
     */
    //public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public void setAddress(Address address) {
        this.address = address;}

    //this method  can be call to check the password and the password provided by the user
    public boolean checkPassword(String userEnteredPassword){
        if(this.password==userEnteredPassword) {
            return true;
        }else {
            return false;
         }
    }

}
