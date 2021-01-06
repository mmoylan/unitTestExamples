/**
 * Created by jb259 on 26/02/16.
 */
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DataSetJunit {
    private static int testsPassed;
    private static int totalTests;
    
    @BeforeClass
    public static void setUp() {
        System.out.println("Comment :=>> Begining Tests");
    }
    
    @AfterClass
    public static void total(){
        System.out.println("Comment :=>> Tests Complete");
        System.out.println("Comment :=>> proposed grade: " + 10*(double)testsPassed/totalTests + " / 10");
        System.out.println("Grade :=>> "+ 10*(double)testsPassed/totalTests + "\n: ");
    }
    
    @Test
    public void testEmptyDataSetSum() {
        System.out.println();
        String testName = "Empty DataSet Sum"; 
        
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        int result = a.getSum();
        int expectedResult = 0;
        assertEquals(expectedResult,result);
        // boolean pass = result == expectedResult;
        // System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        // if(!pass){ System.out.println("<|--");
        //     System.out.println("Expected:");
        //     System.out.println(expectedResult);
        //     System.out.println("Actual:");
        //     System.out.println(result); System.out.println("--|>");
        // }else{
        //     testsPassed++;
        // }
        //assertTrue(pass);
    }

    @Test
    public void testEmptyDataSetAverage() {
        System.out.println();
        String testName = "Empty DataSet Average"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        double result = a.getAverage(); 
        boolean pass = result == 0;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(0);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test1DataSetSum() {
        System.out.println();
        String testName = "DataSet [5] sum"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        double result = a.getSum(); 
        boolean pass = result == 5;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(5);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test1DataSetAverage() {
        System.out.println();
        String testName = "DataSet [5] average"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        double result = a.getAverage(); 
        boolean pass = result == 5;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(5);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test2DataSetSum() {
        System.out.println();
        String testName = "DataSet [5,3] sum"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        a.addValue(3);
        double result = a.getSum(); 
        boolean pass = result == 8;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(8);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test2DataSetAverage() {
        System.out.println();
        String testName = "DataSet [5,3] average"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        a.addValue(3);
        double result = a.getAverage(); 
        boolean pass = result == 4;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(4);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test3DataSetSum() {
        System.out.println();
        String testName = "DataSet [5,2] sum"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        a.addValue(2);
        double result = a.getSum(); 
        boolean pass = result == 7;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(7);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
    @Test
    public void test3DataSetAverage() {
        System.out.println();
        String testName = "DataSet [5,2] average"; 
        System.out.println("Comment :=>> Test " + testName + "...");
        totalTests++;
        DataSet a = new DataSet();
        a.addValue(5);
        a.addValue(2);
        double result = a.getAverage(); 
        boolean pass = result == 3.5;
        System.out.println("Comment :=>>- Test " + testName + " passed: " + pass);
        if(!pass){ System.out.println("<|--");
            System.out.println("Expected:");
            System.out.println(3.5);
            System.out.println("Actual:");
            System.out.println(result); System.out.println("--|>");
        }else{
            testsPassed++;
        }
        assertTrue(pass);
    }
    
} 
    
