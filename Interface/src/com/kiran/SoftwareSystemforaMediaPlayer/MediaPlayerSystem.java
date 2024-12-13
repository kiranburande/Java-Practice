package com.kiran.SoftwareSystemforaMediaPlayer;

import java.util.Scanner;

public class MediaPlayerSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String title;
		
		MusicPlayer musicPlayer = new MusicPlayer();
		VideoPlayer videoPlayer = new VideoPlayer();

		
		System.out.println("   Select Media  ");
		System.out.println("1. Audio");
		System.out.println("2. Video");
		System.out.println("Enter your choice :");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter the song :");
		        title = sc.nextLine();
		        title = sc.nextLine();
		        if(title.equals("") || title.equals(" ") || title.equals(null) || title.equals("  "))
		        {
		        	System.err.println("Title is not be empty string.");
		        	System.exit(0);
		        }
		        musicPlayer.play(title);
		        musicPlayer.pause(title);
		        musicPlayer.stop(title);
		        break;
		        
		case 2: System.out.println("Enter the song :");
                title = sc.nextLine();
                title = sc.nextLine();
                if(title.equals("") || title.equals(" ") || title.equals(null) || title.equals("  "))
		        {
		        	System.err.println("Title is not be empty string.");
		        	System.exit(0);
		        }
                videoPlayer.play(title);
                videoPlayer.pause(title);
                videoPlayer.stop(title);
                break;
                
		default : System.err.println("Enter Correct Choice");
		
		}
		
		
		
		
	}

}


/* Question-1
-------------
Design a Software System for a Media Player
---------------------------------------------------
Define an interface named as MediaPlayer 
 in this interface declare two abstract method

Methods :

name 			: play()
Return Type  		:void
Access Modifier 	:public


Methods :

name 			: stop()
Return Type  		:void
Access Modifier 	:public

Define another interface AdvancedmediaPlayer that extends MediaPlayer
and in this interface add one more abstract method i.e :
 
name 			: pause()
Return Type  		:void
Access Modifier 	:public


Create a class MusicPlayer that implements AdvancedMediaPlayer and provides implementations for the methods, and write some standard printing message.

Create a class VideoPlayer that implements AdvancedMediaPlayer and provides implementations for the methods. and write some standard printing message.

Take  a Test class to demonstrate the functionality of the media player system.


Test Case-1 :
--------------

Sample Input:

Song Title: " Life"

Expected Output :

MusicPlayer [Song Title: Life]
Playing music	: Life
Pausing music	: Life
Stopping music	: Life


Test Case-2 :
---------------
Sample Input :" "

Expected Output :
error message :Title is not be empty string.

 */






