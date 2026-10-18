Algoritmo ejercicio3
	Definir notaCorte1, notaCorte2, puntajeAcomulado, puntajeFaltante, notaMInima Como Real
	Escribir 'Escriba la nota del primer corte'
	Leer notaCorte1
	Escribir 'Escriba la nota del segundo corte'
	Leer notaCorte2
	notaCorte1 <- notaCorte1*0.20
	notaCorte2 <- notaCorte2*0.20
	puntajeAcomulado <- notaCorte1+notaCorte2
	puntajeFaltante <- 3.0-puntajeAcomulado
	notaMInima <- puntajeFaltante/0.60
	Escribir 'Su nota minima debe ser de: '
	Escribir notaMInima
FinAlgoritmo
