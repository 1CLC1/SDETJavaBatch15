package class24;

public abstract class Phone {

    abstract void unlockPhone();
    abstract void sendText();
    abstract void displayPictures();

}
class iPhone extends Phone{


    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the Phone");
    }

    @Override
    void sendText() {
        System.out.println("Lets use the iMessage to send the text");
    }

    @Override
    void displayPictures() {
        System.out.println("iPhotos to browse the pictures");
    }
}
class Samsung extends Phone{

    @Override
    void unlockPhone() {
        System.out.println("Using FingerPrint sensor or camera");
    }

    @Override
    void sendText() {
        System.out.println("Messages app to send the message");
    }

    @Override
    void displayPictures() {
        System.out.println("Gallery app to browse the photos");
    }
}