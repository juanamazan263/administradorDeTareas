Algoritmo ejercicio11
	Definir num1, num2, resta, suma, mult, div, modulo Como Real
	Escribir 'Escriba el primer número'
	Leer num1
	Escribir 'Escriba el segundo número'
	Leer num2
	suma <- num1+num2
	Si num1>num2 Entonces
		resta <- num1-num2
	SiNo
		resta <- num2-num1
	FinSi
	mult <- num1*num2
	Si num1>num2 Entonces
		div <- num1/num2
	SiNo
		div <- num2/num1
	FinSi
	Si num1>num2 Entonces
		modulo <- num1 MOD num2
	SiNo
		modulo <- num2 MOD num1
	FinSi
	Escribir 'La suma de los dos números es: ', suma
	Escribir 'La resta de los dos números es: ', resta
	Escribir 'La multiplicación de los dos número es: ', mult
	Escribir 'La división de los dos números es: ', div
	Escribir 'El resto de la división entre los dos números es: ', modulo
FinAlgoritmo
