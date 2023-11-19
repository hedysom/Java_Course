import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;

    public PhoneCompany(double minutePrice, double smsPrice, double gbPrice){
        this.users = new ArrayList<>();
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
             int code = Integer.parseInt(in.nextLine());
             String name = in.nextLine();
             String surname = in.nextLine();
             User user = new User(code, name, surname);
             user.setUsedMinutes(Integer.parseInt(in.nextLine()));
             user.setUsedSMS(Integer.parseInt(in.nextLine()));
             user.setUsedMB(Double.parseDouble(in.nextLine()));
             this.users.add(user);
        }
    }

    public void computeUserCost(User user){
        int code = user.getCode();
        double cost = 0;
        cost += (user.getUsedMinutes() * this.minutePrice);
        cost += (user.getUsedSMS() * this.smsPrice);
        cost += (user.getUsedMB() * this.gbPrice / 1000);
        user.setTotalCost(cost);
    }
    public User findUserByCode(int code){
        for (User user : this.users){
            if (user.getCode() == code )
                return user;
        }
        return null;
    }
}
