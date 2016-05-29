package beans;

import java.util.ArrayList;
import java.util.Date;

public class ProcurementOrder {
	public int id;
	public int status;
	public int productType;
	public int qty;
	public float fob;
	public ArrayList<String>documents;
	public Date initDate;

}
