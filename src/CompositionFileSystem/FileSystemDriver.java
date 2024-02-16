package CompositionFileSystem;

public class FileSystemDriver {

    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder("Include Path");
        phpDemo1.addSubFolder("Remote Files");
        sourceFiles.addSubFolder("  .phalcon");
        Folder app = new Folder("app");
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder("cache");
        Folder p = new Folder("public");
        sourceFiles.addSubFolder(p);
        sourceFiles.addFile(".htaccess");
        sourceFiles.addFile(".htrouter.php");
        sourceFiles.addFile("index.html");
        app.addSubFolder("config");
        app.addSubFolder("controllers");
        app.addSubFolder("library");
        app.addSubFolder("migrations");
        app.addSubFolder("models");
        app.addSubFolder("views");
        phpDemo1.print();

        System.out.println();
        System.out.println();
        app.delete();
        phpDemo1.print();

        System.out.println();
        System.out.println();
        p.delete();
        phpDemo1.print();
    }
}
