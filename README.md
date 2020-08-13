In the beginning it took me few days to free myself for the task, then due to the lack of storage space in my (tablet/laptop computer) that has low specs; I started
with using the best environment for my java code so I tried to use something with a light weight to overcome the lack of storage problem that I had, used vs code
but with that I tried to use some plugins for the spring framework, for the maven, and mostly for the sqlite DB but when I tried using the DB within it, it didn't succeed in its job, so I uninstalled it and got back to my last choice other than netbeans which was eclipse since it is easier to install but I used it long time ago so, with the new versions I had another problem which is that the 14th version doesn’t work successfully on my computer and that made uninstall it again and going back to the 11th version which is an LTS and that’s better but it wasn’t for free and I kept searching for days till I found the ninite package management system that can be used to download many things including the right JDK version alongside with the eclipse IDE 11th version and after that I started to refresh my memory, of course in the beginning I forgot to put my files in the src folder and that wasn’t good at all then, started with installing the sqlite jar file in the library of eclipse after that came to the coding.
In the coding I started making files with different methods, where every file has his own task since that I had divided the code into 4 main parts that achieve 4 tasks:
1-	CSV file reading.
2-	DB creation.
3-	Table creation.
4-	Data insertion into the DB.
I have looked into parsers and different methods and libraries of csv files reading but I came out with a simple concise method of csv file reading. My idea was either to make an interface that contains abstract methods to do the aforementioned tasks or to use different classes for each task or to use different methods in one class but the necessity and the need to make them communicate with each other forced me to put them all in the main method as you will see in the file allnew.java; knowing that the method of reading csv files has no effect when combined with the full code of allnew.java while it does work when it is used alone as in the file csvreading.java. so, the main problem faced:
the stages 1 is done when it is isolated as a method but when combined with the insertion it does not; the stages
2,3 were executed successfully except for the stage 4 were I couldn't find the right way or method that can bind the data read and received from the csv file with the SQLite insertion scripting.
DDLs:
1.	DB creation-->Class.forName("org.sqlite.JDBC");
				c = DriverManager.getConnection("jdbc:sqlite:D:\\Eclipse codes\\my projects\\alidb\\src\\alidb\\testali.db
				
2. Table x creation --> "CREATE TABLE IF NOT EXISTS tablex (\n"
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
3.	data insertion --> "INSERT INTO tablex  VLAUES(?,?,?,?,?,?,?,?,?,?)";

Note: for the record I have done a lot of attempts and codes in order to solve the previously mentioned issues but I didn’t attach the other files for that there’s no need but if needed I can send them, and I even tried using the command shell from within the java code and insert commands of DB creation, table creation and data insertion in it as it used in some other commands but, I got nothing. I would love if you show me my mistakes.
