package stepGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Feature\\Rating.feature"	

		)
public class SanityTestRunner extends AbstractTestNGCucumberTests{	
}
