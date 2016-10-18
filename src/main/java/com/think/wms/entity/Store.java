package com.think.wms.entity;

/**
 * 仓库信息
 * @author mpthink
 *
 */
public class Store {
	private int storeId;
	private String storeName;
	private int storeSubParrent;
	private String storeSubName;
	private String storeAddress;
	private String storeTotalSpace;
	private User storeManager;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getStoreSubParrent() {
		return storeSubParrent;
	}

	public void setStoreSubParrent(int storeSubParrent) {
		this.storeSubParrent = storeSubParrent;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreTotalSpace() {
		return storeTotalSpace;
	}

	public void setStoreTotalSpace(String storeTotalSpace) {
		this.storeTotalSpace = storeTotalSpace;
	}

	public String getStoreSubName() {
		return storeSubName;
	}

	public void setStoreSubName(String storeSubName) {
		this.storeSubName = storeSubName;
	}

	public User getStoreManager() {
		return storeManager;
	}

	public void setStoreManager(User storeManager) {
		this.storeManager = storeManager;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeSubParrent=" + storeSubParrent + ", storeSubName=" + storeSubName
			+ ", storeAddress=" + storeAddress + ", storeTotalSpace=" + storeTotalSpace + ", storeManager=" + storeManager + "]";
	}


}
