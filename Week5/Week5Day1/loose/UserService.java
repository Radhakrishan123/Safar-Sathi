package loose;



public class UserService {

   public NotificationService notificationService ;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;//constructor dependency injection

    }

    public void setNotificationService(NotificationService notificationService) {//setter method
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
       notificationService.send("Notification Hello");

    }
}





