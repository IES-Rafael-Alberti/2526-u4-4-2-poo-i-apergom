# Título de la Actividad: Programación Orientada a Objetos (POO)

## Identificación de la Actividad
- **ID de la Actividad:** 4.1 POO
- **Módulo:** Programación 
- **Unidad de Trabajo:** Unidad 4 - Introducción a la Programación Orientada a Objetos
- **Fecha de Creación:** 19-01
- **Fecha de Entrega:** 19-01

## Alumno(s)
- **Nombre y Apellidos:** Antonio Manuel Pérez Gómez
- **Correo electrónico:** apergom459w@g.educaand.es
- **Iniciales del Alumno/Grupo:** AMPG

---

## Descripción de la Actividad
Esta actividad tiene como objetivo implementar diversas prácticas que refuercen los conceptos básicos de la programación orientada a objetos usando Kotlin. A través de los ejercicios, se desarrollarán capacidades como la creación de clases, encapsulación, validaciones y operaciones específicas sobre atributos y objetos.

## Lista de Ejercicios
### 1. **Clase Coche**
- La clase modela un objeto **Coche** que incluye atributos como `marca`, `modelo`, `caballos`, `puertas`, `matrícula` y un campo opcional `color` que tiene un setter con validación.
- **Validaciones:** 
  - `marca` y `modelo` no pueden estar vacíos.
  - `caballos` deben estar en el rango 70-700.
  - `puertas` deben estar entre 3 y 5.
  - La matrícula debe tener una longitud exacta de 7 caracteres.
- **Diseño:** Constructor primario con inicialización y método `toString` sobrescrito.
- **Ejemplo de uso:** Crear un coche, asignar el color y mostrar su información.

**Archivo asociado:** `Coche.kt`

---

### 2. **Clase Persona**
- Modela una **Persona** con atributos como `nombre`, `peso` y `altura`, con la capacidad de calcular su índice de masa corporal (**IMC**).
- **Características:**
  - Getter y setter para garantizar validez de la altura.
  - Constructor secundario para inicializar el objeto.
  - Método `calcularDescripcion` devuelve descripciones del estado del IMC:
    - Bajo peso, saludable, sobrepeso u obesidad.
  - Método `equals` sobrescrito para comparar objetos.
- **Ejemplo de uso:** Crear varias personas y calcular su IMC y descripción.

**Archivo asociado:** `Persona.kt`

---

### 3. **Clase Rectángulo**
- Representa un **Rectángulo** con base y altura, permitiendo calcular área y perímetro.
- **Validaciones:**
  - Base y altura deben ser números positivos.
- **Diseño:** Métodos `area` y `perimetro` personalizados y un `toString` para representación.
- **Ejemplo de uso:** Crear una lista de rectángulos, calcular y mostrar sus áreas y perímetros.

**Archivo asociado:** `Rectangulo.kt`

---

### 4. **Clase Tiempo**
- Modela un **Tiempo** con horas, minutos y segundos, que permite realizar incrementos entre tiempos.
- **Características:**
  - Validación en el rango de valores: 
    - Horas [0-23], minutos y segundos [0-59].
  - Métodos internos como `aSegundos` para conversiones y `desdeSegundos` para ajustes.
  - Método público `incrementar` que añade tiempo y valida que no exceda 23:59:59.
- **Ejemplo de uso:** Crear dos objetos `Tiempo`, sumarlos y verificar su validez.

**Archivo asociado:** `Tiempo.kt`

---

## Instrucciones de Compilación y Ejecución

### Requisitos Previos
- **Lenguaje:** Kotlin (versión [especificar])
- **Dependencias:** No necesita librerías externas.
- **Entorno recomendado:** IntelliJ IDEA.

### Pasos para Compilar
Para compilar los programas, usa el comando:
```bash
kotlinc <archivo>.kt -include-runtime -d programa.jar
```

### Pasos para Ejecutar
```bash
java -jar programa.jar
```

---

## Ejemplos de Ejecución

### **Ejemplo para `Coche`**
#### Entrada 1:
```kotlin
val coche = Coche("Ford", "Focus", 120, 5, "1234567")
coche.color = "Rojo"
println(coche)
```
#### Salida:
```text
Coche(marca='Ford', modelo='Focus', caballos=120, puertas=5, matricula='1234567', color=Rojo)
```

---

### **Ejemplo para `Tiempo`**
#### Entrada 2:
```kotlin
val tiempo1 = Tiempo(23, 59, 50)
val incremento = Tiempo(0, 0, 15)
tiempo1.incrementar(incremento)
```
#### Salida:
```text
Tiempo incrementado: 0h 0m 5s
```

---

### **Ejemplo para `Rectángulo`**
#### Entrada 3:
```kotlin
val rectangulo = Rectangulo(5.0, 10.0)
println("Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")
```
#### Salida:
```text
Área: 50.0, Perímetro: 30.0
```

---

## Referencias y Fuentes
- [Documentación oficial de Kotlin](https://kotlinlang.org)
- Apuntes de clase y recursos proporcionados.

---

## Conclusiones
Los ejercicios permiten profundizar en los conceptos de la POO como encapsulación, validaciones y diseño orientado a objetos. Cada clase incluye validaciones y métodos representativos que simulan problemas cotidianos a resolver con lógica de programación, proporcionando un aprendizaje completo e integral.