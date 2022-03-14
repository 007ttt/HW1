package HW1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    public static void main(String[] args) {
        SubNoti sub = new SubNoti();
        SubUser uuuu = new SubUser("01234567891","xiaochen","xiaochen@gmail.com", true, false );
        SubUser uuuu1 = new SubUser("01234567891","xiaoming","xiaoming@gmail.com", true, true );
        SubUser uuuu2 = new SubUser("01234567891","yongyuan","yongyuan@gmail.com", true, true );
       if (check(uuuu)){
           sub.attach(uuuu);
       }
        if (check(uuuu1)){
            sub.attach(uuuu1);
        }
        if (check(uuuu2)){
            sub.attach(uuuu2);
        }

        sub.notifyByEmail("updated",uuuu.getEmail());
        sub.notifyByPhone("updated",uuuu.getPhoneNum());
    }

    private static boolean check(SubUser user) {
        if(!validEmail(user.getEmail())){
            return false;
        }
        if(!validPhone(user.getPhoneNum())){
            return false;
        }
        return true;
    }

    private static boolean validPhone(String phoneNum) {
        return phoneNum.matches("\\d{11}");
    }

    private static boolean validEmail(String email) {
        if(email.isEmpty()) throw new RuntimeException("email is empty!");
        boolean flag = false;
        try{
            String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        }catch(Exception e){
            flag = false;
        }
        return flag;
    }


}
