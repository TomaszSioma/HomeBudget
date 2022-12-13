package MainClass;

import java.sql.Date;

public class Resources {
	
	private String nameResources;
	private double valueResources;
	private Date dateAddResources;
	
	public Resources(String nameResources, double valueResources, Date dateAddResources) {
		super();
		this.nameResources = nameResources;
		this.valueResources = valueResources;
		this.dateAddResources = dateAddResources;
	}

	public Resources(String nameResources, double valueResources) {
		super();
		this.nameResources = nameResources;
		this.valueResources = valueResources;
	}
	

}
