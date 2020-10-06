package br.com.tessaro.app.model.enums;

public enum EstadoPagamento {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	public int getCode() {
		return code;
	}

	private EstadoPagamento(int code) {
		this.code = code;
	}

	public static EstadoPagamento valueOf(int code) {
		for (EstadoPagamento value: EstadoPagamento.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
