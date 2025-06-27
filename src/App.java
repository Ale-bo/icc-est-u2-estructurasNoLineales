//import materia.controller.BinaryTree;
import materia.controller.AVLTree;
public class App {
        public static void main(String[] args) throws Exception {
        /*BinaryTree ab = new BinaryTree();

        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        ab.printPreOrder();
        ab.printPostOrder();
        ab.printInOrder();

        System.out.println();

        if (ab.findeValue(23)){
            System.out.println("Encontro el valor 23");
        } else {
            System.out.println("No encontro el valor 23");
        }
        if (ab.findeValue(77)){
            System.out.println("Encontro el valor 77");
        } else {
            System.out.println("No encontro el valor 77");
        }*/

        AVLTree avl = new AVLTree();
        avl.insert(5);
        avl.insert(20);
        avl.insert(15);

    } 
}
