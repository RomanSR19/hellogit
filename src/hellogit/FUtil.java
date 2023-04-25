package hellogit;

import java.io.File;

public class FUtil {
	 public static boolean fileExists(String filename) {
	        File file = new File(filename);
	        return file.exists();
	    }
	 public static void main(String[] args) {
		    String filename = "miArchivo.txt";
		    if (FUtil.fileExists(filename)) {
		        System.out.println("El archivo " + filename + " existe.");
		    } else {
		        System.out.println("El archivo " + filename + " no existe.");
		    }
		}
}
