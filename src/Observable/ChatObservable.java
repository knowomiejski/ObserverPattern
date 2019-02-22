package Observable;

import Observer.ChatObserver;

public interface ChatObservable {
    void add(ChatObserver chatObserver);
    void remove(ChatObserver chatObserver);
    void notifyChatObservers();
    void setLatestMessage(String message);
}
