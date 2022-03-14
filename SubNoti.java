package HW1;

import java.util.ArrayList;
import java.util.List;

public class SubNoti implements Noti{
    private List<SubUser> list  = new ArrayList<>();

    @Override
    public void attach(SubUser user) {
        list.add(user);
    }

    @Override
    public void detach(SubUser user) {
        list.remove(user);
    }

    @Override
    public void notifyByEmail(String message, String email) {
        for(SubUser user:list){
            if (user.getCheckEmail()) {
                user.updateByEmail(message, email);
            }
        }
    }

    @Override
    public void notifyByPhone(String message, String phoneNum) {
        for(SubUser user:list){
            if (user.getCheckSMS()) {
                user.updateByPhone(message, phoneNum);
            }
        }
    }


}
