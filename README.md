En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita generar facturas de ventas de su establecimiento, relacionado con figuras de acción de las series animadas mas famosas en el mundo 
Aclaraciones: 
Tendrá un limite de venta de 5 productos máximo 
No tendrá limites de precio 
Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia 
en el almacenamiento de los datos. 

No se realiza validación, ni se verifica calidad en los datos ingresados.


Pseudocodigo


Algoritmo VentasTiendaFiguras
Definir figura Como Caracter
Definir vendedor Como Entero
Definir ventas Como Real
Escribir 'Ingrese el nombre de la figura:'
Leer figura
Escribir 'Ingrese el número del vendedor:'
Leer vendedor
Escribir 'Ingrese las ventas para la figura ',figura,' del vendedor ',vendedor,':'
Leer ventas
Escribir 'Ventas de la figura ',figura,' para el vendedor ',vendedor,':'
Escribir 'El vendedor ',vendedor,' vendió ',ventas,' de la figura ',figura
FinAlgoritmo

[![Diagrama-F-figuras.jpg](https://i.postimg.cc/J7pNzB6n/Diagrama-F-figuras.jpg)](https://postimg.cc/QVW96VrG)

