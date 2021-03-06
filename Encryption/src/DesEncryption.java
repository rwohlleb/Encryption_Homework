import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DesEncryption {
	SecretKey key;

	public SecretKey keyGenerator() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
		return (keyGenerator.generateKey());
	}

	public byte[] encrypt(byte[] text, SecretKey key) throws Exception {
		Cipher desCipher;
		desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		desCipher.init(Cipher.ENCRYPT_MODE, key);

		byte[] textEncrypted = desCipher.doFinal(text);
		return textEncrypted;
	}

	public byte[] decrypt(byte[] text, SecretKey key) throws Exception {
		Cipher desCipher;
		desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		desCipher.init(Cipher.DECRYPT_MODE, key);

		byte[] textDecrypted = desCipher.doFinal(text);
		return textDecrypted;
	}

}
