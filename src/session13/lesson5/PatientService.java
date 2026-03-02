//package lesson5;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class PatientService {
//
//    private List<Patient> patients = new ArrayList<>();
//
//    // Kiểm tra ID trùng
//    public boolean isIdExists(String id) {
//        for (Patient p : patients) {
//            if (p.getId().equals(id)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Thêm bệnh nhân
//    public boolean addPatient(Patient p) {
//        if (isIdExists(p.getId())) {
//            return false;
//        }
//        patients.add(p);
//        return true;
//    }
//
//    // Cập nhật chẩn đoán
//    public boolean updateDiagnosis(String id, String newDiagnosis) {
//        for (Patient p : patients) {
//            if (p.getId().equals(id)) {
//                p.setDiagnosis(newDiagnosis);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Xuất viện
//    public boolean removePatient(String id) {
//        for (int i = 0; i < patients.size(); i++) {
//            if (patients.get(i).getId().equals(id)) {
//                patients.remove(i);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Sắp xếp theo tuổi giảm dần, tên A-Z
//    public void sortPatients() {
//        patients.sort(
//                Comparator.comparingInt(Patient::getAge).reversed()
//                        .thenComparing(Patient::getFullName)
//        );
//    }
//
//    // Lấy danh sách
//    public List<Patient> getPatients() {
//        return patients;
//    }
//}