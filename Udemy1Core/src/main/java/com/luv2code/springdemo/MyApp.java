package com.luv2code.springdemo;

public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Coach base=new BaseBallCoach();
		Coach track=new TrackCoach();
		System.out.println(base.getDailyWorkOut());
		System.out.println(track.getDailyWorkOut());

	}

}
