<<<<<<< HEAD
//import materia.controller.BinaryTree;
import materia.controller.AVLTree;
public class App {
        public static void main(String[] args) throws Exception {
        /*BinaryTree ab = new BinaryTree();
=======
import materia.controller.BinaryTree;
>>>>>>> 4e8eaa2ea64c298848913819fb72ef53856b0412

public class App {
    public static void main(String[] args) {
        BinaryTree ab = new BinaryTree();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

        System.out.println();
        System.out.println("Nombre: Ivanna Nievecela");
        System.out.println("Peso del arbol = " + ab.getWeight());
        System.out.println("Altura es = "     + ab.getHeight());
        System.out.println();

<<<<<<< HEAD
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
=======
        System.out.print("Arbol InOrder: ");
        ab.printInOrder();        

        System.out.print("Arbol InOrder con alturas: ");
        ab.printInOrderWithHeight();

        System.out.print("Arbol InOrder con factor de equilibrio: ");
        ab.printInOrderWithBalanceFactor();

        System.out.println();
        System.out.println("Arbol esta equilibrado = " + ab.isBalanced());
        System.out.println("Existe el nodo 15= "       + ab.findeValue(15));

        System.out.println("Agregamos valor = 15");
        ab.insert(15);

        System.out.println("Arbol esta equilibrado = " + ab.isBalanced());

        System.out.print("\nArbol InOrder con factor de equilibrio: ");
        ab.printInOrderWithBalanceFactor();

        ab.printInOrderWithBalanceFactor();
        ab.printUnbalancedNodes();
    }
>>>>>>> 4e8eaa2ea64c298848913819fb72ef53856b0412
}
