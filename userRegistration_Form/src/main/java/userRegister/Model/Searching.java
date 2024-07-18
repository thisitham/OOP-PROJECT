package userRegister.Model;

public class Searching {
	private String name;//2
	private String rdate;//3
	private String rate;//4
	private String cgory;//5
	private String lng;//6
	private String dname;//7
	private String descript;//8
	
	public Searching() {
		super();
	}

	public Searching(String name, String rdate, String rate, String cgory, String lng, String dname, String descript) {
		this.name = name;
		this.rdate = rdate;
		this.rate = rate;
		this.cgory = cgory;
		this.lng = lng;
		this.dname = dname;
		this.descript = descript;
	}

	public String getName() {
		return name;
	}

	public String getRdate() {
		return rdate;
	}

	public String getRate() {
		return rate;
	}

	public String getCgory() {
		return cgory;
	}

	public String getLng() {
		return lng;
	}

	public String getDname() {
		return dname;
	}

	public String getDescript() {
		return descript;
	}
	
	
	
	
}
