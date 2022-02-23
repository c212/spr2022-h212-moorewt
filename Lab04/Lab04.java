import java.math.BigDecimal;

public class EarlyEval {
    public static void main(String[] args) {
        EarlyEval.one();
        EarlyEval.two();
        EarlyEval.three();
        EarlyEval.four();
        EarlyEval.five();
        EarlyEval.six();
        EarlyEval.seven();
        EarlyEval.eight();
        EarlyEval.nine();
        EarlyEval.ten();
        EarlyEval.eleven();
        EarlyEval.twelve();
        EarlyEval.thirteen();
        EarlyEval.fourteen();
        EarlyEval.fifteen();
        EarlyEval.sixteen();
        EarlyEval.seventeen();
        EarlyEval.eighteen();
        EarlyEval.nineteen();
        EarlyEval.twenty();
        EarlyEval.twentyOne();
        EarlyEval.twentyTwo();
        EarlyEval.twentyThree();
        EarlyEval.twentyFour();
        EarlyEval.twentyFive();
        EarlyEval.twentySix();
        EarlyEval.twentySeven();
        EarlyEval.twentyEight();
        EarlyEval.twentyNine();
        EarlyEval.thirty();
        EarlyEval.thirtyOne();
        EarlyEval.thirtyTwo();
        EarlyEval.thirtyThree();
        EarlyEval.thirtyFour();
        EarlyEval.thirtyFive();
        EarlyEval.thirtySix();
        EarlyEval.thirtySeven();
        EarlyEval.thirtyEight();
        EarlyEval.thirtyNine();
        EarlyEval.forty();
        EarlyEval.fortyOne();
        EarlyEval.fortyTwo();
        EarlyEval.fortyThree();
        EarlyEval.fortyFour();
        EarlyEval.fortyFive();
        EarlyEval.fortySix();
        EarlyEval.fortySeven();
        EarlyEval.fortyEight();
        EarlyEval.fortyNine();
        EarlyEval.fifty();
        EarlyEval.fiftyOne();
        EarlyEval.fiftyTwo();
    }

    public static void one() {
        System.out.println("1. What does this line of code print: System.out.println(\"+---+\\n|   |\\n+---+\"); ");
        // expected output, prints a box shape
        System.out.println("+---+\n|   |\n+---+");
    }

    public static void two() {
        System.out.println("2. Write code to calculate the following expression with BigDecimal objects: 4.35 * 100 ");
        //after using bigDecimal, 4.35 * 100 should evaluate to 435.0
        BigDecimal x = new BigDecimal("4.35");
        BigDecimal y = new BigDecimal("100");
        BigDecimal z = x.multiply(y);
        System.out.println(z);
    }

    public static void three() {
        System.out.println("3. Evaluate: 3 - 4 + 5");
        //should do 3-4, then the result - 5: equals 4
        System.out.println(3 - 4 + 5);
    }

    public static void four() {
        System.out.println("4. Evaluate: 3 - 4 * 5");
        //should do -4 * 5, then 3 + result: equals -17
        System.out.println(3 - 4 * 5);
    }

    public static void five() {
        System.out.println("5. Evaluate: 2 / 3 * 4");
        //should do 2 / 3, which is .666 repeating, result * 4: equals 8 / 3
        System.out.println(2 / 3 * 4);
    }

    public static void six() {
        System.out.println("6. 2 * 3 / 4");
        //should do 2 * 3, which is 6, result / 4: equals 1
        System.out.println(2 * 3 / 4);
    }

    public static void seven() {
        System.out.println("7. 3 % 5");
        //should do 3 % 5, 5 goes into 3 0 times, so 3 leftover
        System.out.println(3 % 5);
    }

    public static void eight() {
        System.out.println("8. -3 % 5");
        //should do -3 % 5, 5 goes into -3 0 times, so -3 leftover
        System.out.println(-3 % 5);
    }

    public static void nine() {
        System.out.println("9. 5 % 3");
        //should do 5 % 3, 3 goes into 5 1 time, so 2 leftover
        System.out.println(5 % 3);
    }

    public static void ten() {
        System.out.println("10. 5 % -3");
        //should do 5 % -3, -3 goes into 5 2 times, so 2 leftover
        System.out.println(5 % -3);
    }

    public static void eleven() {
        System.out.println("11. 3 % -5");
        //should do 3 % -5, -5 goes into 3 1 times, so 3 leftover
        System.out.println(3 % -5);
    }

    public static void twelve() {
        System.out.println("12. 49 / 17 % 5");
        //should do 49 / 17, rounds to 2, 5 goes into 2 0 times, so 2 leftover
        System.out.println(49 / 17 % 5);
    }

    public static void thirteen() {
        System.out.println("13. 49 / (17 % 5)");
        //should do 17 % 5, 5 goes into 17 3 times, so 2 leftover, 49/2 = 24
        System.out.println(49 / (17 % 5));
    }

