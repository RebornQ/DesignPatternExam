package _2_Structural_Pattern.Exam3.work_1_CompositePattern;

public class Client {
    public static void main(String[] args) {
        Organization headquarters = new Place("北京总部");
        Organization hAcaOffice = new Office("教务办公室");
        Organization hAdminOffice = new Office("行政办公室");
        Organization hHunanSchool = new Place("湖南分校");
        headquarters.add(hAcaOffice);
        headquarters.add(hAdminOffice);
        headquarters.add(hHunanSchool);

        Organization hunanAcaOffice = new Office("教务办公室");
        Organization hunanAdminOffice = new Office("行政办公室");
        Organization hunanChangshaSchool = new Place("长沙教学点");
        Organization hunanXiangtanSchool = new Place("湘潭教学点");
        hHunanSchool.add(hunanAcaOffice);
        hHunanSchool.add(hunanAdminOffice);
        hHunanSchool.add(hunanChangshaSchool);
        hHunanSchool.add(hunanXiangtanSchool);

        Organization xiangtanAcaOffice = new Office("教务办公室");
        Organization xiangtanAdminOffice = new Office("行政办公室");
        hunanXiangtanSchool.add(xiangtanAcaOffice);
        hunanXiangtanSchool.add(xiangtanAdminOffice);

        Organization changshaAcaOffice = new Office("教务办公室");
        Organization changshaAdminOffice = new Office("行政办公室");
        hunanChangshaSchool.add(changshaAcaOffice);
        hunanChangshaSchool.add(changshaAdminOffice);

        headquarters.send("lalalala");

    }
}
