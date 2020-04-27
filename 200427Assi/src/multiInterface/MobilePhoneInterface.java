package multiInterface;

import phoneterFace.PhoneInterface;

public interface MobilePhoneInterface extends PhoneInterface{
	void sendCall();
	void receiveCall();
	void sendSMS();
	void receiveSMS();
}
