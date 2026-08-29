class Phone {
    void call() {
        System.out.println("Calling...");
    }

    void message() {
        System.out.println("Sending message...");
    }
}

class Iphone extends Phone {
    void camera() {
        System.out.println("Taking photo...");
    }

    public static void main(String[] args) {
        Iphone i = new Iphone();

        i.call();
        i.message();
        i.camera();
    }
}