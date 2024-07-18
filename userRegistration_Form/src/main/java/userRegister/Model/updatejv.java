package userRegister.Model;

public class updatejv {
	private int id;//1
	private String name;//2
	private String rdate;//3
	private String rate;//4
	private String cgory;//5
	private String lng;//6
	private String dname;//7
	private String descript;//8
	private String upname;//9
	private String upldt;//10
	
	public updatejv(int id, String name, String rdate, String rate, String cgory, String lng, String dname,
			String descript, String upname, String upldt) {
		
		this.id = id;
		this.name = name;
		this.rdate = rdate;
		this.rate = rate;
		this.cgory = cgory;
		this.lng = lng;
		this.dname = dname;
		this.descript = descript;
		this.upname = upname;
		this.upldt = upldt;
	}
	
	public int getId() {
		return id;
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
	public String getUpname() {
		return upname;
	}
	public String getUpldt() {
		return upldt;
	}

}
