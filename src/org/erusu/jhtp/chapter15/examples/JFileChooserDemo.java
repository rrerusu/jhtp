package org.erusu.jhtp.chapter15.examples;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame{
    private final JTextArea outputArea;

    public JFileChooserDemo() throws IOException {
        super("JFileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea));
        analyzePath();
    }

    public void analyzePath() throws IOException {
        Path path = getFileOrDirectoryPath();

        if(path != null && Files.exists(path)) {
            StringBuilder myBuilder = new StringBuilder();
            myBuilder.append(String.format("%s:\n", path.getFileName()));
            myBuilder.append(String.format("%s a directory\n",
                Files.isDirectory(path) ? "Is" : "Is not"));
            myBuilder.append(String.format("%s an absolute path\n",
                path.isAbsolute() ? "Is" : "Is not"));
            myBuilder.append(String.format("Last modified: %s\n",
                Files.getLastModifiedTime(path)));
            myBuilder.append(String.format("Size: %s\n", Files.size(path)));
            myBuilder.append(String.format("Path: %s\n", path));
            myBuilder.append(String.format("Absolute path: %s\n",
                path.toAbsolutePath()));
            
            if(Files.isDirectory(path)) {
                myBuilder.append(String.format("\nDirectory contents:\n"));

                DirectoryStream<Path> myDirectoryStream = Files.newDirectoryStream(path);

                for(Path p : myDirectoryStream) {
                    myBuilder.append(String.format("%s\n", p));
                }
            }

            outputArea.setText(myBuilder.toString());
        } else {
            JOptionPane.showMessageDialog(this, path.getFileName() +
                " does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path getFileOrDirectoryPath() {
        JFileChooser myFileChooser = new JFileChooser();
        myFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = myFileChooser.showOpenDialog(this);

        if(result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
        return myFileChooser.getSelectedFile().toPath();
    }
}