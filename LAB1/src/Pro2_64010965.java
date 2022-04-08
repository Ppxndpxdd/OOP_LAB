//64010965 อนาวิล ธรรมเจริญทิพย์
public class Pro2_64010965 {
    public static void main(String[] args) {

        //แปลงโจทย์เป็นตัวแปรและเก็บค่าไว้
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;

        //คำนวณหาค่าของ x และ y ตามสูตรคลาเมอร์
        x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        y = ((a*f) - (e*c)) / ((a*d) - (b*c));

        //แสดงค่าของ x และ y ออกทางหน้าจอ
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
