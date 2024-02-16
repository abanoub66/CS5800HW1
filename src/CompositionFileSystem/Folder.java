package CompositionFileSystem;

import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<Folder> folders;
    private ArrayList<File> files;

    public Folder(String name, ArrayList<Folder> folders, ArrayList<File> files) {
        this.name = name;
        this.folders = folders;
        this.files = files;
    }

    public Folder(String name) {
        this(name, new ArrayList<>(), new ArrayList<>());
    }

    public void addSubFolder(Folder folder) {
        folders.add(folder);
    }

    public void addSubFolder(String name) {
        folders.add(new Folder(name));
    }

    public void addFile(String name) {
        files.add(new File(name));
    }

    public void delete() {
        name = null;
        folders = null;
        files = null;
    }

    public void print() {
        int depth = 0;
        print(depth);
    }

    private void print(int depth) {
        System.out.println(name);
        printSubFolders(++depth);
        printSubFiles(depth);
    }

    private void printSubFolders(int depth) {
        for (int i = 0; i < folders.size(); i++) {
            if (folders.get(i).name == null) {
                continue;
            }
            printSpaces(depth);
            folders.get(i).print(++depth);
            depth--;
        }
    }

    private void printSubFiles(int depth) {
        for (File file : files) {
            printSpaces(depth);
            file.print();
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

        public void print() {
            System.out.println(name);
        }
    }
}
