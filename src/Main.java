import Observable.ChatObservable;
import Observable.GlobalChat;
import Observer.PlayerChat;

public class Main {

    public static void main(String[] args) {
        ChatObservable globalchat = new GlobalChat();

        PlayerChat player1 = new PlayerChat(globalchat);
        PlayerChat player2 = new PlayerChat(globalchat);

        player1.send("Hey guys");
        player2.send("Hello, I love this game!");
        player1.leave();

    }
}
