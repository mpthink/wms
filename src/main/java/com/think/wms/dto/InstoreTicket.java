package com.think.wms.dto;

import java.util.List;

import com.think.wms.entity.InstoreMain;
import com.think.wms.entity.InstoreSub;

public class InstoreTicket {

	private InstoreMain instoreMain;
	private List<InstoreSub> instoreSubs;

	public InstoreTicket(InstoreMain instoreMain, List<InstoreSub> instoreSubs) {
		super();
		this.instoreMain = instoreMain;
		this.instoreSubs = instoreSubs;
	}

	public InstoreTicket() {
		super();
	}

	public InstoreMain getInstoreMain() {
		return instoreMain;
	}

	public void setInstoreMain(InstoreMain instoreMain) {
		this.instoreMain = instoreMain;
	}

	public List<InstoreSub> getInstoreSubs() {
		return instoreSubs;
	}

	public void setInstoreSubs(List<InstoreSub> instoreSubs) {
		this.instoreSubs = instoreSubs;
	}

	@Override
	public String toString() {
		return "InstoreTicket [instoreMain=" + instoreMain + ", instoreSubs=" + instoreSubs + "]";
	}

}
