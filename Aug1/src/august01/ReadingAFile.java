package august01;

import java.io.FileReader;
import java.io.IOException; 

public class ReadingAFile {

		public class ReadFile {
			public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				FileReader r=new FileReader("C:\\Users\\USER\\Downloads\\file0.txt");
				int ch;
				while((ch=r.read())!=-1)
				{
					System.out.println((char) ch);
				}
				
				}	
			}

	}