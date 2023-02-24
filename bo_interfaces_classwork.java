interface decor {
    void construct();
}

class Room implements decor {
    public void construct() {
        System.out.println("Room created!");
    }
}

class Kitchen implements decor {
    public void construct() {
        System.out.println("Kitchen created!");
    }
}

class LivingRoom implements decor {
    public void construct () {
        System.out.println("Living room created!");
    }

    // public static void main(String args[]) {
    //     decor d1 = new Room();
    //     decor d2 = new Kitchen();
    //     decor d3 = new bo_LivingRoom();
    //     d1.construct();
    //     d2.construct();
    //     d3.construct();
    // }
}

public class bo_interfaces_classwork implements decor {

    public void construct () {
        
    }
    public static void main(String args[]) {
        decor d1 = new Room();
        decor d2 = new Kitchen();
        decor d3 = new LivingRooom();
        d1.construct();
        d2.construct();
        d3.construct();
    }
}
