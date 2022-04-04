package app.command;

import app.ConsoleHelper;
import app.ZipFileManager;
import app.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Creating ZIP archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter full path of directory/file for the archiving:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.createZip(sourcePath);

            ConsoleHelper.writeMessage("ZIP was made.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Wrong directory or filename entered.");
        }
    }
}
