package com.think.wms.enums;

public enum TicketStatusEnum {
	NOT_SUBMIT(1, "未提交"), SUBMIT(2, "已提交"), REVIEWED(3, "已审核"), Double_reviewed(4, "已复核");

	private int state;
	private String stateInfo;

	private TicketStatusEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public static TicketStatusEnum stateOf(int index) {
		for (TicketStatusEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
