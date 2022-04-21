package com.automation;



import org.junit.Test;



import org.junit.*;



    
public class exercise1 extends exercisecommon {
      @Before
      public void start_testing() {
            System.out.println("start_testing ");
      }

      @Test
      public void checkstring() {
            int [][] A={{1,2,4},
                        {3,4,6},
                        {5,6,5}};
            System.out.println("Test case 1");
            String chuoi ="DataLoader (“${_getData[1][1]}”)fsdfdfd$${_getData[2]}fdff" ;            
            solution(chuoi,A);

      }

      
      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
