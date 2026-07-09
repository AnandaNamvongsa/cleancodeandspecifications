package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    /**
     * ค้นหาตำแหน่ง (index) แรกที่พบค่า key ในอาร์เรย์ arr
     *
     * @param arr ค้นหาอาเรยที่ต้องไม่เป็นnull
     * @param key ค่าที่ต้องการหาในอาเรย์
     * @return ตำแหน่ง index แรกที่พบค่า key (เริ่มนับจาก 0)
     *         หรือ -1 ถ้าไม่พบค่า key ในอาร์เรย์
     * @throws IllegalArgumentException ถ้า arr เป็น null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    /**
     * คำนวณพื้นที่ของวงกลมจากรัศมีที่กำหนด
     *
     * @param radius รัศมีของวงกลม ต้องมีค่ามากกว่าหรือเท่ากับ 0
     * @return พื้นที่ของวงกลม คำนวณจากสูตร PI คูณรัศมียกกำลังสอง
     * @throws IllegalArgumentException ถ้า radius มีค่าน้อยกว่า 0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    /**
     * แปลงสตริงให้อยู่ในรูปแบบมาตรฐาน โดยตัดช่องว่างหน้า-หลังออก
     * และแปลงตัวอักษรทั้งหมดเป็นตัวพิมพ์เล็ก
     *
     * @param s สตริงที่ต้องการแปลง สามารถเป็น null ได้
     * @return สตริงที่ตัดช่องว่างหน้า-หลังแล้วและเป็นตัวพิมพ์เล็กทั้งหมด
     *         หรือคืนค่าสตริงว่าง ("") ถ้า s เป็น null
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}