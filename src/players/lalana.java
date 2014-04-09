package players;

public class lalana {
	private String name;
	private String position;
	private String friend[];
	public lalana() {
		name = "lalana";
		position = "RB";
		friend = new String[]{"Luke Shaw","Chis Wood","Anthony Knockeart"};
	}
	public lalana (int a) {
		
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
}