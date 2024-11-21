package org.launchcode;

public class Main {
    public static void main(String[] args) {

        /* CD AND DVD CLASSES */

        // Create objects of the CD and DVD classes
        CD letGO = new CD("Let Go", true);
        CD ps2Games = new CD("PS2 Games");
        DVD smallvilleSeason5 = new DVD("Smallville: Season 5");


        // Create File objects and add them to the CD and DVD objects using writeData()
        File complicated = new File("Complicated", 80);
        File losingGrip = new File("Losing Grip", 44);
        File unwanted = new File("Unwanted", 75);
        letGO.writeFile(complicated);
        letGO.writeFile(losingGrip);
        letGO.writeFile(unwanted);

        File need4Speed = new File("need4speed.exe", 175);
        File granTurismo = new File("grandTurismo.exe", 360);
        ps2Games.writeFile(need4Speed);
        ps2Games.writeFile(granTurismo);

        File s5e1 = new File("S5:E1 - Arrival", 415);
        File s5e2 = new File("S5:E2 - Mortal", 415);
        File s5e3 = new File("S5:E2 - Hidden", 415);
        File s5e4 = new File("S5:E4 - Aqua", 415);
        smallvilleSeason5.writeFile(s5e1);
        smallvilleSeason5.writeFile(s5e2);
        smallvilleSeason5.writeFile(s5e3);
        smallvilleSeason5.writeFile(s5e4);


        // Print each CD and DVD object
        System.out.println(letGO);
        System.out.println(ps2Games);
        System.out.println(smallvilleSeason5);


        // Use runFile() on both CD files
        letGO.runFile(losingGrip);
        ps2Games.runFile(granTurismo);


        // Try to write a file to the DVD that has already been written
        smallvilleSeason5.writeFile(s5e2);


        // Use eraseData() to remove one file from the CD-ROM object, and then try to run that file
        ps2Games.removeFile(need4Speed);
        letGO.runFile(need4Speed);


        // Use reformatDisc() to wipe all files from the music CD, and then try to run a file from it
        letGO.reformatDisc();
        letGO.runFile(unwanted);


        // Create a 720 MB MP4 file and try to write it to the CD that is no longer a music CD
        File tooBigFile = new File("too-big-file.mp4", 829);
        letGO.writeFile(tooBigFile);



    }
}