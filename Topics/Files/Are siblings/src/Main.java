import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
//        File file1 = new File("dir/file1.txt");
//        File file2 = new File("dir/file2.txt");
        return f1.getParent().equals(f2.getParent());
    }
}