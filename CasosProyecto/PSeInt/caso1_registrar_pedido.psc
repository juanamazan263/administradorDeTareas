Algoritmo sin_titulo
	Definir nameD, nameR, phoneNumberD, phoneNumberR, address, validar, validacion, lugar Como Cadena
	Definir unds, contador Como Entero
	unds <- 0
	validar <- 'no'
	contador <- 0
	// indicaciones
	Escribir 'Registre su pedido a continuación'
	// datos del remitente
	Escribir 'Ingrese los datos del remitente'
	Escribir 'Nombre'
	Leer nameR
	Escribir 'Número de telefono'
	Leer phoneNumberR
	// datos del destinatario
	Escribir 'Ingrese los siguientes datos'
	// se abre un bucle para soliciatar la validacion de datos del destinatario
	Repetir
		Escribir 'Nombre del establecimiento'
		Leer lugar
		Escribir 'Nombre del destinatario'
		Leer nameD
		Escribir 'Número de telefono'
		Leer phoneNumberD
		Escribir 'Direccion de entrega'
		Leer address
		Escribir 'Cuantas unidades va registrar'
		Leer unds
		// resumen en pantalla
		Escribir 'Los datos ingresados para el pedido son: '
		Escribir 'Establecimiento', lugar
		Escribir 'Nombre: ', nameD
		Escribir 'Contacto: ', phoneNumberD
		Escribir 'Dirección: ', address
		Escribir 'Cantidad: ', unds, ' unidades'
		// verificacion de datos
		Escribir 'Si los datos son correctos escriba (si) para continuar, de lo contrario escriba (no) para corregir'
		Leer validacion
		// si los datos son incorrectos va a aumentar el contador y repertira el bucle
		Si validacion=='no' Entonces
			contador <- contador+1
			Escribir 'ingrese nuevamente los datos del destinatario'
			Escribir 'count', contador
			// si los datos son correctos se enviara in mensaje a la pantalla que el proceso fue exitoso
		SiNo
			Escribir '======================================'
			Escribir 'Su pedido ha sido registrado con exito'
			Escribir '======================================'
		FinSi
		// el bucle se cierra cuando el contador haya superado el limite o los datos del destinatarios sean correctos
	Hasta Que validacion<>validar O contador==2
	// si el contadorsupera el limite enviara un mensaje a la pantalla que el proceso no fue exitoso
	Si contador==2 Entonces
		Escribir 'Ha alcanzado el limite de intentos permitidos'
		Escribir 'Vuelva a intentarlo mas tarde'
	FinSi
FinAlgoritmo
