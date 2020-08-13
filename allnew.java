package alidb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class allnew {
		public static void main (String []args) {
			Connection c = null;
			Statement stmt = null;
			PreparedStatement prst=null;
			
		
			 try {
			
				 Class.forName("org.sqlite.JDBC");
					c = DriverManager.getConnection("jdbc:sqlite:D:\\\\Eclipse codes\\\\my projects\\\\alidb\\\\src\\\\alidb\\\\testali.db");
						String sql2="INSERT INTO tablex  VLAUES(?,?,?,?,?,?,?,?,?,?)";
						
						prst=c.prepareStatement(sql2);
						
						File f=new File("D:\\Eclipse codes\\my projects\\alidb\\src\\alidb\\Interview-task-data-osh.csv");
							
						BufferedReader br=new BufferedReader(new FileReader(f));
									String row;
								
									while ((row=br.readLine()) !=null) {
										
										String [] lines=row.split(",");
										System.out.println("done!");
										String A=lines[0];
										String B=lines[1];
										String C=lines[2];
										String D=lines[3];
										String E=lines[4];
										String F=lines[5];
										String G=lines[6];
										String H=lines[7];
										String I=lines[8];
										String J=lines[9];
										
										prst.setString(1, A);
										prst.setString(2, B);
										prst.setString(3, C);
										prst.setString(4, E);
										prst.setString(5, F);
										prst.setString(6, G);
										prst.setString(7, H);
										prst.setString(8, I);
										prst.setString(9, J);
								
							prst.executeUpdate();
									
										
						
					}
						br.close();
						prst.execute(sql2);
						c.close();
						
				}
					   catch (Exception e) {
				System.out.println(e.getMessage());
					   }
		 
		
		 
		 try {
			 Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:D:\\Eclipse codes\\my projects\\alidb\\src\\alidb\\testali.db");
				System.out.println("creating table now");
				stmt = c.createStatement();
				String sql = "CREATE TABLE IF NOT EXISTS tablex (\n"
		                + "	A text NOT NULL,\n"
		                + "	B text NOT NULL,\n"
		                + "	C text NOT NULL,\n"
		                + "	D text NOT NULL,\n"
		                + "	E text NOT NULL,\n"
		                + "	F text NOT NULL,\n"
		                + "	G text NOT NULL,\n"
		                + "	H text NOT NULL,\n"
		                + "	I text NOT NULL,\n"
		                + " J text NOT NULL\n);";
			   
				stmt.executeUpdate(sql);
				stmt.close();
				c.close();
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 
		 
		 	}
			
			
	


		
	}
		


		 

