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

# Segundo parcial
## Busqueda secuencial
## Busqueda binaria
## Linked list
```java
LinkedList<tipoDeDato> linkedList = new LinkedList<tipoDeDato>();
linkedList.addFirst(Object) //Añade al inicio
linkedList.addLast(Object) //Añade al final
linkedList.removeFirst(Object)//Elimina el primero
linkedList.removeLast(Object)//Elimina el final
linkedList.isEmpty()//Regresa true si esta vacio
```
## Pila (Stack)
Se implementa mediante un linkedList
```java
linkedList.push(Objeto)//Apila un nuevo dato
linkedList.pop() //Elimina el ultimo dato apilado
linkedList.peek()//Retorna el ultimo dato apilado
```

## Cola (Queue)
```java
linkedList.offer(Objeto)//Añade el dato al final de la cola
linkedList.peek()//Retorna la cabeza de la cola (el primer elemento)
linkedList.poll()//Retorna la cabeza y lo elimina

linkedList.getFirst()
linkedList.getLast()
```

## Arbol binario
Cada nodo tiene a lo más dos nodos

Hay varias formas de recorrerlos ellos son
- Preorden RID
- Orden IRD
- PosOrden IDR
## Arbol binario de busqueda
Lo mismo que el anterior pero se insertan los más grandes a la derecha y los más pequeños a la izquierda

Para eliminar podemos usar `izquierdo más derecho` o `derecho más izquierdo`

## Arbol AVL
Asi se llama por el las iniciales de sus creadores

Es un arbol autobalanceado, estos tienen un factor de equilibrio `FE` que es la diferencia entre el numero de niveles de la rama derecha e izquierda, este numero no febe ser mayor a 1 para decir qu el arbol esta balanceado.

Para balancear usamos:

Rotacion simple (DD o II)

Rotacion Compuesta (DI o ID)

Si el dato que se pone al centro tiene hijos, estos se traspazan a las raices

## Arbol B
Es un arbol donde cada rama puede tener n-1 datos, si sobre pasa, el valor del centro sube, y los datos de los lados crean dos nuevas ramas

## Archivo
```java
File(pathname)
.exist() //retorna true si existe
.createNewFile() //Crea un nuevo archivo
.getAbsolutePath() //Regresa la ruta absoluta

FileWriter(nobreArchivoEditar)
.write(data) //Escribe la data en el archivo
.close()//Cierra el archivo

FileReader(nombreArchivoLeer)//Reads text from character files using a default buffer size. Decoding from bytes to characters uses either a specified charset or the platform's default charset.

BufferedReader(FileReader)
.readLine()//Lee una linea
.close() //Cierra el archivo
```

## Archivo de acceso aleatorio
```java
RandomAccessFile //Archivo en el que puedes saltar a una posicion en una instruccion sin tener que leer secuencialmente como en File

.seek(positionInBytes)//Posiciona el puntero en el byte seleccionado
.writeType(data)//Escribe la data del Type indicado y mueve el puntero al siguiente byte
.readType()//Lee el dato del Type indicado y mueve el puntero al byte siguiente
