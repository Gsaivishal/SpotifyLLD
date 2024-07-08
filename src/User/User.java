package User;

import Spotify.Spotify;

/*
 *	Builder pattern.
 *	Validating the details of user before creating the user object
 */

public class User {
	private String name;
	private int age;
	private String nationality;
	private String contactNumber;
	private boolean isPremiumUser;
	public Spotify spotify;
	
	public User(Builder builder) {
		if(builder.getSpotify() == null)
			throw new RuntimeException("User should have an application");
		
		if(isNameValid(builder.getName()) == false)
			throw new RuntimeException("Invalid Name");
		
		if(isAgeValid(builder.getAge()) == false)
			throw new RuntimeException("Invalid Age");
		
		if(isContactNumberValid(builder.getContactNumber()) == false)
			throw new RuntimeException("Invalid Contact Number");
		
		this.name = builder.getName();
		this.age = builder.getAge();
		this.contactNumber = builder.getContactNumber();
		this.nationality = builder.getNationality();
		this.isPremiumUser = builder.isPremiumUser();
	}

	private boolean isContactNumberValid(String contactNumber) {
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(!(ch >= '0' && ch <= '9'))
				return false;
		}
			
		return true;
	}

	private boolean isAgeValid(int age) {
		if(age > 100) return false;
		return true;
	}

	private boolean isNameValid(String name) {
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(!(ch >= 'A' && ch <= 'Z') && 
					!(ch >= 'a' && ch <= 'z'))
				return false;
		}
			
		return true;
	}
	
	public static Builder getBuilder() {
		return new Builder();
	}
	
	public static class Builder {
		private String name;
		private int age;
		private String nationality;
		private String contactNumber;
		private boolean isPremiumUser;
		private Spotify spotify;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setNationality(String nationality) {
			this.nationality = nationality;
			return this;
		}
		public Builder setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
			return this;
		}
		public Builder setPremiumUser(boolean isPremiumUser) {
			this.isPremiumUser = isPremiumUser;
			return this;
		}
		public Builder setSpotify(Spotify spotify) {
			this.spotify = spotify;
			return this;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getNationality() {
			return nationality;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public boolean isPremiumUser() {
			return isPremiumUser;
		}
		public Spotify getSpotify() {
			return spotify;
		}
		
		public User build() {
			return new User(this);
		}
		
	}
}
