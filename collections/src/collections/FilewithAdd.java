package collections;
import java.io.File;
import java.util.ArrayList;

import java.io.IOException;

public class FilewithAdd {

	public static void main(String[] args) {
		File f=new File("F:\\Wolfdinesh\\squad.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList a=new ArrayList();
		
		System.out.println(a);
	}

}
