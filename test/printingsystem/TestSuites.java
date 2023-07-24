package printingsystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)

@SuiteClasses(value={ OrderTest.class ,
		CalculateChargeForDocumentTest.class,
		CalculateChargeForPhotoTest.class,
		IntegrationTest.class
		})

public class TestSuites {

}
