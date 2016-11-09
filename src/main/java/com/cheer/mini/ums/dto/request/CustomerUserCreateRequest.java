package com.cheer.mini.ums.dto.request;

public class CustomerUserCreateRequest {

    private String name;

    private String nickname;

    private String account;

    private String password;

    private short gender;

    private  int accountTypeFk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

	public int getAccountTypeFk() {
		return accountTypeFk;
	}

	public void setAccountTypeFk(int accountTypeFk) {
		this.accountTypeFk = accountTypeFk;
	}


}
