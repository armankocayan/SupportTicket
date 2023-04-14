package com.armankocayan;

public class Application {
    public static void run() {
        SQLiteUtilities.generateConnection();
        CLIUtilities.printMenu();
    }


}
