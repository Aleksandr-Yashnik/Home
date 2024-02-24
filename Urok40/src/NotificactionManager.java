public class NotificactionManager {
    public  static void broadcastMessage(Notifier notifier, String message){
        notifier.sendMessage(message);
    }
}
