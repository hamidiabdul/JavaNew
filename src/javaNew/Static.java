package javaNew;

public class Static {

    // Define the cleanRoom() method outside the main method
    public void cleanRoom() {
        System.out.println("Room is clean!");
    }

    // Main method, which is static
    public static void main(String[] args) {
        // To call the cleanRoom method, create an object of the class
        Static obj = new Static();  // Create an object of the Static class
        obj.cleanRoom();  // Call the cleanRoom method using the object
    }

}
