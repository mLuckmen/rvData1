package id.ac.telkomuniversity.dph3a4.rvdata1;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("keterangan")
	private String keterangan;

	@SerializedName("kodeKldi")
	private String kodeKldi;

	@SerializedName("listPaketAnggaranM")
	private List<ListPaketAnggaranMItem> listPaketAnggaranM;

	@SerializedName("auditupdate")
	private String auditupdate;

	@SerializedName("jumlahPagu")
	private int jumlahPagu;

	@SerializedName("tanggalAkhirPengadaan")
	private String tanggalAkhirPengadaan;

	@SerializedName("tanggalAwalPekerjaan")
	private String tanggalAwalPekerjaan;

	@SerializedName("tanggalAwalPengadaan")
	private String tanggalAwalPengadaan;

	@SerializedName("createdOn")
	private String createdOn;

	@SerializedName("aktif")
	private boolean aktif;

	@SerializedName("is_delete")
	private boolean isDelete;

	@SerializedName("tanggalPengumuman")
	private String tanggalPengumuman;

	@SerializedName("volume")
	private String volume;

	@SerializedName("tanggalAkhirPekerjaan")
	private String tanggalAkhirPekerjaan;

	@SerializedName("nama")
	private String nama;

	@SerializedName("spesifikasi")
	private String spesifikasi;

	@SerializedName("kegiatan")
	private String kegiatan;

	@SerializedName("jenisPengadaan")
	private int jenisPengadaan;

	@SerializedName("idSatker")
	private int idSatker;

	@SerializedName("metodePengadaan")
	private int metodePengadaan;

	@SerializedName("tahunAnggaran")
	private int tahunAnggaran;

	@SerializedName("id")
	private int id;

	@SerializedName("sumberDanaString")
	private String sumberDanaString;

	public String getKeterangan(){
		return keterangan;
	}

	public String getKodeKldi(){
		return kodeKldi;
	}

	public List<ListPaketAnggaranMItem> getListPaketAnggaranM(){
		return listPaketAnggaranM;
	}

	public String getAuditupdate(){
		return auditupdate;
	}

	public int getJumlahPagu(){
		return jumlahPagu;
	}

	public String getTanggalAkhirPengadaan(){
		return tanggalAkhirPengadaan;
	}

	public String getTanggalAwalPekerjaan(){
		return tanggalAwalPekerjaan;
	}

	public String getTanggalAwalPengadaan(){
		return tanggalAwalPengadaan;
	}

	public String getCreatedOn(){
		return createdOn;
	}

	public boolean isAktif(){
		return aktif;
	}

	public boolean isIsDelete(){
		return isDelete;
	}

	public String getTanggalPengumuman(){
		return tanggalPengumuman;
	}

	public String getVolume(){
		return volume;
	}

	public String getTanggalAkhirPekerjaan(){
		return tanggalAkhirPekerjaan;
	}

	public String getNama(){
		return nama;
	}

	public String getSpesifikasi(){
		return spesifikasi;
	}

	public String getKegiatan(){
		return kegiatan;
	}

	public int getJenisPengadaan(){
		return jenisPengadaan;
	}

	public int getIdSatker(){
		return idSatker;
	}

	public int getMetodePengadaan(){
		return metodePengadaan;
	}

	public int getTahunAnggaran(){
		return tahunAnggaran;
	}

	public int getId(){
		return id;
	}

	public String getSumberDanaString(){
		return sumberDanaString;
	}
}