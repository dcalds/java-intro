public class Hello {
    public static void main (String[] args) {

        // Hello world
        System.out.println("Hello World");

        // Loop em array de argumentos
        for(int i = 0; i < args.length; i++){
            System.out.println(args[0]);
        }
    }
}