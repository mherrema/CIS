package gvprojects.countdowntimer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: mitchherrema
 * Date: 1/12/13
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountDownTimerTest {
    @Test
    public void totalSecondsCombinesAllThreeValues() throws Throwable {
        assertEquals(3661, CountDownTimer.totalSeconds(1, 1, 1));
    }

    @Test
    public void totalSecondsCombinesAllThreeValues() throws Throwable {
        assertEquals(3660, CountDownTimer.totalSeconds(1, 1, 0));
    }

    @Test
    public void totalSecondsCombinesAllThreeValues() throws Throwable {
        assertEquals(121, CountDownTimer.totalSeconds(0, 2, 1));
    }

    @Test
    public void defaultConstructorSetsTimeToZero() throws Throwable {
        CountDownTimer timer = new CountDownTimer();
        assertEquals(0, timer.totalSeconds());
    }

    @Test
    public void threeParameterConstructorCorrectlySetsTime() throws Throwable {
        CountDownTimer timer = new CountDownTimer(1, 2, 3);
        assertEquals(3723, timer.totalSeconds());
    }

    @Test
    public void threeParameterConstructorCorrectlySetsTime() throws Throwable {
        CountDownTimer timer = new CountDownTimer(2, 3);
        assertEquals(123, timer.totalSeconds());
    }

    @Test
    public void threeParameterConstructorCorrectlySetsTime() throws Throwable {
        CountDownTimer timer = new CountDownTimer(3);
        assertEquals(3, timer.totalSeconds());
    }

    @Test
    public void copyConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(3, 4);
        CountDownTimer timer2 = new CountDownTimer(timer1);
        assertEquals(184, timer2.totalSeconds());
    }

    @Test
    public void copyConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer( 4);
        CountDownTimer timer2 = new CountDownTimer(timer1);
        assertEquals(4, timer2.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("11:12:13");
        assertEquals(40333, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("11:12:03");
        assertEquals(40323, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("11:02:13");
        assertEquals(39733, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("01:12:13");
        assertEquals(4333, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("12:13");
        assertEquals(733, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("12:03");
        assertEquals(723, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("02:13");
        assertEquals(133, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("13");
        assertEquals(13, timer1.totalSeconds());
    }

    @Test
    public void stringConstructor() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer("03");
        assertEquals(3, timer1.totalSeconds());
    }

    @Test
    public void equalsDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(2, 3, 4);
        CountDownTimer timer2 = new CountDownTimer("2:03:04");
        assertTrue(timer1.equals(timer2));
    }

    @Test
    public void equalsDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(3, 4);
        CountDownTimer timer2 = new CountDownTimer("3:04");
        assertTrue(timer1.equals(timer2));
    }

    @Test
    public void equalsDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(4);
        CountDownTimer timer2 = new CountDownTimer("4");
        assertTrue(timer1.equals(timer2));
    }

    @Test
    public void equalsDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(4, 3, 4);
        CountDownTimer timer2 = new CountDownTimer("2:03:04");
        assertFalse(timer1.equals(timer2));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(2, 3, 4);
        CountDownTimer timer2 = new CountDownTimer("2:03:04");
        assertTrue(timer1.equals(timer2));
        assertEquals(0, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(3, 4);
        CountDownTimer timer2 = new CountDownTimer("3:04");
        assertTrue(timer1.equals(timer2));
        assertEquals(0, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(4);
        CountDownTimer timer2 = new CountDownTimer("4");
        assertTrue(timer1.equals(timer2));
        assertEquals(0, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(123, 4);
        CountDownTimer timer2 = new CountDownTimer("2:03:04");
        assertTrue(timer1.equals(timer2));
        assertEquals(0, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(61);
        CountDownTimer timer2 = new CountDownTimer("01:01");
        assertTrue(timer1.equals(timer2));
        assertEquals(0, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(2, 3, 5);
        CountDownTimer timer2 = new CountDownTimer("2:03:04");
        assertFalse(timer1.equals(timer2));
        assertEquals(1, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(2, 3, 4);
        CountDownTimer timer2 = new CountDownTimer("2:03:05");
        assertFalse(timer1.equals(timer2));
        assertEquals((-1), timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(4, 4);
        CountDownTimer timer2 = new CountDownTimer("3:04");
        assertFalse(timer1.equals(timer2));
        assertEquals(60, timer2.compareTo(timer1));
    }

    @Test
    public void compareToDetectsEquality() throws Throwable {
        CountDownTimer timer1 = new CountDownTimer(12);
        CountDownTimer timer2 = new CountDownTimer("04");
        assertFalse(timer1.equals(timer2));
        assertEquals(8, timer2.compareTo(timer1));
    }

    @Test
    public void subtractHandlesSmallSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(55);
        timer.subtract(25);
        assertEquals(30, timer.totalSeconds());
    }

    @Test
    public void subtractHandlesSmallSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(1:05);
        timer.subtract(6);
        assertEquals(59, timer.totalSeconds());
    }

    @Test
    public void subtractHandlesSmallSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(1:00:07);
        timer.subtract(8);
        assertEquals(3599, timer.totalSeconds());
    }

    @Test
    public void toStringAddsLeading0toSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(0, 0, 3);
        assertEquals("0:00:03", timer.toString());
    }

    @Test
    public void toStringAddsLeading0toSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(1, 0, 3);
        assertEquals("1:00:03", timer.toString());
    }

    @Test
    public void toStringAddsLeading0toSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(0, 1, 3);
        assertEquals("0:01:03", timer.toString());
    }

    @Test
    public void toStringAddsLeading0toSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(0, 10, 3);
        assertEquals("0:10:03", timer.toString());
    }

    @Test
    public void toStringAddsLeading0toSeconds() throws Throwable {
        CountDownTimer timer = new CountDownTimer(21, 32, 0);
        assertEquals("21:32:00", timer.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(1, 2, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(1, -2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(-1, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(1, -2, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(-1, -2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void totalSecondsShouldThrowExceptionIfSecondsNegative() {
        CountDownTimer.totalSeconds(-1, -2, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(1, -2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(-1, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(1, 2, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(-2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(2, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowExceptionIfSecondsNegative() {
        new CountDownTimer(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringConstructor_error18() {
        new CountDownTimer("1:2:3:4");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringConstructor_error18() {
        new CountDownTimer("1:2:3:");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringConstructor_error18() {
        new CountDownTimer("3:");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringConstructor_error18() {
        new CountDownTimer("1:62");
    }

    @Test(expected = IllegalArgumentException.class)
    public void stringConstructor_error18() {
        new CountDownTimer("1:62:0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtract_error18() {
        CountDownTimer timer = new CountDownTimer(0:00:07);
        timer.subtract(8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtract_error18() {
        CountDownTimer timer = new CountDownTimer(0:01:07);
        timer.subtract(68);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtract_error18() {
        CountDownTimer timer = new CountDownTimer(1:00:07);
        timer.subtract(3608);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtract_error18() {
        CountDownTimer timer = new CountDownTimer(0:00:00);
        timer.dec();
    }


}