    public static void fourteen() {
        System.out.println("14. ('a' + 'b') % 2");
        //should concatenate a + b to ab, % 2 would give 1 since strings = 1
        System.out.println(('a' + 'b') % 2);
    }

    public static void fifteen() {
        System.out.println("15. false || true");
        //contains at least one true, should print true
        System.out.println(false || true);
    }

    public static void sixteen() {
        System.out.println("16. ! true && false");
        //contains a false/ is an and statement, should be false
        System.out.println(!true && false);
    }

    public static void seventeen() {
        System.out.println("17. ! (true && false)");
        //contains a false/ is an and statement, should be false, but the ! changes it to true
        System.out.println(!(true && false));
    }

    public static void eighteen() {
        //n = 3
        int n = 3;
        System.out.println("18. n > ++n");
        //n is 3, the ++ goes before the next n, so 3 is not greater than 4
        System.out.println(n > ++n);
    }

    public static void nineteen() {
        //n = 3
        int n = 3;
        System.out.println("19. ++n – n");
        //n is 3, the ++ goes before the first n, and 4 - 4 = 0
        System.out.println(++n - n);
    }

    public static void twenty() {
        //n = 3
        int n = 3;
        System.out.println("20. n++ == n++");
        //n is 3, the ++ goes after the first n, and 4 does not equal 4, so False
        System.out.println(n++ == n++);
    }

    public static void twentyOne() {
        //n = 3
        int n = 3;
        System.out.println("21. n++ == n++");
        //n is 3, the ++ goes before the first n, and 4 equals 4, so True
        System.out.println(++n == n++);
    }

    public static void twentyTwo() {
        //n = 3
        int n = 3;
        System.out.println("22. n++");
        //the ++ goes after the n, so it prints 3
        System.out.println(n++);
    }

    public static void twentyThree() {
        //n = 3
        int n = 3;
        System.out.println("23. ++n");
        //the ++ goes before the n, so it prints 4
        System.out.println(++n);
    }

    public static void twentyFour() {
        //n = 3
        int n = 3;
        System.out.println("24. (n = n++ - ++n) < 0");
        // n++ - ++n is -2, so n is assigned -2, which is less than 0, so true
        System.out.println((n = n++ - ++n) < 0);
    }

    public static void twentyFive() {
        //n = 3
        int n = 3;
        System.out.println("25. (n = n++ - ++n) < 0");
        // n++ - ++n is -2, so n is assigned -2
        Boolean x = (n++ - ++n) < 0;
        System.out.println(n);
    }

    public static void twentySix() {
        System.out.println("26. \"1\" + (2 + 3)");
        // 2 + 3 = 5, concatenate 1 + 5 to get 15
        System.out.println("1" + (2 + 3));
    }

    public static void twentySeven() {
        System.out.println("27. \"1\" + 2 + 3");
        // concatenate 1 and 2 = 12, concatenate 12 + 3 to get 123
        System.out.println("1" + 2 + 3);
    }

    public static void twentyEight() {
        System.out.println("28. 1 + \"2\" + 3");
        // concatenate 1 and 2 = 12, concatenate 12 + 3 to get 123
        System.out.println(1 + "2" + 3);
    }

    public static void twentyNine() {
        System.out.println("29. 1 + 2 + \"3\"");
        // 1 + 2 = 3, concatenate 3 + 3 to get 33
        System.out.println(1 + 2 + "3");
    }

    public static void thirty() {
        System.out.println("30. \"tomato\".charAt(2) - \"potato\".charAt(5)");
        // charAt(2) gives m, charAt(5) gives o, o is 2 more than m so return -2
        System.out.println("tomato".charAt(2) - "potato".charAt(5));
    }

    public static void thirtyOne() {
        System.out.println("31. \"eggplant\".length()");
        // has 8 characters, return 8
        System.out.println("eggplant".length());
    }

    public static void thirtyTwo() {
        System.out.println("32. \"eggplant\".substring(\"kale\".length())");
        // kale length is 4, eggplant substring 4 gives lant
        System.out.println("eggplant".substring("kale".length()));
    }

    public static void thirtyThree() {
        System.out.println("33. \"kale\".charAt(3)");
        // 3rd char of kale is e, returns e
        System.out.println("eggplant".substring("kale".length()));
    }

    public static void thirtyFour() {
        System.out.println("34. \"eggplant\".substring(\"eggplant\".length()-1)");
        // length - 1 is 7, substring 7 just gives t
        System.out.println("eggplant".substring("kale".length()));
    }

    public static void thirtyFive() {
        System.out.println("35. \"beans\".substring(1, 4)");
        // first character is e (inclusive), 4th is s (exclusive), so returns ean
        System.out.println("beans".substring(1, 4));
    }

