package bsu.rfe.java.group6.lab8.DOBRINSKIY.var10А;

import javax.swing.*;

public class ChatMessage {
    // Текст сообщения
    private String message;
    // Автор сообщения
    private ChatUser author;

    private ImageIcon imageIcon;
    // Временная метка сообщения (в микросекундах)
    private long timestamp;

    public ChatMessage(String message, ChatUser author, long timestamp, ImageIcon imageIcon) {
        this.message = message;
        this.imageIcon = imageIcon;
        this.author = author;
        this.timestamp = timestamp;
    }


    public String getMessage() {
        return message;
    }


    public ChatUser getAuthor() {
        return author;
    }

    public void setAuthor(ChatUser author) {
        this.author = author;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public ImageIcon getSmile(){
        return imageIcon;
    }
}
