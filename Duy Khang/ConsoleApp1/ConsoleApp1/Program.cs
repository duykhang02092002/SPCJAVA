class Program
{
    static void Main(string[] args)
    {
        KhuPho khuPho = new KhuPho();

        khuPho.NhapThongTin();

        Console.WriteLine();
        khuPho.HienThiThongTin();

        int tuoiMungTho = 80;
        khuPho.HienThiMungTho(tuoiMungTho);
    }
}
