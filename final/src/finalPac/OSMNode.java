package finalPac;

import java.util.Map;

public class OSMNode {
	
	private String id;
	
	private String lat;
	
	private String lon;
	
	private final Map<String, String> tags;

	private String version;
	public OSMNode(String id,String lat,String lon,String version,Map<String,String> tags){
		this.id=id;
		this.lat=lat;
		this.lon=lon;
		this.tags=tags;
		this.version=version;
	}
	public String getId(){
		return id;
	}
	public String getLon(){
		return lon;
	}
	public String getLat(){
		return lat;
	}


}