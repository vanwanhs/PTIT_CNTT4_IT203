//package demo.btth;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class PatientManager {
//    // Thuộc tính: Danh sách bệnh nhân
//    private final List<Patient> patients;
//
//    // Constructor
//    public PatientManager() {
//        this.patients = new ArrayList<>();
//    }
//
//    public PatientManager(List<Patient> initialPatients) {
//        this.patients = (initialPatients != null) ? new ArrayList<>(initialPatients) : new ArrayList<>();
//    }
//
//    // --------- Các phương thức yêu cầu ---------
//
//    /**
//     * Thêm bệnh nhân mới.
//     * @param patient Bệnh nhân cần thêm
//     * @return true nếu thêm thành công; false nếu ID đã tồn tại hoặc patient null
//     */
//    public boolean addPatient(Patient patient) {
//        if (patient == null) return false;
//        if (existsById(patient.getId())) {
//            // Tránh trùng ID
//            return false;
//        }
//        return patients.add(patient);
//    }
//
//    /**
//     * Xóa bệnh nhân theo ID.
//     * @param patientId ID bệnh nhân
//     * @return true nếu xóa được; false nếu không tìm thấy
//     */
//    public boolean removePatient(int patientId) {
//        int idx = indexOfId(patientId);
//        if (idx >= 0) {
//            patients.remove(idx);
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * Cập nhật thông tin bệnh nhân theo ID.
//     * @param patientId ID bệnh nhân cần cập nhật
//     * @param updatedPatient Đối tượng chứa thông tin mới (sẽ thay thế hoàn toàn ngoại trừ ID)
//     * @return true nếu cập nhật thành công; false nếu không tìm thấy hoặc dữ liệu không hợp lệ
//     */
//    public boolean updatePatient(int patientId, Patient updatedPatient) {
//        if (updatedPatient == null) return false;
//
//        int idx = indexOfId(patientId);
//        if (idx < 0) return false;
//
//        // Giữ nguyên ID cũ, cập nhật các trường khác
//        Patient current = patients.get(idx);
//        try {
//            current.setName(updatedPatient.getName());
//            current.setAge(updatedPatient.getAge());
//            current.setGender(updatedPatient.getGender());
//            current.setPathology(updatedPatient.getPathology());
//        } catch (IllegalArgumentException ex) {
//            // Nếu updatedPatient chứa giá trị không hợp lệ theo validation trong Patient
//            return false;
//        }
//        return true;
//    }
//
//    /**
//     * Tìm kiếm bệnh nhân theo tên (không phân biệt hoa/thường, có thể khớp một phần).
//     * @param name tên cần tìm (có thể là một phần)
//     * @return danh sách kết quả khớp
//     */
//    public List<Patient> searchPatientByName(String name) {
//        List<Patient> result = new ArrayList<>();
//        if (name == null || name.trim().isEmpty()) return result;
//
//        String keyword = name.trim().toLowerCase();
//        for (Patient p : patients) {
//            if (p.getName() != null && p.getName().toLowerCase().contains(keyword)) {
//                result.add(p);
//            }
//        }
//        return result;
//    }
//
//    /**
//     * Sắp xếp bệnh nhân theo tuổi (tăng dần).
//     */
//    public void sortPatientsByAge() {
//        patients.sort(Comparator.comparingInt(Patient::getAge)
//                .thenComparing(Patient::getName, String.CASE_INSENSITIVE_ORDER));
//    }
//
//    /**
//     * Sắp xếp bệnh nhân theo tên (A→Z, không phân biệt hoa/thường).
//     */
//    public void sortPatientsByName() {
//        patients.sort(Comparator.comparing(
//                Patient::getName,
//                String.CASE_INSENSITIVE_ORDER
//        ).thenComparingInt(Patient::getId));
//    }
//
//    /**
//     * Hiển thị danh sách bệnh nhân (in ra console).
//     */
//    public void displayPatients() {
//        if (patients.isEmpty()) {
//            System.out.println("Danh sách bệnh nhân đang trống.");
//            return;
//        }
//        for (Patient p : patients) {
//            System.out.println(p);
//        }
//    }
//
//    // --------- Tiện ích bổ sung (optional) ---------
//
//    /**
//     * Lấy bản sao bất biến của danh sách (để đọc).
//     */
//    public List<Patient> getPatientsView() {
//        return Collections.unmodifiableList(patients);
//    }
//
//    /**
//     * Tìm Patient theo ID (trả về null nếu không có).
//     */
//    public Patient getById(int patientId) {
//        int idx = indexOfId(patientId);
//        return (idx >= 0) ? patients.get(idx) : null;
//    }
//
//    /**
//     * Kiểm tra tồn tại theo ID.
//     */
//    public boolean existsById(int patientId) {
//        return indexOfId(patientId) >= 0;
//    }
//
//    /**
//     * Lấy vị trí theo ID trong danh sách (hoặc -1 nếu không có).
//     */
//    private int indexOfId(int patientId) {
//        for (int i = 0; i < patients.size(); i++) {
//            if (patients.get(i).getId() == patientId) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
