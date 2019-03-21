package Exam2_StructMode.works.work_1_AdapterPattern;

public class ZipCodeObjectAdapter implements C{

    private U u;

    public ZipCodeObjectAdapter(U u) {
        this.u = u;
    }

    @Override
    public String zipCode(int code) {
        String codeStr = String.valueOf(code);
        if (codeStr.length() == 5) {
            return u.findZipCode(codeStr);
        } else if (codeStr.length() == 6) {
            if (code == 123456) { // 假设中国广州邮编为1
                return "广州";
            }
        }
        return "该邮编不存在！";
    }
}
