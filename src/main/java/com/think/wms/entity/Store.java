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
	private String storeAddress;
	private String storeTotalSpace;
	private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName + ", storeSubParrent=" + storeSubParrent + ", storeAddress=" + storeAddress
			+ ", storeTotalSpace=" + storeTotalSpace + ", user=" + user + "]";
	}

}
