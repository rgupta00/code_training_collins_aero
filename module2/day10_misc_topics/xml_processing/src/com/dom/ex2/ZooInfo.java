package com.dom.ex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="zoo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZooInfo {
	
	@XmlElement(required=true)
	private String zooName;
	
	private int zooId;

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}

	public int getZooId() {
		return zooId;
	}

	public void setZooId(int zooId) {
		this.zooId = zooId;
	}

	@Override
	public String toString() {
		return "ZooInfo [zooName=" + zooName + ", zooId=" + zooId + "]";
	}

	public ZooInfo(String zooName, int zooId) {
		super();
		this.zooName = zooName;
		this.zooId = zooId;
	}

	public ZooInfo() {}
	
	
}
