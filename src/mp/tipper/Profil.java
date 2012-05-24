package mp.tipper;

public class Profil 
{
	String nickname;
	int number;
	int[] friendsnumbers;
	int punkte;
	int platz;
	
	public int[] getFriendsnumbers() {
		return friendsnumbers;
	}
	
	public void setFriendsnumbers(int[] friendsnumbers) {
		this.friendsnumbers = friendsnumbers;
	}
	
	public void addFriend(int number)
	{
		
	}
	
	public int getPunkte() {
		return punkte;
	}

	public int getPlatz() {
		return platz;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
