package com.infinite.Busbooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_wallet")
public class UserWallet {
	
	@Id
	@Column(name="wallet_id")
	private String walletid;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Wallet_Type")
	private WalletType walletType;
	
	@Column(name="WalletAmount")
	private Float walletAmount;
	
	@Column(name="user_id")
	private String userid;
	
	public String getWallet_id() {
		return walletid;
	}
	public void setWallet_id(String walletid) {
		this.walletid = walletid;
	}
	public WalletType getWallet_Type() {
		return walletType;
	}
	public void setWallet_Type(WalletType wallet_Type) {
		this.walletType = walletType;
	}
	public Float getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(Float walletAmount) {
		this.walletAmount = walletAmount;
	}
	public String getUser_id() {
		return userid;
	}
	public void setUser_id(String user_id) {
		this.userid = user_id;
	}
	

}
