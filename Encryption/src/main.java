
public class main {
	public static void main(String[] args) throws Exception {
		byte[] encrypted = (byte[]) null;
		byte[] decrypted = (byte[]) null;

		String encryptedText = "";
		String decryptedText = "";

		byte[] text = "Can't get enough of that wonderful Duff.".getBytes();

		DesEncryption des = new DesEncryption();
		des.key = des.keyGenerator();

		encrypted = des.encrypt(text, des.key);
		decrypted = des.decrypt(encrypted, des.key);

		encryptedText = new String(encrypted);
		decryptedText = new String(decrypted);

		System.out.println("Text [Byte Format] : " + text);
		System.out.println("Text : " + new String(text));
		System.out.println();
		System.out.println("DES Encrypted Text [Byte Format] : " + encrypted);
		System.out.println("DES Encrypted Text : " + encryptedText);
		System.out.println();
		System.out.println("DES Decrypted Text [Byte Format] : " + decrypted);
		System.out.println("DES Decrypted Text : " + decryptedText);
		System.out.println();
		System.out.println();

		ThreeDes threeDes = new ThreeDes();
		threeDes.key = threeDes.keyGenerator();

		encrypted = threeDes.encrypt(text, threeDes.key);
		decrypted = threeDes.decrypt(encrypted, threeDes.key);

		encryptedText = new String(encrypted);
		decryptedText = new String(decrypted);

		System.out.println("Text [Byte Format] : " + text);
		System.out.println("Text : " + new String(text));
		System.out.println();
		System.out.println("3DES Encrypted Text [Byte Format] : " + encrypted);
		System.out.println("3DES Encrypted Text : " + encryptedText);
		System.out.println();
		System.out.println("3DES Decrypted Text [Byte Format] : " + decrypted);
		System.out.println("3DES Decrypted Text : " + decryptedText);
		System.out.println();
		System.out.println();
		
		Aes aes = new Aes();
		aes.key = aes.keyGenerator();

		encrypted = aes.encrypt(text, aes.key);
		decrypted = aes.decrypt(encrypted, aes.key);

		encryptedText = new String(encrypted);
		decryptedText = new String(decrypted);

		System.out.println("Text [Byte Format] : " + text);
		System.out.println("Text : " + new String(text));
		System.out.println();
		System.out.println("AES Encrypted Text [Byte Format] : " + encrypted);
		System.out.println("AES Encrypted Text : " + encryptedText);
		System.out.println();
		System.out.println("AES Decrypted Text [Byte Format] : " + decrypted);
		System.out.println("AES Decrypted Text : " + decryptedText);
		System.out.println();
		System.out.println();
		
	}

}
