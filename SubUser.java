package HW1;

public class SubUser implements User{
    private String  phoneNum;
    private String name;
    private String email;
    private boolean checkEmail = false;
    private boolean checkSMS = false;

    public SubUser(String phoneNum, String name, String email, Boolean checkEmail, Boolean checkSMS) {
        this.phoneNum = phoneNum;
        this.name = name;
        this.email = email;
        this.checkEmail = checkEmail;
        this.checkSMS = checkSMS;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean getCheckEmail() {
        return checkEmail;
    }

    public boolean getCheckSMS() {
        return checkSMS;
    }

    @Override
    public void updateByEmail(String message, String email) {
        System.out.println("Send to "+ name + " a new message: "+ message +" by email!");
    }

    @Override
    public void updateByPhone(String message, String phone) {
        System.out.println("Send to "+ name + " a new message: "+ message+ " by SMS!");
    }
}
