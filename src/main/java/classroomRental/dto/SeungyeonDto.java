package classroomRental.dto;

public class SeungyeonDto
{
	String facilityCode; //시설코드
	String facilityName; //시설명
	int person; //인원
	String way; //방식
	int dataInfo; //primary key
	
	public String getFacilityCode() {
		return facilityCode;
	}
	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public int getDataInfo() {
		return dataInfo;
	}
	public void setDataInfo(int dataInfo) {
		this.dataInfo = dataInfo;
	}
}
