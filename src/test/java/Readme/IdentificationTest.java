package Readme;
// import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;  // Import the File class
import java.io.FileInputStream;

public class IdentificationTest {

	@Test
	public void nomComplet1Test() {
        try{
            File file = new File("./README.md");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            
            String str = new String(data, "UTF-8");
            assertFalse("Vous n'avez pas entré votre nom dans README-identification",str.contains("Entrer votre nom"));
            assertFalse("Vous n'avez pas entré votre courriel dans README-identification",str.contains("Entrer votre courriel"));
            assertFalse("Vous n'avez pas entré votre code moodle obtenu à partir de Signet dans README-identification",str.contains("Entrer votre code moodle obtenu à partir de Signet"));
            assertFalse("Vous n'avez pas entré votre identifiant de votre compte github dans README-identification",str.contains("Enter l'identifiant de votre compte github"));

        } catch (Exception e) {
            System.out.println("An error occurred. => " + e.getMessage());
            e.printStackTrace();
          }
	}
}
