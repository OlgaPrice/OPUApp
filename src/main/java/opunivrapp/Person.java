package opunivrapp;

public abstract class Person {
    private String firsName;
    private String lastName;
    private String userName;
    private String password;
    private static  int userNameID = 103;


    public Person(String firsName, String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
        this.password = String.valueOf(userNameID);
        generateUserName(firsName, lastName);
        userNameID++;
    }

    private void generateUserName(String firsName, String lastName){
        this.userName = firsName.trim().charAt(0) + lastName.trim() + userNameID;
        userNameID++;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
