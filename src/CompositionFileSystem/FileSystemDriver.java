package CompositionFileSystem;

public class FileSystemDriver {

    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");
        phpDemo1.setFolder("Source Files");
        phpDemo1.setFolder("Include Path");
        phpDemo1.setFolder("Remote Files");
        Folder sourceFiles = phpDemo1.getFolder("Source Files");
        sourceFiles.setFolder("  .phalcon");
        sourceFiles.setFolder("app");
        sourceFiles.setFolder("cache");
        sourceFiles.setFolder("public");
        sourceFiles.setFile(".htaccess");
        sourceFiles.setFile(".htrouter.php");
        sourceFiles.setFile("index.html");
        Folder app = sourceFiles.getFolder("app");
        app.setFolder("config");
        app.setFolder("controllers");
        app.setFolder("library");
        app.setFolder("migrations");
        app.setFolder("models");
        app.setFolder("views");
        System.out.println(phpDemo1);

        System.out.println();
        System.out.println();
        phpDemo1.delete("app");
        System.out.println(phpDemo1);

        System.out.println();
        System.out.println();
        phpDemo1.delete("public");
        System.out.println(phpDemo1);
    }
}
