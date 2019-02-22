package Observer;

import Observable.ChatObservable;

public class PlayerChat implements ChatObserver {

    private ChatObservable currentChatGroup = null;
    private String allMessages = this +"'s chat:";

    public PlayerChat(ChatObservable currentChatGroup) {
        this.currentChatGroup = currentChatGroup;
        this.currentChatGroup.add(this);
    }

    @Override
    public void update(String message) {
        display(message);
    }

    public void leave() {
        currentChatGroup.remove(this);
    }

    private void display(String message) {
        allMessages = allMessages + "\n" + message;
        System.out.println(allMessages + "\n");
    }

    public void send(String message) {
        currentChatGroup.setLatestMessage(this + ": " +message);
    }
}
