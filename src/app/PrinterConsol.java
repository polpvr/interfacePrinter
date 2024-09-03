package app;

public class PrinterConsol implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {

        if (message.getText() == null && message.getSender() == null) {
            new Object() {
                void handleEmptyMessage() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }.handleEmptyMessage();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }

    }
}

