# Taller03-SOLID

### Punto 3
Las clases pastel y helado implementan dos métodos que se encuentran muy relacionados. Un método se encarga de calcular el valor final del producto y el otro se encarga de mostrar por consola el valor final. Se sabe que el valor final de todos los productos que va a vender esta empresa será calculado con una misma fórmula, por lo que cada producto que se ingrese al sistema deberá de implementar el método para calcular el precio final. 
Al momento el sistema no es muy grande, pero ya es evidente una malá práctica de diseño. El principio que se estaría vulnerando es el de responsabilidad única, el cual indica que un objeto debe de realizar un único trabajo. Así mismo, se sabe que si queremos cambiar la fórmula para un producto, habría que hacer lo mismo con los otros. Estas son razones suficientes para tener que implementar una clase independiente y dedicada a el cáculo del precio final. De esta forma, un cambio se aplicaría a todas las clases.  
### Punto 4
Existe una clase enum que contiene los aderezos. Esto no es muy conveniente, ya que si se tiene la necesidad de agregar nuevos aderezos nos veremos obligados a escribir sobre ese bloque de código, lo que incumple con el principio de OPEN-CLOSED. Este principio establece que las entidades software (clases, módulos y funciones) deberían estar abiertos para su extensión, pero cerrados para su modificación. 
Así que se creó una clase abstracta Aderezo, para que cada vez que se necesite uno nuevo implemente de ahí, lo que permitirá la extensión de código necesario y evitará la modificación de otro que ya funciona(;

![aderezo1](https://user-images.githubusercontent.com/69025663/98879989-051e7880-2487-11eb-9e1d-0ff9af10d751.png)


