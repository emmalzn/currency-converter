# Conversor de Monedas en Java

Este es un proyecto simple de consola desarrollado en **Java**, que permite **convertir entre monedas** utilizando la API gratuita de [ExchangeRate API](https://www.exchangerate-api.com/), mediante el uso de `HttpClient`.

---

## Características

- Menú interactivo con 6 opciones de conversión:
  - Dólar ⇄ Peso argentino
  - Dólar ⇄ Real brasileño
  - Dólar ⇄ Peso colombiano
- Entrada por teclado para seleccionar opción y monto.
- Uso del paquete `java.net.http` para consumir API REST.
- Respuesta formateada con 2 decimales.

---

## Estructura del proyecto

```
com.proyect.currency
├── Main.java                     // Punto de entrada principal
├── service
│   └── CurrencyConverterService.java  // Lógica para consultar y convertir monedas
├── model
│   ├── CurrencyResponse.java     // Modelo que mapea la respuesta JSON de la API
│   
```

---

## Requisitos

- Java 11 o superior
- IDE como IntelliJ IDEA, Eclipse o VS Code
- Conexión a Internet

---

## Cómo ejecutar

1. Clona el repositorio o descarga el código fuente.
2. Abre el proyecto en tu IDE.
3. Ejecuta la clase `Main.java`.
4. En consola, selecciona una opción del menú y escribe la cantidad.

---

## Ejemplo de uso

```
Sea bienvenido/a al Conversor de Moneda =]
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Salir
Elija una opción válida: 1
Ingrese la cantidad a convertir: 100
Resultado: 100.00 USD = 88000.00 ARS
```

---

## Fuente de datos

Este proyecto consume la siguiente API:

```
https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD
```

Puedes obtener tu propia clave en: [https://www.exchangerate-api.com](https://www.exchangerate-api.com/)

---

## Autor

- Emma Esperanza Lozano