    public static void thirtySix() {
        //a is a boolean, n is an int
        System.out.println("36. !a == true can be simplified to  ! a");
        // just put an ! on both sides of the equation, and the !! cancels out
        Boolean a = true;
        System.out.println("If a is true, !a == true and ! a are:");
        System.out.println(!a == true);
        System.out.println(! a);
        a = false;
        System.out.println("If a is false, !a == true and ! a are:");
        System.out.println(!a == true);
        System.out.println(! a);
    }
    public static void thirtySeven() {
        //a is a boolean, n is an int
        System.out.println("37. !a != false can be simplified to  ! a");
        // !a != false is equivalent to !a = true, and !a = true is equivalent to a == false
        Boolean a = true;
        System.out.println("If a is true, !a != false and ! a are:");
        System.out.println(!a != false);
        System.out.println(! a);
        a = false;
        System.out.println("If a is false, !a != false and ! a are:");
        System.out.println(!a != false);
        System.out.println(! a);
    }
    public static void thirtyEight() {
        //a is a boolean, n is an int
        System.out.println("38. true && !a can be simplified to  ! a");
        // the && needs both true and !a to be true. To meet this, a must be false.
        Boolean a = true;
        System.out.println("If a is true, true && !a and ! a are:");
        System.out.println(true && !a);
        System.out.println(! a);
        a = false;
        System.out.println("If a is false, true && !a and ! a are:");
        System.out.println(true && !a);
        System.out.println(! a);
    }
    public static void thirtyNine() {
        //a is a boolean, n is an int
        System.out.println("39. if (n == 3)  a = true ;  else  a = false; can be simplified to  n == 3");
        // a is only true if n is 3, so we can just check if n == 3 without an if-else
        Boolean a = true;
        int n = 3;
        System.out.println("If n == 3, the original expression and n == 3 are:");
        if (n == 3) {
            a = true;
        }  else {
            a = false;
        }
        System.out.println(a);
        System.out.println(n == 3);
        n = 4;
        if (n == 3) {
            a = true;
        }  else {
            a = false;
        }
        System.out.println("If n == 4, the original expression and n == 3 are:");
        System.out.println(a);
        System.out.println(n == 3);
    }
    public static void forty() {
        //a is a boolean, n is an int
        System.out.println("40. if (n != 3)  a = false;  else  a = true; can be simplified to  n == 3");
        // a is only false if n is not 3, so we can just check if n == 3 without an if-else
        Boolean a = true;
        int n = 3;
        System.out.println("If n == 3, the original expression and n == 3 are:");
        if (n == 3) {
            a = true;
        }  else {
            a = false;
        }
        System.out.println(a);
        System.out.println(n == 3);
        n = 4;
        if (n == 3) {
            a = true;
        }  else {
            a = false;
        }
        System.out.println("If n == 4, the original expression and n == 3 are:");
        System.out.println(a);
        System.out.println(n == 3);
    }
    public static void fortyOne() {
        //a is a boolean, n is an int
        System.out.println("41. a = false; if (n > 3) if (n < 5) a = true; can be simplified to n == 4");
        // n has to be between 3 and 5 (exclusive) to meet both if statements, a should only be true when n == 4
        Boolean a = true;
        int n = 3;
        System.out.println("If n == 3, the original expression and n == 4 are:");
        a = false;
        if (n > 3) {
            if (n < 5) {
                a = true;
            }
        }
        System.out.println(a);
        System.out.println(n == 4);
        n = 4;
        a = false;
        if (n > 3) {
            if (n < 5) {
                a = true;
            }
        }
        System.out.println("If n == 4, the original expression and n == 4 are:");
        System.out.println(a);
        System.out.println(n == 4);
        n = 5;
        a = false;
        if (n > 3) {
            if (n < 5) {
                a = true;
            }
        }
        System.out.println("If n == 5, the original expression and n == 4 are:");
        System.out.println(a);
        System.out.println(n == 4);
    }
    public static void fortyTwo() {
        //a is a boolean, n is an int
        System.out.println("42. if (n < 0) a = true; else a = (n > 1); can be simplified to n != 0 && n != 1");
        //any negative number is true with the if statement, anything greater than 1 is true with the else statement. This leaves 0 and 1 as false.
        Boolean a = true;
        int n = -1;
        if (n < 0) {
            a = true;
        } else {
            a = (n > 1);
            }
        System.out.println("If n == -1, the original expression and n != 0 && n != 1 are:");
        System.out.println(a);
        System.out.println(n != 0 && n != 1);
        n = 0;
        if (n < 0) {
            a = true;
        } else {
            a = (n > 1);
        }
        System.out.println("If n == 0, the original expression and n != 0 && n != 1 are:");
        System.out.println(a);
        System.out.println(n != 0 && n != 1);
        n = 1;
        if (n < 0) {
            a = true;
        } else {
            a = (n > 1);
        }
        System.out.println("If n == 1, the original expression and n != 0 && n != 1 are:");
        System.out.println(a);
        System.out.println(n != 0 && n != 1);
        n = 2;
        if (n < 0) {
            a = true;
        } else {
            a = (n > 1);
        }
        System.out.println("If n == 2, the original expression and n != 0 && n != 1 are:");
        System.out.println(a);
        System.out.println(n != 0 && n != 1);
    }
    public static void fortyThree() {
        //a is a boolean, n is an int
        System.out.println("43. n < 5 || n > 3 can be simplified to true");
        //Any number will satisfy at least one of the conditions. For the critical numbers, 3 < 5, 4 < 5, and 5 > 3. It will always evaluate to true
        Boolean a = true;
        int n = 2;
        System.out.println("If n == 2, the original expression and true are:");
        System.out.println(n < 5 || n > 3);
        System.out.println(true);
        n = 3;
        System.out.println("If n == 3, the original expression and true are:");
        System.out.println(n < 5 || n > 3);
        System.out.println(true);
        n = 5;
        System.out.println("If n == 5, the original expression and true are:");
        System.out.println(n < 5 || n > 3);
        System.out.println(true);
        n = 10;
        System.out.println("If n == 10, the original expression and true are:");
        System.out.println(n < 5 || n > 3);
        System.out.println(true);
    }
    public static void fortyFour() {
        //a is a boolean, n is an int
        System.out.println("44. n < 3 && n > 5 can be simplified to false");
        //No number will satisfy both of the conditions. For the critical numbers, 3 !> 5, 5 !> 5. It will always evaluate to false
        Boolean a = true;
        int n = 2;
        System.out.println("If n == 2, the original expression and false are:");
        System.out.println(n < 3 && n > 5);
        System.out.println(false);
        n = 3;
        System.out.println("If n == 3, the original expression and false are:");
        System.out.println(n < 3 && n > 5);
        System.out.println(false);
        n = 5;
        System.out.println("If n == 5, the original expression and false are:");
        System.out.println(n < 3 && n > 5);
        System.out.println(false);
        n = 10;
        System.out.println("If n == 10, the original expression and false are:");
        System.out.println(n < 3 && n > 5);
        System.out.println(false);
    }
    public static void fortyFive() {
        System.out.println("45. Any while loop can be expressed as a for loop. Infinite loops just use a condition that is always true,");
        System.out.println(" and finite loops need the step/increment moved into the for(), rather than in the loop itself.");

    }
    public static void fortySix() {
        System.out.println("46. Any while loop can be expressed as a do-while loop.");
        System.out.println("Because the condition is checked at the end, not the beginning, of a do-while loop, you have to change the condition accordingly.");
    }
    public static void fortySeven() {
        System.out.println("47. int m = 18, n = 10; if (m > 10) { if (m > 5) n = 1; } else n = 2;");
        // n should evaluate to 1, because m > 10 and m > 5
        int m = 18, n = 10; if (m > 10) { if (m > 5) n = 1; } else n = 2;
        System.out.println(n);
    }
    public static void fortyEight() {
        System.out.println("48. int m = 18, n = 10; if (m > 10)   if (m > 5) n = 1;   else n = 2;");
        // n should evaluate to 1, because m > 10 and m > 5
        int m = 18, n = 10; if (m > 10)   if (m > 5) n = 1;   else n = 2;
        System.out.println(n);
    }
    public static void fortyNine() {
        System.out.println("49. int m = 18, n = 10; if (m < 10) { if (m > 5) n = 1; } else n = 2;");
        // n should evaluate to 2, because m > 10, so it goes to the else statement
        int m = 18, n = 10; if (m < 10) { if (m > 5) n = 1; } else n = 2;
        System.out.println(n);
    }
    public static void fifty() {
        System.out.println("50. int m = 18, n = 10; if (m < 10)   if (m > 5) n = 1;   else n = 2;");
        // n should evaluate to 10, because m > 10, and the second if statement is not nested
        int m = 18, n = 10; if (m < 10)   if (m > 5) n = 1;   else n = 2;
        System.out.println(n);
    }
    public static void fiftyOne() {
        System.out.println("51. The interactions panel is possibly using a different operation for ==,");
        System.out.println("and the two strings could have different memory locations");
    }
    public static void fiftyTwo() {
        System.out.println("52. A student with a GPA of at least 1.5, but less than 2, is on probation. With less than 1.5, the student is failing.");
        double GPA = 1.5;
        if (GPA > 1.5) if (GPA < 2) { System.out.println("probation"); } else { System.out.println("failing/not failing?"); }
        System.out.println("The else is dangling, because it is unclear whether else should be executed when the first or second if statement is false.");
    }

}
