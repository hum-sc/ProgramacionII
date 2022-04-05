# ProgramacionII
Estos son los contenidos vistos en la materia de programación 2

## Herencia
Es tal cual, tener una `super clase` la cual le va a heredar o a donar atributos y metodos a las `clases hijo`.
## protected
Este modificador de acceso es un nivel intermedio entre `public` y `private` ya que en private solo la clase que emplea los atributos/metodos puede acceder a ellos, nisiquiera las subclases pueden acceder, y public permite que cualquier ente acceda. Entonces el nivel medio, que no permita que otros entes accedan a estos, pero si las subclases y otras clases del mismo `package` es `protected`.
Se suele utilizar en constructores y métodos.
## Polimorfismo
Es la capacidad de que `clases hijo` de una misma `super clase` puedan realizar distintas acciones, o de distinta forma una accion dada, para emplearla existen dos opciones, sobre carga y sobre escritura
### Sobrecarga
La sobrecarga es la capacidad de que una clase efectue distintas acciones para un solo método simplemente cambiando el tipo y la cantidad de parametros que se le dan.
### Sobre escritura
Para que este tipo de polimorfismo suceda, se debe declarar un metodo con las mismas caracteristicas en la subclase que en la superclase, (nombre, numero y tipo de argumentos) pero con distinto funcionamiento
## Abstracción
Se enfoca en la vista desde fuera de los objetos, donde a otras clases no les importa como fuciona por dentro la clase en función, es decir, sus procesos son de el y los procesos de otras clases no influyen en el.
### Clases abstractas
No pueden ser instanciadas, solo heredadas, para que sea abstracta, almenos un método debe ser abstracto
### Métodos virtuales
Son los metodos sobreescritos.
## Iteradores
Sigue una ruta y da acceso a elementos de datos del contenedor, pero no realiza iteración, nosotros debemos avanzarlo o retrocederlo.
## Recursividad
La recursividad es una funcion que se llama a si misma hasta encontrar un caso base y regresa todo de golpe
