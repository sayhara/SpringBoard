package com.myboard.vo;

public class MyBoardVo {
	
	private String id;	//사용자 아이디
	private char w_l;	// 승, 패
	private String champion;	// 챔피언
	private String kda;		// KDA 킬/데스/어시
	private int kill_invol;	//킬 관여 비율
	
	@Override
	public String toString() {
		return String.format("[id=%s, w_l=%c, champion=%s, kda=%s, kill=invol=%d]",
				id,w_l,champion,kda,kill_invol);
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public char getW_l() {
		return w_l;
	}
	public void setW_l(char w_l) {
		this.w_l = w_l;
	}
	public String getChampion() {
		return champion;
	}
	public void setChampion(String champion) {
		this.champion = champion;
	}
	public String getKda() {
		return kda;
	}
	public void setKda(String kda) {
		this.kda = kda;
	}
	public int getKill_invol() {
		return kill_invol;
	}
	public void setKill_invol(int kill_invol) {
		this.kill_invol = kill_invol;
	}

}
