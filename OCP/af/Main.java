
class Main {
 public static void main(String[] args) {
    StandardCinema standardCinema = new StandardCinema(100.0);
    Double adminFee = standardCinema.calculateAdminFee();
    System.out.println(adminFee);
    MahasiswaCinema mahasiswaCinema = new MahasiswaCinema(100.0);
    Double adminFee1 = mahasiswaCinema.calculateAdminFee();
    System.out.println(adminFee1);
    DeluxeCinema deluxeCinema = new DeluxeCinema(100.0);
    Double adminFee3 = deluxeCinema.calculateAdminFee();
    System.out.println(adminFee3);
    PremiumCinema premiumCinema = new PremiumCinema(100.0);
    Double adminFee4 = premiumCinema.calculateAdminFee();
    System.out.println(adminFee4);
    }
}