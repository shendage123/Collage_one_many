package Univercity_uni_onetoone.main;

import Univercity_uni_onetoone.dao.SchoolDao;
import Univercity_uni_onetoone.dto.Collage;
import Univercity_uni_onetoone.dto.School;

public class main {
public static void main(String[] ages)
{
	
	School sc=new School();
	sc.setId(2);
	sc.setName("Mr_shubham");
	sc.setFees(17000);
	sc.setPhone(381989292);
	
	Collage collage=new Collage();
	collage.setId(2);
	collage.setName("North Maharashra University");
	collage.setRollno(43);
	collage.setSchool(sc);
	
	SchoolDao dao=new SchoolDao();
	// dao.savacollage(collage);
	dao.getfind(2);

}
}
