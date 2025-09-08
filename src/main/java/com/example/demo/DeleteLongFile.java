package com.example.demo;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.File;

public class DeleteLongFile {
    public static void main(String[] args) {
        // Use full absolute path without escaping
        String filePath = "\\\\?\\C:\\Users\\SAGAR JAGZAP\\Downloads\\mahadbt.maharashtra.gov.in_Farmer_PreSanctionLetter_GetPreSanctionLetter_str=5F815C8428D92F7231FA98863E3EE766061486AEEFA096361153670832FD60656919158FBF1DFE15F814C5CDA8BDD3A0EAA68C2276EE5477FFE3BE53A420CD279AEA3FA6F56E7170345BEDADE698889306B569434983A3";

        File file = new File(filePath);

        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}


