package _2_Structural_Pattern.Exam2.work_1_AdapterPattern;

public class ZipCodeClassAdapter extends U implements C{

    @Override
    public String zipCode(int code) {
        String codeStr = String.valueOf(code);
        if (codeStr.length() == 5) {
            return super.findZipCode(codeStr);
        } else if (codeStr.length() == 6) {
            if (code == 123456) { // 假设中国广州邮编为1
                return "广州";
            }
        }
        return "该邮编不存在！";
    }
}
