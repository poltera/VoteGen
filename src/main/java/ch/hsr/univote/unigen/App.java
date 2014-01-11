package ch.hsr.univote.unigen;

import ch.bfh.univote.common.MixedVerificationKeys;
import ch.hsr.univote.unigen.generator.ElectionDefinitionTask;
import ch.hsr.univote.unigen.generator.ElectionOptionsTask;
import ch.hsr.univote.unigen.generator.prov.WahlGenerator;
import ch.hsr.univote.unigen.board.Publisher;
import ch.hsr.univote.unigen.generator.BallotsTask;
import ch.hsr.univote.unigen.generator.BlindedGeneratorTask;
import ch.hsr.univote.unigen.generator.DecodedVotesTask;
import ch.hsr.univote.unigen.generator.DecryptedVotesTask;
import ch.hsr.univote.unigen.generator.ElectionDataTask;
import ch.hsr.univote.unigen.generator.ElectionGeneratorTask;
import ch.hsr.univote.unigen.generator.ElectionResultsTask;
import ch.hsr.univote.unigen.generator.ElectionSystemInfoTask;
import ch.hsr.univote.unigen.generator.ElectoralRollTask;
import ch.hsr.univote.unigen.generator.EncryptionKeyTask;
import ch.hsr.univote.unigen.generator.EncryptionParametersTask;
import ch.hsr.univote.unigen.generator.MixedVerificationKeysByTask;
import ch.hsr.univote.unigen.generator.MixedVerificationKeysTask;
import ch.hsr.univote.unigen.generator.PartiallyDecryptedVotesTask;
import ch.hsr.univote.unigen.generator.SignatureParametersTask;
import ch.hsr.univote.unigen.generator.SingleBallotTask;
import ch.hsr.univote.unigen.generator.VoterCertsTask;
import ch.hsr.univote.unigen.krypto.PrimeGenerator;
import java.io.FileNotFoundException;
import java.security.cert.CertificateException;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import org.xml.sax.SAXException;

/**
 * Test
 *
 */
public class App {

    public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException, DatatypeConfigurationException, CertificateException, Exception {

        WahlGenerator.run();
        Publisher.main(args);
        System.out.println("WebService gestartet");
        //Runtime.getRuntime().exec(new String[]{"java","-jar","C:/NetBeans/VoteVerifier/target/VoteVerifier-1.1-SNAPSHOT-demo-jar-with-dependencies.jar"});
        Thread.sleep(60000);
        System.exit(0);
    }
}
