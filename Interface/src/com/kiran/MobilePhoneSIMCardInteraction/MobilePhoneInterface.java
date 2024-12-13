package com.kiran.MobilePhoneSIMCardInteraction;

public interface MobilePhoneInterface 
{
	void insertSim(SIMCardInterface s);
	void removeSim(SIMCardInterface s);
	void makeCall(SIMCardInterface s);
	void sendTextMsg(SIMCardInterface s);

}
