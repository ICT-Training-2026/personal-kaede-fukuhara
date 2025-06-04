public class Product {
	String name; //商品名
	int  price;//価格
		
		//値上げメゾット
		int up(int amt) {
			return price += amt;
		}
		
		//値下げメゾット
		int down(int amt) {
			return price -= amt;
		}
		
		//情報表示
		void display() {
			System.out.println(name+ ":"+ price+"円");
		}
}
