# Ejemplo 1 - Ventanas en Java

## Álex Coca Lucena 2ºDAM

## Descripción
Este proyecto crea una ventana utilizando AWT y maneja varios eventos de ventana, como apertura, cierre, minimización y maximización, a través de un `WindowListener`.

## Cómo funciona
- **Swing**: La ventana se configura y se abre con un `JFrame`, y se utilizan `WindowListener` para gestionar eventos de ventana.
- El icono de la ventana se establece mediante `Toolkit.getDefaultToolkit().getImage()`.

## Requisitos
- Icono `icon.png` en el directorio donde se ejecuta el programa.

## Cómo ejecutar
1. Ejecuta la clase `Main` en tu IDE o consola.

## ¿Por qué se utilizan eventos de ventana?
- Se utilizan para manejar interacciones del usuario con la ventana, proporcionando retroalimentación sobre acciones como abrir, cerrar y minimizar.

## Recursos adicionales
- [Documentación AWT en la API de Java](https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html)
- [Documentación Swing en la API de Java](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html)

