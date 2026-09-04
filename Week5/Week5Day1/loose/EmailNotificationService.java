package loose;


public class EmailNotificationService extends NotificationService {
@Override
    public  void send(String message){
    System.out.println("Email"+message);
}
}
