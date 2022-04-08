//64010965 อนาวิล ธรรมเจริญทิพย์

//นำMathเข้ามาร่วมทำงานกับคอมไพลเลอร์
import java.lang.Math;
//นำScannerเข้ามาร่วมทำงานกับคอมไพลเลอร์
import java.util.Scanner;

public class Pro4_64010965 {
    //สร้าง obj เพื่อใช้กับ class Scanner ชื่อ scanner โดยส่ง System.in เข้าไปทำงานในคลาส Scanner
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //สร้างตัวแปร BMI ไว้เก็บผลลัพธ์ที่โปรแกรมคำนวณได้
        double bmi;
  
        //แสดงข้อความเพื่อให้ผู้ใช้ป้อนน้ำหนักเข้ามา(pound)
        System.out.println("Enter weight in pounds:");

        //สร้างตัวแปรขึ้นมาเก็บค่าที่รับจากผู้ใช้เข้าไป ชื่อ weight
        double weight = scanner.nextDouble();

        //แสดงข้อความเพื่อให้ผู้ใช้ป้อนส่วนสูงเข้ามา(inch)
        System.out.println("Enter height in inches:");

        //สร้างตัวแปรขึ้นมาเก็บค่าที่รับจากผู้ใช้เข้าไป ชื่อ height
        double height = scanner.nextDouble();

         //สร้างอัลกอริทึมสำหรับคำนวณค่าBMI
        bmi = (weight*0.45359237) / Math.pow(height*0.0254, 2);

        //แสดงผลลัพธ์ที่ได้ออกทางหน้าจอ
        System.out.println("BMI is " + bmi);
    }
}
