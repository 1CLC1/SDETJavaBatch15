package class23.HW;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
    */

   public void storage(){
        System.out.println("Computer has storage");
    }
    public void internetBrowser(){
        System.out.println("Browsing the internet");
    }
    public void videoPlayer(){
        System.out.println("Playing video");
    }
}
class Apple extends Computer{
    @Override
    public void storage() {
        System.out.println("iMac has 1TB of storage");
    }

    @Override
    public void internetBrowser() {
        System.out.println("Browsing the internet using Safari");
    }
    @Override
    public void videoPlayer() {
        System.out.println("Playing videos on Quick Time player");
    }
    public void appInstall(){
        System.out.println("Installing apps from App Store");
    }
}
class Lenovo extends Computer{
    @Override
    public void storage() {
        System.out.println("Lenovo has 500GB of storage");
    }

    @Override
    public void internetBrowser() {
        System.out.println("Browsing the internet using FireFox");
    }

    @Override
    public void videoPlayer() {
        System.out.println("Playing videos on ThinkPad");
    }
}
class HP extends Computer{
    @Override
    public void storage() {
        System.out.println("HP has 256GB of storage");
    }

    @Override
    public void internetBrowser() {
        System.out.println("Browsing the internet using Explorer");
    }

    @Override
    public void videoPlayer() {
        System.out.println("Playing videos on MediaSmart");
    }
}
class Dell extends Computer{
    @Override
    public void storage() {
        System.out.println("Dell has 356GB of storage");
    }
    @Override
    public void internetBrowser() {
        System.out.println("Browsing the internet using Microsoft Edge");
    }
    @Override
    public void videoPlayer() {
        System.out.println("Playing videos on Video Player");
    }
}