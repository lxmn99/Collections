import java.util.ArrayList;

public class Arrlist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("benz");
		list.add("volvo");
		list.add("Hyundai");
		list.add("Yamaha");
		list.add("Bikes");
		list.add("cars");
		list.add("vehciles");
		list.add("pulsar");
		list.add("honda");
		list.add("fz");
        System.out.println(list.size());
        list.remove(1);
        for(String s:list) {
        	System.out.println(s+" ");

	}
        System.out.println(list.contains("vehciles"));
}
}
