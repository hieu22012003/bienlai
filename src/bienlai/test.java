package bienlai;

public class test {
	public static void main3(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Trung Hieu","2022-10-15",219,"ca nhan");
        KhachHangNN b = new KhachHangNN(2,"Lionel Messi","2022-09-21",156,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());

        KhachHang kh = (KhachHang) new KhachHangVN(2,"Pham The Bach","2022-09-22",100,"ca nhan");
        System.out.println(kh.thanhTien());

        KhachHangVN khvn = (KhachHangVN)kh;
        System.out.println(khvn.thanhTien());
    }
}
