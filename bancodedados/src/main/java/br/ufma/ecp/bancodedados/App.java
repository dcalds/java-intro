package br.ufma.ecp.bancodedados;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        GenericDAO gen1 = new GenericDAO();
    	Contato con1 = new Contato("Danilo","danilo@gmail.com","999999999");
    	
    	gen1.create(con1);
    	
    }
}
