using System;

public class Nguoi
{
    public string HoTen { get; set; }
    public DateTime NgaySinh { get; set; }
    public string NgheNghiep { get; set; }

    public Nguoi(string hoTen, DateTime ngaySinh, string ngheNghiep)
    {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        NgheNghiep = ngheNghiep;
    }

    public void HienThiThongTin()
    {
        Console.WriteLine("Ho ten: "+HoTen);
        Console.WriteLine("Ngay sinh: "+NgaySinh);
        Console.WriteLine("Nghe nghiep: "+NgheNghiep);
    }
}
