import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer rio = new Customer();
        rio.setName("Rio Saputra");
        rio.setAddress("Kp. Bulak Kunyit RT.001/RW.002 Desa Muktiwari");
        System.out.println("Pelanggan atas nama " + rio.getName() + " dipersilahkan masuk!");
        System.out.println("Pesanan atas nama " + rio.getName() + " siap dikirimkan ke alamat " + rio.getAddress());

        System.out.println();

        Order gofood = new Order();
        rio.addOrder(gofood);
        gofood.calcSubTotal();
        gofood.calcTax();
        gofood.calcTotal();
        gofood.calcTotalWeight();
        gofood.setDate(LocalDate.now());
        gofood.setStatus("Shipping...");
        System.out.println("Pesanan pada tanggal : " + gofood.getDate());
        System.out.println("Status : " + gofood.getStatus());

        System.out.println();

        OrderDetail detailOrderGoFood = new OrderDetail(gofood);
        detailOrderGoFood.calcSubTotal();
        detailOrderGoFood.calcWeight();
        detailOrderGoFood.calcTax();
        detailOrderGoFood.setQuantity(5);
        detailOrderGoFood.setTaxStatus("Dipotong pajak");
        gofood.addOrderDetail(detailOrderGoFood);
        System.out.println("Jumlah item yang dibeli: " + detailOrderGoFood.getQuantity());
        System.out.println("Status Pajak: " + detailOrderGoFood.getTaxStatus());

        System.out.println();

        Item item = new Item();
        item.getPriceForQuantity();
        item.getTax();
        item.inStock();
        item.setShippingWeight(5.0);
        item.setDescription("Pembelian barang dengan kondisi baru.");
        item.addOrderDetail(detailOrderGoFood);
        System.out.println("Total berat pengiriman sebesar: " + item.getShippingWeight() + "Kg.");
        System.out.println("Deskripsi barang: " + item.getDescription());

        Cash cash = new Cash();
        cash.setCashTendered(10000.0F);
        gofood.addCashList(cash);
        System.out.println("Pembayaran ongkos kirim sebesar: Rp" + (int) cash.getCashTendered());

        System.out.println();

        Check check = new Check();
        check.setName("Rio Saputra");
        check.setBankID("12341234");
        check.authorized();
        gofood.addCheckList(check);
        System.out.println("Pembayaran atas nama " + check.getName() + " dengan IDBank " + check.getBankID());

        System.out.println();

        Credit credit = new Credit();
        credit.authorized();
        credit.setNumber("11100040050330");
        credit.setType("Debit");
        credit.setExpDate(LocalDate.now());
        gofood.addCreditList(credit);
        System.out.println("Nomor kartu credit " + credit.getNumber() + " dengan tipe " + credit.getType() + " akan berakhir pada " + credit.getExpDate());

        System.out.println("Terima kasih telah melakukan pesanan, Happy Shopping :)");
    }
}
