package session09.lesson4;

public class Main {
    public static void main(String[] args) {

        // 1. Khai báo theo kiểu cha, khởi tạo bằng object lớp con
        Animal animal = new Dog();

        /*
         * animal có:
         * - Declared Type (kiểu khai báo): Animal
         * - Actual Type (kiểu thực tế): Dog
         */

        // 2. Gọi phương thức sound()
        animal.sound();

        /*
         * Vì sao dòng này in ra: "Dog barks" ?
         *
         * - Compile-time:
         *   Trình biên dịch kiểm tra kiểu Animal
         *   Animal có phương thức sound() -> hợp lệ
         *
         * - Runtime:
         *   Object thực tế được tạo là Dog
         *   Dog đã override sound()
         *   -> JVM gọi Dog.sound()
         *
         * Đây chính là đa hình runtime
         */

        // 3. Gọi phương thức eat()
        animal.eat();

        /*
         * Vì sao dòng này in ra: "Animal is eating" ?
         *
         * - Dog không override eat()
         * - JVM không tìm thấy eat() trong Dog
         * - Quay lên lớp cha Animal
         * -> gọi Animal.eat()
         */

        // 4. Gọi phương thức riêng của Dog (dòng này nếu mở sẽ lỗi)
        // animal.run();

        /*
         * Vì sao không gọi được run() ?
         *
         * - Declared Type của animal là Animal
         * - Animal không có phương thức run()
         * - Lỗi xảy ra ở compile-time
         *
         * Trình biên dịch không quan tâm object thực tế là Dog
         */

        // 5. Sử dụng instanceof để kiểm tra kiểu thực tế
        if (animal instanceof Dog) {

            /*
             * instanceof kiểm tra object animal
             * có được tạo từ lớp Dog hay không
             * Kiểm tra này xảy ra ở runtime
             */

            Dog dog = (Dog) animal;

            /*
             * Ép kiểu (downcasting):
             * - animal thực tế là Dog
             * - Ép kiểu an toàn
             */

            dog.run();

            /*
             * Bây giờ biến dog có kiểu Dog
             * -> gọi được phương thức riêng run()
             */
        }

        // 6. Ví dụ ép kiểu sai (để hiểu lỗi runtime)
        Animal animal2 = new Animal();

        /*
         * animal2:
         * - Declared Type: Animal
         * - Actual Type: Animal
         */

        // Dog dog2 = (Dog) animal2;

        /*
         * Dòng trên:
         * - Compile-time: không lỗi (Animal và Dog có quan hệ kế thừa)
         * - Runtime: lỗi ClassCastException
         *
         * Vì object thực tế KHÔNG phải Dog
         */
    }
}
