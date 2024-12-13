package com.kiran.SoftwareSystemforaMediaPlayer;

public class MusicPlayer implements AdvancedmediaPlayer 
{
	String title;

	@Override
	public void play(String title) 
	{
		System.out.println("Playing music	:"+title);
	}

	@Override
	public void stop(String title) 
	{
		System.out.println("Stopping music	:"+title);

	}

	@Override
	public void pause(String title) 
	{
		System.out.println("Pausing music	:"+title);

	}

}
