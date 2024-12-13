package com.kiran.SoftwareSystemforaMediaPlayer;

public class VideoPlayer implements AdvancedmediaPlayer 
{

	@Override
	public void play(String title) 
	{
		System.out.println("Playing video :"+title);
	}

	@Override
	public void stop(String title) 
	{
		System.out.println("Stopping Video :"+title);
	}

	@Override
	public void pause(String title) 
	{
		System.out.println("Pausing video :"+title);

	}

}
