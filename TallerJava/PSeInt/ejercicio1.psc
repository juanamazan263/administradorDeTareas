Algoritmo ejercicio1
	Definir salarioTotal, salarioNeto, retencion, valorHora, cantHoras Como Real
	Escribir 'Dijite la cantidad de horas trabajadas'
	Leer cantHoras
	Escribir 'Dijite el valor de las horas'
	Leer valorHora
	salarioTotal<-valorHora*cantHoras
	retencion<-salarioTotal*0.05
	salarioNeto<-salarioTotal-retencion
	Escribir 'EL salario total es: '
	Escribir salarioTotal
	Escribir 'Retencion del 5%' 
	Escribir retencion
	Escribir 'Salario neto'
	Escribir salarioNeto
FinAlgoritmo