package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(true, App.sleepIn(false, false), "INCORRECT");
       assertEquals(true, App.sleepIn(true, true), "INCORRECT");
       assertEquals(false, App.sleepIn(true, false), "INCORRECT");
       assertEquals(true, App.sleepIn(false, true), "INCORRECT");
   }

}
