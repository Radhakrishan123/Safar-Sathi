import loose.EmailNotificationService;
import loose.NotificationService;
import loose.SMSNotificationService;
import tight.UserService;

public class Main {
    static void main() {
        //Tight
        UserService userService = new UserService();
       userService.notifyUser("order placed");
        //loose
        NotificationService emailService = new EmailNotificationService();
        NotificationService SMSService = new SMSNotificationService();
        loose.UserService userService1 = new loose.UserService( SMSService);//dependency pass to constructor
        userService1.notifyUser("order processed");



        loose.UserService userService1Setter = new loose.UserService();
        userService1Setter.setNotificationService(emailService);//setter injection
        userService1Setter.notificationService = SMSService;//fild injection

    }
}

