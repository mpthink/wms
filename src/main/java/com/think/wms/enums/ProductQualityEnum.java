package com.think.wms.enums;

public enum ProductQualityEnum {

	GOOD_PRODUCT(1, "正品"), SAMPLE_PRODUCT(2, "样品"), DEFECTIVE_PRODUCT(3, "次品");

	private int state;
	private String stateInfo;

	private ProductQualityEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static String[] stateInfos() {
		String[] stateInfos = new String[values().length];
		for (ProductQualityEnum state : values()) {
			stateInfos[state.getState()] = state.getStateInfo();
		}
		return stateInfos;
	}

	public static ProductQualityEnum stateOf(int index) {
		for (ProductQualityEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}

}
