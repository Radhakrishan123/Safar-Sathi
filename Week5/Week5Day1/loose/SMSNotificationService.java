package loose;

public class SMSNotificationService extends NotificationService {
    @Override
    public  void send(String message){
        System.out.println("SMS:"+message);
    }
}
