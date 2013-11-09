/**
 * 
 */
package de.gammadata.basics.modelle;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class UserRolleDO extends BasicRoleDO {

	private String passwort;
	private String userName;
	private String mD5PassDigest;


	public String getPasswort() {
		return this.passwort;
	}

	/**
	 * @see de.gammadata.basics.modelle.UserRolle#getUserName()
	 */
	public String getUserName() {
		return this.userName;
	}

	/**
	 * @throws NoSuchAlgorithmException 
	 * @see de.gammadata.basics.modelle.UserRolle#setPasswort(java.lang.String)
	 */
	public void setPasswort(String passwort) throws NoSuchAlgorithmException {
		
		this.mD5PassDigest=getMD5PassDigest(passwort);
		this.passwort=passwort;

	}

	/**
	 * @see de.gammadata.basics.modelle.UserRolle#setUserName(java.lang.String)
	 */
	public void setUserName(String userName) {
		this.userName=userName;
	}

	public String getMD5PassDigest() {
		return this.mD5PassDigest;
	}

	public void setMD5PassDigest(String md5Digest) {
		this.mD5PassDigest=md5Digest;
		
	}

	public  String getMD5PassDigest(String secret)  throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] md5Sum = digest.digest(secret.getBytes());
		BigInteger bigInt = new BigInteger(1, md5Sum);
		String output = bigInt.toString(16);
		return output;
	}
	

	public boolean checkPasswort(String pwToCompare)  throws NoSuchAlgorithmException  {
		if (getMD5PassDigest()==null || pwToCompare==null )
			return false;
		String pwMd5 = getMD5PassDigest(pwToCompare);
		boolean result=pwMd5.contentEquals(getMD5PassDigest().subSequence(0, getMD5PassDigest().length()));
		return result;
	}
	
}
	
