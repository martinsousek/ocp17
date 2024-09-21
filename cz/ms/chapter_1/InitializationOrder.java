class InitializationOrder {
	
	public InitializationOrder() {
		field = 5;
	}

	int field = 3;
	{field = 4;}

	public static void main(String[] args) {
		InitializationOrder order = new InitializationOrder();
		System.out.println(order.field);
	}
}