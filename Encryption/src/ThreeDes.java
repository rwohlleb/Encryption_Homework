import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class ThreeDes {
	SecretKey key;

	public SecretKey keyGenerator() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("TripleDES");
		return (keyGenerator.generateKey());
	}

	public byte[] encrypt(byte[] text, SecretKey key) throws Exception {
		Cipher desCipher;
		desCipher = Cipher.getInstance("TripleDES/ECB/PKCS5Padding");
		desCipher.init(Cipher.ENCRYPT_MODE, key);

		byte[] textEncrypted = desCipher.doFinal(text);
		return textEncrypted;
	}

	public byte[] decrypt(byte[] text, SecretKey key) throws Exception {
		Cipher desCipher;
		desCipher = Cipher.getInstance("TripleDES/ECB/PKCS5Padding");
		desCipher.init(Cipher.DECRYPT_MODE, key);

		byte[] textDecrypted = desCipher.doFinal(text);
		return textDecrypted;
	}

}
