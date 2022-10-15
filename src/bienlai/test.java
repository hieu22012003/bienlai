package bienlai;

public class test {
	public static void main3(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Trung Hieu","2022-10-15",219,"Cá nhân");
        KhachHangNN b = new KhachHangNN(2,"Donal Trump","2022-09-21",156,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());

        KhachHang kh = (KhachHang) new KhachHangVN(2,"Nguyen Van B","2022-09-22",100,"Cá nhân");
        System.out.println(kh.thanhTien());

        KhachHangVN khvn = (KhachHangVN)kh;
        System.out.println(khvn.thanhTien());
    }
}
