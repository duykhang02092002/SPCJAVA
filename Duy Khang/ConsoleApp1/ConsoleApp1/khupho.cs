using System;
using System.Collections.Generic;

public class KhuPho
{
    public List<HoDan> DanhSachHoDan { get; set; }

    public KhuPho()
    {
        DanhSachHoDan = new List<HoDan>();
    }

    public void NhapThongTin()
    {
        Console.Write("Nhap so ho dan trong khu pho: ");
        int n = int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine($"Nhap thong tin cho ho dan thu {i + 1}:");
            Console.Write("Nhap so thanh vien trong ho thu: ");
            int soThanhVien = int.Parse(Console.ReadLine());
            Console.Write("Nhap so nha cua ho dan: ");
            string soNha = Console.ReadLine();

            HoDan hoDan = new HoDan(soThanhVien, soNha);

            for (int j = 0; j < soThanhVien; i++)
            {
                Console.WriteLine($"Nhap thong tin cho thanh vien thu {i + 1}:");
                Console.Write("Ho ten: ");
                string hoTen = Console.ReadLine();
                Console.Write("Ngay sinh (dd/MM/yyyy): ");
                DateTime ngaySinh = DateTime.Parse(Console.ReadLine());
                Console.Write("Nghe nghiep: ");
                string ngheNghiep = Console.ReadLine();

                Nguoi nguoi = new Nguoi(hoTen, ngaySinh, ngheNghiep);
                hoDan.ThemNguoi(nguoi);
            }

            DanhSachHoDan.Add(hoDan);
        }
    }

    public void HienThiThongTin()
    {
        Console.WriteLine("Thong tin ve cac ho dan trong khu pho:");
        foreach (var hoDan in DanhSachHoDan)
        {
            hoDan.HienThiThongTin();
        }
    }

    public void HienThiMungTho(int tuoiMungTho)
    {
        Console.WriteLine($"\nCac ho gia đinh có nguoi mung thuong tho ({tuoiMungTho} tuoi):");
        foreach (var hoDan in DanhSachHoDan)
        {
            foreach (var nguoi in hoDan.ThanhVien)
            {
                int tuoi = DateTime.Now.Year - nguoi.NgaySinh.Year;
                if (tuoi >= tuoiMungTho)
                {
                    Console.WriteLine($" - Ho dan so {hoDan.SoNha}: {nguoi.HoTen}, {tuoi} tuoi");
                }
            }
        }
    }
}
