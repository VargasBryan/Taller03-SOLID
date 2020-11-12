# Taller03-SOLID

### Punto 1
Dado que tanto la clase Pastel como la clase Helado poseen atributos y funcionalidades similares causando una repetición de código y baja optimización de recursos, produce una violación al principio de substitución de Liskov dado que ambas clases podrían ser derivadas de una super clase que contenga las funcionalidades comunes entre ambas clases. 
### Punto 2
En la clase OperacionesAderezo se puede observar una gran cantidad de métodos que definen la funcionalidad de agregar y quitar aderezos de los distintos postres, por lo que sería una violación al principio abierto/cerrado dado que el número de métodos aumentaría considerando la situación en que se requiera aumentar la variedad de postres, además de modificar los tipos de datos al tipo de postre a utilizar. Los ideal sería implementar dichas funcionalidades en la clase Postre, funcionando así de manera independiente sin importar el tipo de postre con el que desea trabajar. 
### Punto 3
Las clases pastel y helado implementan dos métodos que se encuentran muy relacionados. Un método se encarga de calcular el valor final del producto y el otro se encarga de mostrar por consola el valor final. Se sabe que el valor final de todos los productos que va a vender esta empresa será calculado con una misma fórmula, por lo que cada producto que se ingrese al sistema deberá de implementar el método para calcular el precio final. 
Al momento el sistema no es muy grande, pero ya es evidente una malá práctica de diseño. El principio que se estaría vulnerando es el de responsabilidad única, el cual indica que un objeto debe de realizar un único trabajo. Así mismo, se sabe que si queremos cambiar la fórmula para un producto, habría que hacer lo mismo con los otros. Estas son razones suficientes para tener que implementar una clase independiente y dedicada a el cáculo del precio final. De esta forma, un cambio se aplicaría a todas las clases.  
### Punto 4
Existe una clase enum que contiene los aderezos. Esto no es muy conveniente, ya que si se tiene la necesidad de agregar nuevos aderezos nos veremos obligados a escribir sobre ese bloque de código, lo que incumple con el principio de OPEN-CLOSED. Este principio establece que las entidades software (clases, módulos y funciones) deberían estar abiertos para su extensión, pero cerrados para su modificación. 
Así que se creó una clase abstracta Aderezo, para que cada vez que se necesite uno nuevo implemente de ahí, lo que permitirá la extensión de código necesario y evitará la modificación de otro que ya funciona(;
###Punto 5
Las clases lecheDeslactosada y lecheDescremada heredaban de la clase lecheEntera PERO la clase lecheDeslactosada heredaba un método que no debía utilizar ya que con la leche deslactosada no se podía realizar la preparación de un pastel, por lo que se encontró una infracción al principio de Liskov y se procedió a darle una solución.
Se creó una clase llamada leche la cuál hereda de lecheEntera, la clase lecheEntera se queda únicamente con el método para hacer los helados ya que los helados si se puede realizar con ambos tipos de leche, lecheDeslactosada hereda de lecheEntera, leche hereda de lecheEntera y se le añade el método para hacer el pastel (esta clase también es abstracta), y finalmente la clase lecheDescremada hereda de leche ya que con esta leche se pueden hacer helados y pasteles. Se modifica la clase manejadorDeLeche para validar que cuando reciba una orden de pastel verificar que sea de una lecheDescremada y realizar el casting correspondiente para el uso del método para hacer pastel.

![aderezo1](https://user-images.githubusercontent.com/69025663/98879989-051e7880-2487-11eb-9e1d-0ff9af10d751.png)


