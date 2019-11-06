package br.ufma.ecp.pessoa;

import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class App {
		
	public static void salvaBinario() {
        try {
            OutputStream f = new FileOutputStream("pessoa.bin");
            ObjectOutputStream saida = new ObjectOutputStream(f);
            Pessoa p = new Pessoa ("danilo","0000000", 99,99.65);
            saida.writeObject(p);
            saida.close();
        } catch (IOException e) {
            e.printStackTrace();
        	}
	}
		
	public static void recuperaBinario() {
	        try {
	            InputStream f = new FileInputStream("saida.txt");
	            ObjectInputStream entrada = new ObjectInputStream(f);
	            Pessoa o = (Pessoa)entrada.readObject();
	            entrada.close();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        System.out.println("concluido");
	    
	}
	
	public static void serializaXML() {
		try {
            OutputStream f = new FileOutputStream("saida.xml");
            XMLEncoder encoder = new XMLEncoder(f);
            Pessoa p = new Pessoa ("danilo","0000000", 99,99.65);
            encoder.writeObject(p);
            encoder.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		serializaXML();
	}
	
}
