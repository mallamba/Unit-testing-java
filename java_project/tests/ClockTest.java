/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author Louay
 */
public class ClockTest {
    private Clock ck = new Clock();

    /****************************** start Clock.changeMode() ****************************/
    /************************************************************************************/
    /************************************************************************************/
    /**
     * Test of changeMode for class Clock, first state
     */
    @Test
    public void testChangeMode1() {
        assertEquals( "2000-1-1", ck.changeMode()  );
    }



    /**
     * Test of changeMode for class Clock, second state
     */
    @Test
    public void testChangeMode2() {
        ck = new Clock();
        ck.changeMode();
        assertEquals( "0:0:0", ck.changeMode()  );
    }



    /**
     * Test of changeMode for class Clock, third state
     */
    @Test
    public void testChangeMode3() {
        ck.ready();
        assertEquals( "State3: un-available", ck.changeMode()  );
    }



    /**
     * Test of changeMode for class Clock, fourth state
     */
    @Test
    public void testChangeMode4() {
        ck.changeMode();
        ck.ready();
        assertEquals( "State4: un-available", ck.changeMode()  );
    }
    /******************************* end Clock.changeMode() *****************************/
    /************************************************************************************/





    /****************************** start Clock.ready() *********************************/
    /************************************************************************************/
    /************************************************************************************/
    /**
     * Test of ready() for class Clock, first state
     */
    @Test
    public void testReady1() {
        assertEquals( "Give Time", ck.ready()  );
    }



    /**
     * Test of ready() for class Clock, second state
     */
    @Test
    public void testReady2() {
        ck.changeMode();
        assertEquals( "Give Date", ck.ready()   );
    }



    /**
     * Test of ready() for class Clock, third state
     */
    @Test
    public void testReady3() {
        ck.ready();
        assertEquals( "Ready State3: un-available", ck.ready()   );
    }



    /**
     * Test of ready() for class Clock, fourth state
     */
    @Test
    public void testReady4() {
        ck.changeMode();
        ck.ready();
        assertEquals( "Ready State4: un-available", ck.ready()   );
    }
    /******************************* end Clock.ready() **********************************/
    /************************************************************************************/






    /****************************** start Clock.set() ***********************************/
    /************************************************************************************/
    /************************************************************************************/
    /**
     * Test of set() for class Clock, first state
     */
    @Test
    public void testSet1() {
        assertEquals( "Set State1: un-available", ck.set(19, 21, 34)  );
    }



    /**
     * Test of set() for class Clock, second state
     */
    @Test
    public void testSet2() {
        ck.changeMode();
        assertEquals( "Set State2: un-available", ck.set(2019, 10, 01)   );
    }



    /**
     * Test of set() for class Clock, third state
     */
    @Test
    public void testSet3() {
        ck.ready();
        assertEquals( "19:21:34", ck.set(19, 21, 34)  );
    }



    /**
     * Test of set() for class Clock, fourth state
     */
    @Test
    public void testSet4() {
        ck.changeMode();
        ck.ready();
        assertEquals( "2019-10-1", ck.set(2019, 10, 01)   );
    }
    /******************************* end Clock.set() ************************************/
    /************************************************************************************/




    /****************************** start Time ******************************************/
    /************************************************************************************/
    /************************************************************************************/

    /**
     * Test of showTime for class Time
     */
    @Test
    public void testTimeDefault() {
        Clock.Time time = new Clock.Time();
        assertEquals( "0:0:0", time.showTime()   );
    }



    /**
     * Test of showTime for class Time
     */
    @Test
    public void testTimeDefault_after_change_direct() {
        Clock.Time time = new Clock.Time();
        time.theHour = 5;
        time.theMinute = 23;
        time.theSecond = 56;
        assertEquals( "5:23:56", time.showTime()   );
    }



    /**
     * Test of timeSet for class Time
     */
    @Test
    public void testTime_timeSet1() {
        Clock.Time time = new Clock.Time();
        assertEquals( "19:12:47", time.timeSet(19, 12, 47)   );
    }



    /**
     * Test of showTime for class Time after timeSet
     */
    @Test
    public void testTime_showTime_After_timeSet() {
        Clock.Time time = new Clock.Time();
        time.timeSet(19, 12, 57);
        assertEquals( "19:12:57", time.showTime()  );
    }



    /**
     * Test of timeSet for class Time with high value of hours
     */
    @Test
    public void testTime_timeSet2() {
        Clock.Time time = new Clock.Time();
        assertEquals( "error", time.timeSet(25, 12, 47)   );
    }



    /**
     * Test of timeSet for class Time with high value of minutes
     */
    @Test
    public void testTime_timeSet3() {
        Clock.Time time = new Clock.Time();
        assertEquals( "error", time.timeSet(12, 61, 47)   );
    }



    /**
     * Test of timeSet for class Time with high value of seconds
     */
    @Test
    public void testTime_timeSet4() {
        Clock.Time time = new Clock.Time();
        assertEquals( "error", time.timeSet(12, 13, 80)   );
    }

    /******************************* end Time *******************************************/
    /************************************************************************************/





    /****************************** start Date Test *************************************/
    /************************************************************************************/
    /************************************************************************************/

    /**
     * Test of showDate for class Date
     */
    @Test
    public void testDateDefault() {
        Clock.Date date = new Clock.Date();
        assertEquals( "2000-1-1", date.showDate()   );
    }



    /**
     * Test of showDate for class Date
     */
    @Test
    public void testDateDefault_with_direct_change() {
        Clock.Date date = new Clock.Date();
        date.theDay = 20;
        date.theMonth = 10;
        date.theYear = 2002;
        assertEquals( "2002-10-20", date.showDate()   );
    }



    /**
     * Test of dateSet for class Date
     */
    @Test
    public void testDate_dateSet1() {
        Clock.Date date = new Clock.Date();
        assertEquals( "1934-12-12", date.dateSet(1934, 12, 12)   );
    }



    /**
     * Test of dateSet & showDate for class Date
     */
    @Test
    public void testDate_showDate_After_dateSet() {
        Clock.Date date = new Clock.Date();
        date.dateSet(1934, 12, 11);
        assertEquals( "1934-12-11", date.showDate()  );
    }



    /**
     * Test of dataSet for class Date with low value of year
     */
    @Test
    public void testDate_dateSet2() {
        Clock.Date date = new Clock.Date();
        assertEquals( "error", date.dateSet(199, 12, 01)  );
    }



    /**
     * Test of dataSet for class Date with high value of month
     */
    @Test
    public void testDate_dateSet3() {
        Clock.Date date = new Clock.Date();
        assertEquals( "error", date.dateSet(2001, 13, 01)  );
    }



    /**
     * Test of dataSet for class Date with high value of day
     */
    @Test
    public void testDate_dateSet4() {
        Clock.Date date = new Clock.Date();
        assertEquals( "error", date.dateSet(2001, 11, 40)  );
    }

    /******************************* end Date Test **************************************/
    /************************************************************************************/

}
