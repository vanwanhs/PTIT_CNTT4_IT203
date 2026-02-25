package session03.mang_1_chieu;

import java.util.Scanner;

public class BaiTapTongHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 100;              // kích thước tối đa
        int[] ids = new int[MAX];         // mã sách
        String[] titles = new String[MAX];// tên sách
        int[] quantities = new int[MAX]; // số lượng

        int size = 0; // số sách hiện có
        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Cập nhật số lượng");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Sắp xếp theo số lượng giảm dần");
            System.out.println("7. Thoát");
            System.out.println("==========================");
            System.out.print("Mời bạn chọn: ");

            choice = sc.nextInt();
            sc.nextLine(); // xóa bộ nhớ đệm

            switch (choice) {

                // 1. Xem danh sách
                case 1:
                    if (size == 0) {
                        System.out.println("Danh sách rỗng!");
                        break;
                    }
                    System.out.println("Mã\tTên sách\tSố lượng");
                    for (int i = 0; i < size; i++) {
                        System.out.println(ids[i] + "\t" + titles[i] + "\t\t" + quantities[i]);
                    }
                    break;

                // 2. Thêm sách mới
                case 2:
                    if (size == MAX) {
                        System.out.println("Mảng đã đầy, không thể thêm!");
                        break;
                    }

                    System.out.print("Nhập mã sách: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean existed = false;
                    for (int i = 0; i < size; i++) {
                        if (id == ids[i]) {
                            existed = true;
                            break;
                        }
                    }

                    if (existed) {
                        System.out.println("Mã sách " + id + " đã tồn tại!");
                    } else {
                        System.out.print("Nhập tên sách: ");
                        titles[size] = sc.nextLine();

                        System.out.print("Nhập số lượng: ");
                        quantities[size] = sc.nextInt();

                        ids[size] = id;
                        size++;

                        System.out.println("Thêm sách thành công!");
                    }
                    break;

                // 3. Cập nhật số lượng
                case 3:
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    int updateId = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (ids[i] == updateId) {
                            System.out.print("Nhập số lượng mới: ");
                            quantities[i] = sc.nextInt();
                            found = true;
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy mã sách!");
                    }
                    break;

                // 4. Xóa sách
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    int deleteId = sc.nextInt();

                    int pos = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i] == deleteId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("Không tìm thấy sách!");
                    } else {
                        for (int i = pos; i < size - 1; i++) {
                            ids[i] = ids[i + 1];
                            titles[i] = titles[i + 1];
                            quantities[i] = quantities[i + 1];
                        }
                        size--;
                        System.out.println("Xóa sách thành công!");
                    }
                    break;

                // 5. Tìm kiếm gần đúng theo tên
                case 5:
                    System.out.print("Nhập từ khóa: ");
                    String key = sc.nextLine().toLowerCase();

                    boolean hasResult = false;
                    for (int i = 0; i < size; i++) {
                        if (titles[i].toLowerCase().contains(key)) {
                            System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
                            hasResult = true;
                        }
                    }
                    if (!hasResult) {
                        System.out.println("Không tìm thấy sách phù hợp!");
                    }
                    break;

                // 6. Sắp xếp theo số lượng giảm dần
                case 6:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (quantities[i] < quantities[j]) {
                                int tmpQ = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tmpQ;

                                int tmpId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tmpId;

                                String tmpT = titles[i];
                                titles[i] = titles[j];
                                titles[j] = tmpT;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo số lượng giảm dần!");
                    break;

                case 7:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 7);
    }
}
