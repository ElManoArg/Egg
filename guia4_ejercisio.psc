Algoritmo guia4_ejercisio
	definir productos, vector Como entero
	dimension productos(5,5)
	dimension vector(5)
	//productos(0,0)=("producto1","lunes")
	
	llenarmatriz(productos)
	vermatriz(productos)
	llenadoproductos(productos,vector)
	columnas(vector)
FinAlgoritmo

SubProceso  llenarmatriz(productos)
	definir i,j Como Entero
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
		 productos(i,j) = Aleatorio(1,10)
		FinPara
	FinPara
FinSubProceso

SubProceso  vermatriz(productos)
	definir i,j Como Entero
	para i<-0 Hasta 4 Hacer
		para j<-0 Hasta 4 Hacer
		 escribir sin saltar productos(i,j), ' '
	 FinPara
	 escribir ' '
	FinPara
FinSubProceso
subproceso llenadoproductos(productos,vector)
	
	definir i,j,suma,suma2 Como Entero
	escribir '                 Lunes      Martes     Miercoles      Jueves    Viernes    Total producto'
	para i<-0 hasta 4 Hacer
		escribir sin saltar 'producto: ', i+1
		suma=0
		suma2=0
		para j<-0 hasta 4 Hacer
			suma=productos(i,j)+suma
			suma2=suma2 + productos(j,i)
			escribir Sin Saltar '      '
			escribir Sin Saltar productos(i,j), '     '
		FinPara
		//escribir ' '
		escribir '       ' suma 
		vector(i)=suma2
		escribir ' '
	FinPara
FinSubProceso


SubProceso columnas(vector)
	definir i Como Entero
	escribir sin saltar ' Total semana  '
	para i<-0 hasta 4 Hacer
		escribir Sin Saltar'         ',vector(i)
	FinPara
	escribir '       '
	
FinSubProceso


hola

	
	
	
