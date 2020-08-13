package alidb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.lang.*;

public class csvreading {

	public static void main(String[] args) {
		csvreading cr=new csvreading();
				cr.fil();
			
	}
		   
			   public  void fil() {
				   try {
			File f=new File("D:\\Eclipse codes\\my projects\\alidb\\src\\alidb\\Interview-task-data-osh.csv");
			
			if (f.isFile()) {
				
					BufferedReader br=new BufferedReader(new FileReader("D:\\Eclipse codes\\my projects\\alidb\\\\src\\alidb\\Interview-task-data-osh.csv"));
					String row;
					while ((row=br.readLine()) !=null) {
						String [] lines=row.split(",");
						System.out.println("done!");
						System.out.println(Arrays.toString(lines));
					}}}
				   catch (Exception e) {
			System.out.println(e.getMessage());
			}}
			   }



