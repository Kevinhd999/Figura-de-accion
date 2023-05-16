Ejercicio Base


En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita generar facturas de ventas de su establecimiento, relacionado con figuras de acción de las series animadas mas famosas en el mundo 
Aclaraciones: 
Tendrá un limite de venta de 5 productos máximo 
No tendrá limites de precio 
Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia 
en el almacenamiento de los datos. 

No se realiza validación, ni se verifica calidad en los datos ingresados.


Analisis del ejercicio 
Estado: Tareas por hacer Proyecto: Figuras de acción

Componentes: Ninguno Versiones afectadas: Ninguno Versiones corregidas: Ninguno

Tipo: Historia Prioridad: Medium Informador: Kevin Monroy  Responsable: Kevin Monroy Resolución: Sin resolver Votos: 0 Etiquetas: Programa de concesionario Estimación Restante: Desconocido Tiempo Trabajado: Desconocido Estimación original: Desconocido
Rank: 0|i0001j: Sprint: Tablero Sprint 1

Descripción HISTORIA DE USER

Generado a las Sun May 14 23:13:48 UTC 2023 por Kevin Monroy (Kevinhd999) usando JIRA 1001.0.0-SNAPSHOT#100225-sha1:e4eb8694a796a8572871db670789a29d54b1c385.



Aproximacion caso de uso 

[![Whats-App-Image-2023-05-16-at-7-51-40-AM.jpg](https://i.postimg.cc/pXXWRMXM/Whats-App-Image-2023-05-16-at-7-51-40-AM.jpg)](https://postimg.cc/c62yBjnF)

Diagrama de flujo 


[![Diagrama-F-figuras.jpg](https://i.postimg.cc/J7pNzB6n/Diagrama-F-figuras.jpg)](https://postimg.cc/QVW96VrG)


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
