package bienlai;

public class test {
	public static void main3(String[] args){
        KhachHangVN a = new KhachHangVN(1,"Nguyen Trung Hieu","12-10-2022",219,"ca nhan");
        KhachHangNN b = new KhachHangNN(2,"Lionel Messi","22-10-2022",300,"US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());

        KhachHang kh = (KhachHang) new KhachHangVN(2,"Pham The Bach","20-10-2022",100,"ca nhan");
        System.out.println(kh.thanhTien());

        KhachHangVN khvn = (KhachHangVN)kh;
        System.out.println(khvn.thanhTien());
    }
}
