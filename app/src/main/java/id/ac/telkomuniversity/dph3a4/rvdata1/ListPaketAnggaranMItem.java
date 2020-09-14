package id.ac.telkomuniversity.dph3a4.rvdata1;

import com.google.gson.annotations.SerializedName;

public class ListPaketAnggaranMItem{

	@SerializedName("asalDanaSatker")
	private int asalDanaSatker;

	@SerializedName("sumberDana")
	private int sumberDana;

	@SerializedName("tahunAnggaranDana")
	private int tahunAnggaranDana;

	@SerializedName("mak")
	private String mak;

	@SerializedName("auditupdate")
	private String auditupdate;

	@SerializedName("pktId")
	private int pktId;

	@SerializedName("jenis")
	private int jenis;

	@SerializedName("asalDana")
	private String asalDana;

	@SerializedName("id")
	private int id;

	@SerializedName("pagu")
	private int pagu;

	public int getAsalDanaSatker(){
		return asalDanaSatker;
	}

	public int getSumberDana(){
		return sumberDana;
	}

	public int getTahunAnggaranDana(){
		return tahunAnggaranDana;
	}

	public String getMak(){
		return mak;
	}

	public String getAuditupdate(){
		return auditupdate;
	}

	public int getPktId(){
		return pktId;
	}

	public int getJenis(){
		return jenis;
	}

	public String getAsalDana(){
		return asalDana;
	}

	public int getId(){
		return id;
	}

	public int getPagu(){
		return pagu;
	}
}