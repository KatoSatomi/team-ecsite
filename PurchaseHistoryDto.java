package jp.co.internous.team2405.model.domain.dto;

/**
 * 購入履歴画面に表示するためのDTO
 * @author インターノウス
 *
 */
public class PurchaseHistoryDto {
	private String familyName;
	private String firstName;
	private String productName;
	private int price;
	private int productCount;
	private int itemCount;
	private String purchasedAt;
	private String address;
	
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public String getPurchasedAt() {
		return purchasedAt;
	}

	public void setPurchsedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
