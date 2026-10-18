Algoritmo caso2_validacion_asignacion
	Definir jpPedidos, jaPedidos, jePedidos, ssPedidos, contador, codigo, conductor Como Entero
	Definir jpStatus, jaStatus, jeStatus, ssStatus, salir Como Cadena
	jpPedidos <- 38
	jaPedidos <- 40
	jePedidos <- 40
	ssPedidos <- 25
	contador <- 0
	Repetir
		Escribir 'Validacion y asignacion'
		Escribir '=============================='
		Escribir '1. José Martínez'
		Escribir 'Pedidos asignados:: ', jpPedidos
		Si jpPedidos>=40 Entonces
			jpStatus <- 'NoDisponible'
		SiNo
			jpStatus <- 'Disponible'
		FinSi
		Escribir 'Estado del conducto: ', jpStatus
		Escribir '=============================='
		Escribir '2. Juan Amazan'
		Escribir 'Pedidos asignados: ', jaPedidos
		Si jaPedidos>=40 Entonces
			jaStatus <- 'NoDisponible'
		SiNo
			jaStatus <- 'Disponible'
		FinSi
		Escribir 'Estado del conducto: ', jaStatus
		Escribir '=============================='
		Escribir '3. Juan Espinoza'
		Escribir 'Pedidos asignados: ', jePedidos
		Si jePedidos>=40 Entonces
			jeStatus <- 'NoDisponible'
		SiNo
			jeStatus <- 'Disponible'
		FinSi
		Escribir 'Estado del conducto: ', jeStatus
		Escribir '=============================='
		Escribir '4. Sergio Salgado '
		Escribir 'Pedidos asignados: ', ssPedidos
		Si ssPedidos>=40 Entonces
			ssStatus <- 'NoDisponible'
		SiNo
			ssStatus <- 'Disponible'
		FinSi
		Escribir 'Estado del conducto: ', ssStatus
		Escribir '=============================='
		Escribir 'Seleccione al conductor para asignar el pedido'
		Escribir '>>>>EL LIMITE DE PEDIDOS ES (40)<<<<'
		Leer conductor
		Según conductor Hacer
			1:
				Escribir 'Conductor: José Martínes'
				Si jpStatus='NoDisponible' Entonces
					contador <- contador+1
					Escribir '!!!!!!!!!!!!!!!!!!!!!!!!!!'
					Escribir 'Estado: >>No disponible<<'
					Escribir '¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡'
				SiNo
					Escribir 'Estado: ', jpStatus
					jpPedidos <- jpPedidos+1
					Escribir 'Dijite el codigo del pedido'
					Leer codigo
					Escribir 'El pedido fue asignado con exito'
				FinSi
			2:
				Escribir 'Conductor: Juan Amazan'
				Si jaStatus='NoDisponible' Entonces
					contador <- contador+1
					Escribir '!!!!!!!!!!!!!!!!!!!!!!!!!!'
					Escribir 'Estado: >>No disponible<<'
					Escribir '¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡'
				SiNo
					Escribir 'Estado: ', jaStatus
					jaPedidos <- jaPedidos+1
					Escribir 'Dijite el codigo del pedido'
					Leer codigo
					Escribir 'El pedido fue asignado con exito'
				FinSi
			3:
				Escribir 'Conductor elegido: Juan Espinoza'
				Si jeStatus='NoDisponible' Entonces
					contador <- contador+1
					Escribir '!!!!!!!!!!!!!!!!!!!!!!!!!!'
					Escribir 'Estado: >>No disponible<<'
					Escribir '¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡'
				SiNo
					Escribir 'Estado: ', jeStatus
					jePedidos <- jePedidos+1
					Escribir 'Dijite el codigo del pedido'
					Leer codigo
					Escribir 'El pedido fue asignado con exito'
				FinSi
			4:
				Escribir 'Conductor elegido: Sergio Salgado'
				Si ssStatus='NoDisponible' Entonces
					contador <- contador+1
					Escribir '!!!!!!!!!!!!!!!!!!!!!!!!!!'
					Escribir 'Estado: >>No disponible<<'
					Escribir '¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡'
				SiNo
					Escribir 'Estado: ', ssStatus
					ssPedidos <- ssPedidos+1
					Escribir 'Dijite el codigo del pedido'
					Leer codigo
					Escribir 'El pedido fue asignado con exito'
				FinSi
			De Otro Modo:
				contador <- contador+1
				Escribir 'La opcion elegida no es valida'
				Escribir 'Vuelva a intentar'
		FinSegún
		Si contador<2 Entonces
			Escribir 'Desea asignar otro pedido (S/N)'
			Leer salir
		FinSi
	Hasta Que salir='n' O salir='N' O contador=2
	Si contador=2 Entonces
		Escribir 'Ha superado el limite de intentos, vualva mas tarde'
	FinSi
FinAlgoritmo
