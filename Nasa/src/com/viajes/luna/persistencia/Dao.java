package com.viajes.luna.persistencia;

public interface Dao<E,K> {

	//Si la PK se proporciona
	//public void alta(E entidades);
	
	//Si PK es autoincremental
	public K alta(E entidades);

	//No News, Good News
	public void modificacion(E entidades);

	public void bajaPorPk(K pk);

	public void baja(E entidades);

	public E consulta(K pk);

	public E[] consulta();
}
