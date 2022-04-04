package app;


import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws Exception {
//        FileManager fm = new FileManager(Paths.get("f:\\_kino_\\"));
        ZipFileManager zfm = new ZipFileManager(Paths.get("f:\\arch.zip"));
        zfm.getFilesList();
    }
}
