package app.command;

import app.ConsoleHelper;
import app.ZipFileManager;
import app.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Adding new file to ZIP.");
            ZipFileManager zipFileManager = getZipFileManager();
            ConsoleHelper.writeMessage("Enter full name of the new file to adding:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.addFile(sourcePath);
            ConsoleHelper.writeMessage("Adding was finished.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("File was not found.");
        }
    }
}
