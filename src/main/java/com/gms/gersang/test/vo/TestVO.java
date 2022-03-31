package com.gms.gersang.test.vo;

public class TestVO {

	private String testA;
	private String testB;
	
	public String getTestA() {
		return testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}
	public String getTestB() {
		return testB;
	}
	public void setTestB(String testB) {
		this.testB = testB;
	}
	
	@Override
	public String toString() {
		return "TestVO [testA=" + testA + ", testB=" + testB + "]";
	}
}
