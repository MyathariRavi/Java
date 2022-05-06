package com.sol;

public class AlertImpl implements Alert {

	@Override
	public String morning() {
		// TODO Auto-generated method stub
		return "Hello .. Very Good Morning...";
	}
	
	public static void main(String[] args) {
		Alert ai = new AlertImpl();
		ai.news();
		
		
	}

}
