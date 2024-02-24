package CompositionFileSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Folder {

    private String name;
    private List<Folder> folders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getFolder(String name) {
        for (Folder f : folders) {
            if (f.name.equals(name)) {
                return f;
            }
            if (!f.folders.isEmpty()) {
                return f.getFolder(name);
            }
        }
        throw new NoSuchElementException();
    }

    public void setFolder(String name) {
        folders.add(new Folder(name));
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFile(String name) {
        files.add(new File(name));
    }

    public void delete(String name) {
        try {
            folders.remove(getFolder(name));
        } catch(NoSuchElementException ignored) {
        }
        for (Folder folder : folders) {
            if (!folder.folders.isEmpty()) {
                folder.delete(name);
            }
        }
    }

    @Override
    public String toString() {
        print(0);
        return "";
    }

    private void print(int depth) {
        System.out.println(name);
        printSubFolders(++depth);
        printSubFiles(depth);
    }

    private void printSubFolders(int depth) {
        for (Folder folder : folders) {
            printSpaces(depth);
            folder.print(++depth);
            depth--;
        }
    }

    private void printSubFiles(int depth) {
        for (File file : files) {
            printSpaces(depth);
            System.out.println(file);
        }
    }

    private void printSpaces(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
    }

    private static class File {
        private final String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
