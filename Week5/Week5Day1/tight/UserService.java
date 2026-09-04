package tight;

public class UserService {

   NotificationService PushnotificationService = new NotificationService();
   public void notifyUser(String message){
       PushnotificationService.send("Notification Hello");
    }
}





