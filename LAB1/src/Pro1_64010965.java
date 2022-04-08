//64010965 อนาวิล ธรรมเจริญทิพย์
public class Pro1_64010965 {
    public static void main(String[] args) {

        //แปลงโจทย์ให้เป็นตัวแปรเก็บไว้ในint
        int people = 312032486, birth = 7, death = 13, immigrant = 45, timeAtSecond = 31536000;

        //ตั้งตัวแปรสำหรับเก็บผลลัพธ์ ทั้ง 5 ปี
        int totalFirstYear, totalSecondYear, totalThirdYear, totalForthYear, totalFifthYear;

        //คำนวณผลลัพธ์จำนวนคนทั้งหมดทั้ง 5 ปี
        totalFirstYear = people+(((timeAtSecond/birth)+(timeAtSecond/immigrant)-(timeAtSecond/death))*1);
        totalSecondYear = people+(((timeAtSecond/birth)+(timeAtSecond/immigrant)-(timeAtSecond/death))*2);
        totalThirdYear = people+(((timeAtSecond/birth)+(timeAtSecond/immigrant)-(timeAtSecond/death))*3);
        totalForthYear = people+(((timeAtSecond/birth)+(timeAtSecond/immigrant)-(timeAtSecond/death))*4);
        totalFifthYear = people+(((timeAtSecond/birth)+(timeAtSecond/immigrant)-(timeAtSecond/death))*5);

        //แสดงผลลัพธ์จำนวนคนทั้งหมดทั้ง 5 ปี ออกทาง terminal
        System.out.println("the population for each of the first years are " + totalFirstYear + " persons");
        System.out.println("the population for each of the second years are " + totalSecondYear + " persons");
        System.out.println("the population for each of the third years are " + totalThirdYear + " persons");
        System.out.println("the population for each of the forth years are " + totalForthYear + " persons");
        System.out.println("the population for each of the next five years are " + totalFifthYear + " persons");
    }
}
