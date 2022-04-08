//64010965 อนาวิล ธรรมเจริญทิพย์

//นำScannerเข้ามาร่วมทำงานกับคอมไพลเลอร์
import java.util.Scanner;

public class Pro3_64010965 {
    //สร้าง obj เพื่อใช้กับ class Scanner ชื่อ scanner โดยส่ง System.in เข้าไปทำงานในคลาส Scanner
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000:");

        //สร้างตัวแปรขึ้นมาเก็บค่าที่รับจากผู้ใช้เข้าไป ชื่อ inputNum
        int inputNum = scanner.nextInt();

        //สร้างเงื่อนไขให้รับได้เฉพาะเลข 0-1000
        if (inputNum >0 && inputNum <= 1000) {

            //สร้างอัลกอริทึมให้ดึงเลขทีละหลักออกมาบวกกัน
            int ans= (inputNum /100)+((inputNum%100)/10)+(inputNum%10);
            
            //แสดงผลลัพธ์ที่ได้ออกทางหน้าจอ
            System.out.println("The sum of the digits is " + ans);
            
        }
        //ถ้ารับเลขที่ไม่ใช่เลข 0-1000 ให้แสดงไปว่า "Your number over one thousand!"
        else 
        {
            System.out.println("Your number over one thousand!");
        }
    }
}
