package serialisering;

import java.io.*;

public class Storage {

    public static void addTree(BinarySearchTree tree) {
        try {
            // Write to disk with FileOutputStream
            FileOutputStream f_out = new FileOutputStream("C:\\Users\\DaWig\\IdeaProjects\\PRO2-Project\\L26-Hashing og Maps\\src\\serialisering\\tree.data");

            // Write object with ObjectOutputStream
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);

            // Write object out to disk
            obj_out.writeObject(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BinarySearchTree getTree() {
        try {
            // Read from disk using FileInputStream
            FileInputStream f_in = new FileInputStream("C:\\Users\\DaWig\\IdeaProjects\\PRO2-Project\\L26-Hashing og Maps\\src\\serialisering\\tree.data");

            // Read object using ObjectInputStream
            ObjectInputStream obj_in = new ObjectInputStream(f_in);

            // Read an object
            Object obj = obj_in.readObject();

            if (obj instanceof BinarySearchTree) {
                BinarySearchTree tree = (BinarySearchTree) obj;

                return tree;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
