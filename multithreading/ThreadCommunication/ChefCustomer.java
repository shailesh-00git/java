
class Table {
  private String food;
  private boolean isPrepared = false;

  // Chef prepares food
  public synchronized void prepareFood(String food) {
    while (isPrepared) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    this.food = food;
    isPrepared = true;
    System.out.println("Chef Prepared: " + food);
    notify();
  }

  // Customer eats food
  public synchronized void consumeFood() {
    while (!isPrepared) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("Customer Ate: " + food);
    isPrepared = false;
    notify();
  }
}

class Chef extends Thread {
  private Table table;
  private String[] foods = { "Pizza", "Burger", "Fried Rice", "Chowmein", "Momo" };

  Chef(Table table) {
    this.table = table;
  }

  public void run() {
    for (int i = 0; i < foods.length; i++) {
      table.prepareFood(foods[i]);
      try {
        Thread.sleep(1000); // prepare time
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

class Customer extends Thread {
  private Table table;

  public Customer(Table table) {
    this.table = table;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      table.consumeFood();
      try {
        Thread.sleep(1000); // ate time

      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}

public class ChefCustomer {
  public static void main(String[] args) {
    Table table = new Table();
    Chef chef = new Chef(table);
    Customer customer = new Customer(table);

    chef.start();
    customer.start();
  }
}
