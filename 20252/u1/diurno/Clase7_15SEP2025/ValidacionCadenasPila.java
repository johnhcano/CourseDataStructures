import java.util.Stack;

public class ValidacionCadenasPila {
    public static void main(String[] args) {
        
        String[] llaves = {"{","{","}","}","}"};

        //Cree una pila de llaves y verifique si las llaves están 
        //completas, es decir, una llave que abre tiene una llave que cierra.

        Stack<String> p = new Stack<>();

        for (int i = 0; i < llaves.length; i++) {
            p.push(llaves[i]);
        }

        System.out.println(p);
        
        int contador1 = 0, contador2 = 0;
        
        int tam = p.size();
        
        for (int i = 0; i < tam; i++) {
            if (p.peek().equals("{")) {
                contador1 += 1;
            }else{
                contador2 += 1;
            }
            p.pop();
        }

        System.out.println(contador1 == contador2 ? "Equlibrados" : "No Equlibrados");

    }  
}