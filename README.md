# Conversor de Monedas - Challenge ONE/Alura Latam

El conversor de monedas permite obtener tasas de cambio en tiempo real consumiendo la API de **Exchangerate API**, filtrando y mostrando las monedas de interés al usuario.

## Características

- **Consumo de API**: El proyecto realiza solicitudes a la API de **Exchangerate API**.
- **Manipulación de JSON**: Los datos obtenidos en formato JSON son analizados y procesados.
- **Filtro de Monedas**: El usuario puede seleccionar las monedas que desea consultar.
- **Exhibición de Resultados**: El resultado de la conversión se muestra de forma clara y amigable.

## Tecnologías utilizadas

- **Java**: Lenguaje principal del proyecto.
- **Exchangerate API**: API externa utilizada para obtener las tasas de cambio en tiempo real.
- **Gson**: Biblioteca usada para la manipulación y conversión de datos JSON.
- **JSON**: Formato de datos utilizado para la respuesta de la API.
- **IntelliJ IDEA**: IDE utilizado para el desarrollo del proyecto.

## Pasos del desarrollo

1. **Configuración del Ambiente Java**: Se configuró un entorno de desarrollo en Java utilizando IntelliJ IDEA.
2. **Creación del Proyecto**: Se creó un proyecto base para implementar la lógica de conversión.
3. **Consumo de la API**: Se implementó la conexión y consumo de **Exchangerate API**.
4. **Análisis de la Respuesta JSON**: Los datos JSON se analizaron para extraer la información relevante.
5. **Filtro de Monedas**: Se implementó un sistema de filtrado para que el usuario elija las monedas que le interesan.
6. **Exhibición de Resultados**: Los resultados se muestran de manera clara y amigable al usuario.

## Requisitos

- **Java 11+**: Asegúrate de tener instalado Java 11 o superior.
- Dependencia de **Gson** para deserializar la respuesta JSON de la API.

## Instalación

1. Clona el repositorio.
2. Asegúrate de tener **Java** instalado en tu sistema.
3. Importa el proyecto en tu IDE preferido.
4. Añade la biblioteca **Gson** a tu proyecto (puedes descargarla desde [aquí](https://github.com/google/gson)).
5. Ejecuta la clase `Principal.java` para iniciar la aplicación.


## Uso

- Al iniciar la aplicación, se mostrará un menú con las opciones de conversión disponibles.  
- Selecciona la conversión que deseas realizar ingresando el número correspondiente.  
- Ingresa la cantidad de dinero a convertir.  
- El resultado de la conversión se mostrará en un cuadro de diálogo.  
- Elige "8" para salir y finalizar el programa.

## API utilizada

- **Exchangerate API**: [https://exchangerate-api.com](https://exchangerate-api.com)

## Autor

Desarrollado por [Paulo Arce](https://github.com/Pauloo-Arce).

