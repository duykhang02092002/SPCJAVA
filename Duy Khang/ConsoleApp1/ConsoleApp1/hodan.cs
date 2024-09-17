
using System;
using System.Collections.Generic;

public class HoDan
{
    public int SoThanhVien { get; set; }
    public string SoNha { get; set; }
    public List<Nguoi> ThanhVien { get; set; }

    public HoDan(int soThanhVien, string soNha)
    {
        SoThanhVien = soThanhVien;
        SoNha = soNha;
        ThanhVien = new List<Nguoi>();
    }

    public void ThemNguoi(Nguoi nguoi)
    {
        ThanhVien.Add(nguoi);
    }

    public void HienThiThongTin()
    {
        Console.WriteLine("Thong tin ho dan so: "+SoNha);
        foreach (var nguoi in ThanhVien)
        {
            nguoi.HienThiThongTin();
        }
    }
}
