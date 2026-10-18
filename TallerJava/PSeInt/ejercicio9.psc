Algoritmo ejercicio9
	Definir valorTarifa, valorPagado, descuento, porcentaje Como Real
	Escribir 'Indique el valor de la tarifa'
	Leer valorTarifa
	Escribir 'Indique el valor pagado'
	Leer valorPagado
	descuento <- valorTarifa-valorPagado
	porcentaje <- (descuento/valorTarifa)*100
	Escribir 'El descuento aplicado a su compra fue de: ', porcentaje, '%'
FinAlgoritmo
