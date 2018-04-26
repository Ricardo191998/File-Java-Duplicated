import java.io.*;
import java.util.*;

class DuplicarArchivo{
      public static void main(String[] args){
          int numCopia = 1;
          FileReader fr;
          FileWriter archivo;
          BufferedWriter bw;
          BufferedReader br;
          PrintWriter pw;
          String nombre = "prueba.txt";

          try {
              fr = new FileReader(nombre);
              br = new BufferedReader(fr);
              String linea=br.readLine();
              String nuevoNombre = nombre.substring(0,6)+numCopia+".txt";
              archivo = new FileWriter(nuevoNombre);
              bw = new BufferedWriter(archivo);
              pw = new PrintWriter(bw);
			        while(linea!=null){
				         StringTokenizer st=new StringTokenizer(linea,"\n");
                 pw.println(st.nextToken());
                 linea=br.readLine();
			        }
              System.out.println("El archivo se ha duplicado");
              pw.close();
			        bw.close();
			        archivo.close();
          }catch(IOException ioe){
			         System.out.println("Hubo un error con el archivo");
		      }
	     }
}
