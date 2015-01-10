package houseBuilerPackage;

public class House {
	
	private String bathroom;
	private String bedroom;
	private String kitchen;
	private String livingRoom;
	private int bathroomNum;
	private int bedroomNum;
	
	public String getBathroom() {
		return bathroom;
	}
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}
	public String getBedroom() {
		return bedroom;
	}
	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}
	public String getKitchen() {
		return kitchen;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public String getLivingRoom() {
		return livingRoom;
	}
	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
	}
	public int getBathroomNum() {
		return bathroomNum;
	}
	public void setBathroomNum(int bathroomNum) {
		this.bathroomNum = bathroomNum;
	}
	public int getBedroomNum() {
		return bedroomNum;
	}
	public void setBedroomNum(int bedroomNum) {
		this.bedroomNum = bedroomNum;
	}
	
	public String toString() {
		return ("\nBedrooms: " + bedroom 
				+"\nNumber of Bedrooms: " + bedroomNum 
				+"\nLivingRoom: " +livingRoom
				+"\nKitchen: "+kitchen
				+"\nBathroom: "+bathroom
				+"\nNumber of bathrooms: " + bathroomNum);			
	}

	
}
