import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


class Main {
  public static void main(String[] args) {
    try{
    FileReader fileReader = new FileReader("to_be_read.txt");
     
    BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
        fileReader.close();
    }
      catch(IOException e1){
      System.out.println("Exception catched!");
    
      } 
  }
			
      
  }