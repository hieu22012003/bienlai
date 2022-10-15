package bienlai;

public class KhachHangNN extends KhachHang{
    public String quocTich;

    public KhachHangNN() {
    }

    public KhachHangNN(int code, String fullName, String date, int quantity, String quocTich) {
        super(code, fullName, date, quantity);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
