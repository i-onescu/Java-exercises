package HomeworkSession6;

public class Test {
    public static void main(String[] args) {


        //1.

        Employee employee1 = new Employee(123,"John",80000);
        System.out.print(employee1.getName() + "'s employee id is " + employee1.getId() + " and his/her salary is " + employee1.getSalary() + " dollars");
        employee1.raiseSalary(20);
        System.out.println(employee1.getName() + "'s new salary is " + employee1.getSalary());

        System.out.println();

        //2.

        InvoiceItem invoice1 = new InvoiceItem();
        invoice1.setId(321);
        invoice1.setDescription("Public Trading LLC buys Apple shares");
        invoice1.setQuantity(3500);
        invoice1.setPrice(12.5F);
        System.out.println("This Invoice:\n ID: " + invoice1.getId() + "\nDescription: " + invoice1.getDescription()
                + "\nQuantity: " + invoice1.getQuantity() + "\nPrice: " + invoice1.getPrice() + "\nTotal: " + invoice1.getTotal());

        System.out.println();

        //3.

        Date today = new Date(19,10,2023);
        System.out.println("Today's date is ");
        today.printDate();

        System.out.println();

        //4.
        Account account = new Account("John",12500);
        Account anotherAccount = new Account(5000);
        account.showBalance();
        anotherAccount.showBalance();
        account.transferTo(anotherAccount,2500);
        account.showBalance();
        anotherAccount.showBalance();

    }
}
