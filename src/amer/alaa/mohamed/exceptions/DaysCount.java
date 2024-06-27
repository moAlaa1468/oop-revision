package amer.alaa.mohamed.exceptions;

import javax.security.auth.login.AccountLockedException;
import java.io.File;
import java.io.FileNotFoundException;

public class DaysCount {

    /*
     * RunTime Exception could be written in the methods body but it could not be
     * reporting in the header of the function ==> [العيلة اللي معاها رخصة]
     * But other exception must be reported in the header of functions
     * Exception is the parent of runTimeException ==> See documentation
     *
     * You have Error ==> [ملهاش حل عند المبرمج زي الرامات لما تخلص هتعمل اي مافيش]
     *
     *[و لكن ال exception العادي بيكون ليه حل ممكن انك نعالجه زي المسار تبع الملف مش موجود]
     *
     *   jfs[لما تخلي الدالة ترمي استثناء معين روح اعمله  تعريف في رأس الدالة ]f
     *
     * [بمجرد ما الدالة تقابل اول رمية مش هتكمل وهتقف ]
     *
     * */

    //                               This is a child of RunTimeException[not required reporting ] , You have to report the secon
    int getMonthDaysCount(int month, int year) throws IndexOutOfBoundsException, AccountLockedException {
        if (year < 1950) {
            throw new AccountLockedException();
        }
        int x = 10;
        int y = 0;
        if (y != 0) {
            int result = x / y;
        } else {
//            throw new ArithmeticException();
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 4 == 0) {
                    return 30;
                } else {
                    return 28;
                }

            default:
                throw new IndexOutOfBoundsException();
        }
    }


    public void memoryOut(int number) {
        if (number < 10) {
            System.out.println(" You are not able to solve  the problem so you need to throw Error() ");
            throw new Error();
        }
    }


    //Here you could report your exception or not
    public int divisionByZero(int x, int y) throws ArithmeticException {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException();
        }
    }

    // so here you need to [have to | Must ] report the Exception in the header of your function
    public void fileNotFount() throws FileNotFoundException {
        throw new FileNotFoundException();
    }


    //This is your custom exception you need to put all exception that you need in it
    public void indexOutOfBound() throws AlaaException {
    }

    public static void checkAge(int age) throws AlaaException {
        if (age < 18 && age> 15) {
            throw new AlaaException("Your age must be greater than 18");
        }else if (age<15){
            throw new AlaaException("Your age must be greater than 15");
        }else
        System.out.println("Age is valid ");
    }

//    This is the multiple Catch

    public static void main(String[] args)   {
        try{
           int x=10;
           int result=x/0;
            System.out.println(result);

            checkAge(0);

        }catch (AlaaException | NullPointerException | IndexOutOfBoundsException ex  ) {    //لافضل انك تروح تعمل من الصغير للكبير
            System.err.println(ex.getMessage());
        }catch ( RuntimeException  ex){   // اول catch مناسبة هينفذها وهيخرج مش هيكمل باقي الكود الموجود عندنا في Try
            System.err.println(" You have divided vby zero "+ ex.getMessage());
        }catch (Throwable throwable){   // اي unchecked Exception زي RunTimeException و ال Throwable ينفع انك تعمل بيهم Catch في اي حتة
            System.out.println(throwable.getMessage());
            // You could use RunTimeException and Throwable at any time And you don't need to to report them in the function header
            //unCheck Exceptions
        }finally {
            System.out.println("This will be implements even if try or catch is executed");
            System.out.println("Call ended even if the other person responded or not ");
        }
    }


}