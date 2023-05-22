package QuanLyGiaoDichNhaDat;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha, diaChi;
    private int chon;
public GiaoDichNha(){
    super();
}
public GiaoDichNha(String loaiNha, String diaChi){
    this.loaiNha = loaiNha;
    this.diaChi = diaChi;
}
public String getLoaiNha(){
    return loaiNha;
}
public void setLoaiNha(String loaiNha){
    this.loaiNha = loaiNha;
}
public String getDiaChi(){
    return diaChi;

}
public void setDiaChi(String diaChi){
    this.diaChi = diaChi;
}
public void nhap(){
    super.nhap();
    System.out.print("Nhap dia chi : ");
    diaChi = scanner.nextLine();
    System.out.print("Nhap loai nha (0: cao cap, 1: loai thuong) : ");
    chon = scanner.nextInt();
    switch (chon){
        case 0 :
        loaiNha = "Cao cap";
        break;
        case 1 :
        loaiNha = "Loai thuong";
        break;
        default:
        System.out.println("Chon so khong hop le. ");
        break;
    }
}
@Override
public String toString(){
    return super.toString() + ",Loai nha: " + this.loaiNha + ",Dia chi: " + this.diaChi;
}
}
