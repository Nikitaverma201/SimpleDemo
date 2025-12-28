package first.basic.program;

public class SwitchCondition4 {
	
	public static void main(String b[]) {
		
		String name = "NIKITA";
		
		switch(name) {
		
		case "KAJAL": System.out.println(name +": ELDEST CHILD, MARRID, WORKING IN HOSPITAL");
		break;
		
		case "KAVITA": System.out.println(name +": MIDDLE CHILD, WORKING IN BANK");
		break;
		
		case "VISHAL": System.out.println(name +": SON, WORKING IN ITL INDUSTRIES");
		break;
		
		case "NIKITA": System.out.println(name +": YONGEST CHILD, STUDYING");
		break;
		
		default: System.out.println("NOT IN THE FAMILY");
		}
	}

}
