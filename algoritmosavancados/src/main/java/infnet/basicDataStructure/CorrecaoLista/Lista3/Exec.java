package infnet.basicDataStructure.CorrecaoLista.Lista3;

public class Exec {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.addFront("Tijuca", 10);
        list.addFront("Centro", 10);
        list.addFront("Niteroi", 20);
        list.addFront("Sao Gonçalo", 5);
        System.out.println(list.find("Tijuca"));
        System.out.println(list.find("Centro"));
        System.out.println(list.find("Niteroi"));
        System.out.println(list.find("Sao Gonçalo"));

        System.out.println("Caminho Total: " + list.getTotalPath());
        System.out.println("Caminho de menor valor: " + list.getMinNode());
        System.out.println("Caminho de maior valor: " + list.getMaxNode());

    }
}
