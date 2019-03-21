package Exam2_StructMode.works.work_1_AdapterPattern;

public class U {

    public String findZipCode(String zipCode) {

        if (zipCode.equals("12345")) { // 假设美国洛杉矶邮编为12345
            return "洛杉矶";
        }
        return "该邮编不存在！";
    }
}
