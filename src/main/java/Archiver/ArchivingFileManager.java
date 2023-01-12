package Archiver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ArchivingFileManager {

    private static String createNameZipFile(String fileName){
        int lastIndexOf = fileName.lastIndexOf(".");
        return fileName.substring(0,lastIndexOf) + ".zip";
    }

    public static void zippingFile(String fileName){
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(createNameZipFile(fileName)));
            ZipEntry zipEntry = new ZipEntry(fileName);

            zipOutputStream.putNextEntry(zipEntry);
            FileInputStream fileInputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            zipOutputStream.write(buffer);

            zipOutputStream.closeEntry();
            zipOutputStream.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());;
        }
    }

    public static void unZippingFile(String archiveName) {
        try {
            ZipInputStream zin = new ZipInputStream(new FileInputStream(archiveName));
            ZipEntry entry = null;
            while((entry = zin.getNextEntry()) != null) {
                FileOutputStream fout = new FileOutputStream(entry.getName());
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }
    }
}
