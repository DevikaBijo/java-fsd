package ArrayList;
import java.util.*;

class Search
{
	int Hotelid;
	String Hotelname;
	String location;
	String EmailId;
	String phonenum;
	public Search(int hotelid, String hotelname, String location, String emailId, String phonenum) {
		super();
		Hotelid = hotelid;
		Hotelname = hotelname;
		this.location = location;
		EmailId = emailId;
		this.phonenum = phonenum;
	}public int getHotelid() {
		return Hotelid;
	}
	public void setHotelid(int hotelid) {
		Hotelid = hotelid;
	}
	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
	
}


public class SearchHotels {

	public static void main(String[] args) {
		Search h1=new Search(012,"sfs","trivandrum","sfs@gmail.com","04862274848");
		Search h2=new Search(013,"skyline","trivandrum","skylinr@gmail.com","8181456780");
		Search h3=new Search(114,"flemingo","trivandrum","flemingo@gmail.com","9747567800");
		Search h4=new Search(115,"kalyan","trivandrum","kalyan@gamil.com","9870543678");
		List<Search>cd=Arrays.asList(h1,h2,h3,h4);
		

	}

}
