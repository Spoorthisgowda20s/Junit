package com.bnmit;

public class Greatest {

    public static int findGreatest(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3)
            return num1;

        else if (num2 >= num1 && num2 >= num3)
            return num2;

        else
            return num3;
    }

    public static void main(String[] args) {

        int num1 = 10, num2 = 20, num3 = 30;

        int greatest = findGreatest(num1, num2, num3);
        System.out.println(greatest + " is the greatest");
    }
}



package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreatestTest {

    @Test
    public void testNum3Greatest() {
        assertEquals(30, Greatest.findGreatest(10, 20, 30));
    }

    @Test
    public void testNum2Greatest() {
        assertEquals(50, Greatest.findGreatest(10, 50, 30));
    }

    @Test
    public void testNum1Greatest() {
        assertEquals(100, Greatest.findGreatest(100, 20, 30));
    }

    @Test
    public void testAllEqual() {
        assertEquals(10, Greatest.findGreatest(10, 10, 10));
    }
}

