package Observable;

import Observer.ChatObserver;

import java.util.ArrayList;

public class GlobalChat implements ChatObservable{

    private ArrayList<ChatObserver> chattersList = new ArrayList<>();
    private String latestMessage = "";


    @Override
    public void add(ChatObserver chatObserver) {
        chattersList.add(chatObserver);
        System.err.println(chatObserver + " joined the chat");
    }

    @Override
    public void remove(ChatObserver chatObserver) {
        chattersList.remove(chatObserver);
        System.err.println(chatObserver + " left the chat");

    }

    @Override
    public void notifyChatObservers() {
        for (ChatObserver chatter : chattersList) {
            chatter.update(this.latestMessage);
        }
    }

    @Override
    public void setLatestMessage(String message) {
        this.latestMessage = message;
        notifyChatObservers();
    }
}
