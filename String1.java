
public class String1 {

	public static void main(String[] args) {
String s= new String("Gaurav ");

System.out.println(s.length());

System.out.println(s.concat("Jejurkar"));

System.out.println(s.toLowerCase());

System.out.println(s.toUpperCase());

System.out.println("___________________________________________");


			String s1= "Yeola";

				System.out.println(s.equals(s1));
				System.out.println(s1.equals("yeola"));
				System.out.println(s1.equalsIgnoreCase("yeola"));


System.out.println(s1.replace('o', 'v'));

System.out.println(s1.trim());

System.out.println(s.substring(3));

System.out.println(s.substring(0, 4));


System.out.println("___________________________________________________________________________");

String s3= "Ram";
String s4= "Ram";

String s5= new String("Ram");
String s6= new String("Ram");

System.out.println(s3==s4);

System.out.println(s5==s6);

//System.out.println(s3.equals(s4));



	}

}
