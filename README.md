# Taller03-SOLID

### Punto 4
Existe una clase enum que contiene los aderezos. Esto no es muy conveniente, ya que si se tiene la necesidad de agregar nuevos aderezos nos veremos obligados a escribir sobre ese bloque de código, lo que incumple con el principio de OPEN-CLOSED. Este principio establece que las entidades software (clases, módulos y funciones) deberían estar abiertos para su extensión, pero cerrados para su modificación. 
Así que se creó una clase abstracta Aderezo, para que cada vez que se necesite uno nuevo implemente de ahí, lo que permitirá la extensión de código necesario y evitará la modificación de otro que ya funciona(;

![aderezo1](https://user-images.githubusercontent.com/69025663/98879989-051e7880-2487-11eb-9e1d-0ff9af10d751.png)
