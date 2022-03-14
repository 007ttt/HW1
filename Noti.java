package HW1;

public interface Noti {
    //subscribe
    void attach(SubUser user);
    //cancel
    void detach(SubUser user);
    //notify
    void notifyByEmail(String message, String email);
    void notifyByPhone(String message, String phoneNum);
}
