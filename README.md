# Quadrato magico

Dato un numero intero N, costruire un quadrato 
di NxN caselle, ciascuna delle quali contiene
un numero tra 1 ed N^2.
I numeri devono essere tutti diversi tra loro.

Il quadrato si dice *magico* se la somma dei numeri
di ciascuna riga, la somma dei numeri di ciascuna
colonna, e la somma dei numeri su ciascuna diagonale
sono uguali.

Nota: il valore delle somme sarà
( N^2*(N^2+1)/2 ) / N 

# Analisi del problema
```
 X X X 
 X X X
 X X X
```

## Approccio 1: ad ogni livello `L` della ricorsione, scelgo quale valore inserire nella casella `L`
Con la ricorsione genero tutti i quadrati e poi controllo se le somme sono uguali affinche' si possa avere un quadrato magico.

L=0

```
 4 X X 
 X X X
 X X X
```

 L=1  /* Ad ogni livello che scendo, mi sposto di una casella */
 
```
	 4 8 X 
	 X X X
	 X X X
```

```
1 (Procedura di livello 1)
	2 (Procedura di livello 2)
		3 (Procedura di livello 3)
			4
				6
					7 (Procedura di livello 7)
						8 (Procedura di livello 8)
							9 -> NO (Procedura di livello 9)
						9 (Procedura di livello 8)
							8 -> NO
					8 (Procedura di livello 7)
						7
							9 -> NO
						9
							7 -> NO
					9
						8
							7
						7
							8
				7
				8
				9
			5
			6
			7
			8
			9
		4
		5
		6
		7
	3
	4
	5
	
2
3
```
	 
## Approccio 2: ad ogni livello `L`, decido dove mettere il numero (`L+1`)

L=0 -> dove metto 1 ?

```
 X X X 
 X X 1
 X X X
```

 L=1 -> dove metto 2 ?

```
	 X X X 
	 2 X 1
	 X X X
```


	 