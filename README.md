# 20 Ejercicios - Estructuras de Control en Java

Proyecto de consola en Java que resuelve los 20 ejercicios del taller **"Estructuras de Control y Taller de Algoritmia"**. Cada ejercicio está implementado como una clase independiente dentro del paquete `model`, y se ejecuta desde un menú central en `Main`.

## Requisitos

- JDK 27 (el `pom.xml` está configurado con `maven.compiler.source=27` y `maven.compiler.target=27`).
- Maven (opcional) o IntelliJ IDEA.
- Terminal o consola para ejecutar el programa.

## Estructura de carpetas

```text
20Ejercicios/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── uniquindio/edu/co/
        │       ├── Main.java
        │       ├── Presentación y Taller_ Estructuras de Control en Java.pdf
        │       └── model/
        │           ├── Ejercicio1.java
        │           ├── Ejercicio2.java
        │           ├── Ejercicio3.java
        │           ├── Ejercicio4.java
        │           ├── Ejercicio5.java
        │           ├── Ejercicio6.java
        │           ├── Ejercicio7.java
        │           ├── Ejercicio8.java
        │           ├── Ejercicio9.java
        │           ├── Ejercicio10.java
        │           ├── Ejercicio11.java
        │           ├── Ejercicio12.java
        │           ├── Ejercicio13.java
        │           ├── Ejercicio14.java
        │           ├── Ejercicio15.java
        │           ├── Ejercicio16.java
        │           ├── Ejercicio17.java
        │           ├── Ejercicio18.java
        │           ├── Ejercicio19.java
        │           └── Ejercicio20.java
        └── resources/
```

- `Main.java`: contiene el menú, el `Scanner`, el `switch` y el ciclo que permite elegir varios ejercicios.
- `model/`: contiene una clase por ejercicio. Cada clase guarda los datos, realiza los cálculos y genera el reporte con `toString()`.
- `target/`: se genera automáticamente al compilar; no se edita manualmente.

## Cómo funciona la arquitectura

El proyecto separa las responsabilidades así:

1. **Entrada de datos (`Main`)**: el `Main` muestra la lista de ejercicios, lee la opción y solicita los datos necesarios con `Scanner`.
2. **Modelo (`model/EjercicioN`)**: cada clase recibe los datos mediante sus métodos `set`, los almacena en atributos `private`, realiza los cálculos con sus propios métodos y construye el resultado en `toString()`.
3. **Salida (`Main`)**: después de llenar el objeto, el `Main` imprime `ejercicio.toString()` en consola.
4. **Repetición**: al terminar, se pregunta `SI/NO` para volver al menú o cerrar el programa.

En otras palabras:

```text
Main (entrada y menú) -> EjercicioN (datos y cálculos) -> Main (impresión del resultado)
```

El menú funciona con un `switch`:

```java
switch (numeroejercio) {
    case 1:
        // Se crea Ejercicio1, se piden sus datos y se imprime
        break;
    case 2:
        // Se crea Ejercicio2, se piden sus datos y se imprime
        break;
    // ...
    default:
        // Opción inválida
        break;
}
```

## Diagrama de conexión con el Main

```mermaid
flowchart TD
    USUARIO[Usuario] -->|Elige una opción y escribe datos| MAIN[Main.java]
    MAIN --> MENU[Menú 1 al 20]
    MAIN --> SCANNER[Scanner]
    MAIN --> SWITCH{switch opción}

    SWITCH -->|1| E1[Ejercicio1]
    SWITCH -->|2| E2[Ejercicio2]
    SWITCH -->|3| E3[Ejercicio3]
    SWITCH -->|4| E4[Ejercicio4]
    SWITCH -->|5| E5[Ejercicio5]
    SWITCH -->|6| E6[Ejercicio6]
    SWITCH -->|7| E7[Ejercicio7]
    SWITCH -->|8| E8[Ejercicio8]
    SWITCH -->|9| E9[Ejercicio9]
    SWITCH -->|10| E10[Ejercicio10]
    SWITCH -->|11| E11[Ejercicio11]
    SWITCH -->|12| E12[Ejercicio12]
    SWITCH -->|13| E13[Ejercicio13]
    SWITCH -->|14| E14[Ejercicio14]
    SWITCH -->|15| E15[Ejercicio15]
    SWITCH -->|16| E16[Ejercicio16]
    SWITCH -->|17| E17[Ejercicio17]
    SWITCH -->|18| E18[Ejercicio18]
    SWITCH -->|19| E19[Ejercicio19]
    SWITCH -->|20| E20[Ejercicio20]

    E1 --> MODELO[Paquete model]
    E2 --> MODELO
    E3 --> MODELO
    E4 --> MODELO
    E5 --> MODELO
    E6 --> MODELO
    E7 --> MODELO
    E8 --> MODELO
    E9 --> MODELO
    E10 --> MODELO
    E11 --> MODELO
    E12 --> MODELO
    E13 --> MODELO
    E14 --> MODELO
    E15 --> MODELO
    E16 --> MODELO
    E17 --> MODELO
    E18 --> MODELO
    E19 --> MODELO
    E20 --> MODELO

    MODELO --> CALCULOS[Getters, setters, métodos de cálculo]
    CALCULOS --> REPORTE[toString con el resultado]
    REPORTE --> CONSOLA[Salida en consola]
    CONSOLA -->|SI/NO| MAIN
```

## Ejercicios implementados

| Opción | Clase | Tema | Tipo de estructura |
|---|---|---|---|
| 1 | `Ejercicio1` | Liquidación de cosecha cafetera | Secuencial |
| 2 | `Ejercicio2` | División de cuenta en restaurante con propina | Secuencial |
| 3 | `Ejercicio3` | Conversor de segundos para renderizado de video | Secuencial |
| 4 | `Ejercicio4` | Presupuesto de combustible para viaje | Secuencial |
| 5 | `Ejercicio5` | Alerta de sobrepeso en equipaje aéreo | Condicional simple |
| 6 | `Ejercicio6` | Control de temperatura en cuarto frío | Condicional doble |
| 7 | `Ejercicio7` | Despacho por cajas cerradas en bodega | Condicional doble con módulo |
| 8 | `Ejercicio8` | Pago de horas extras semanales | Condicional doble |
| 9 | `Ejercicio9` | Clasificación del IMC | Escalera `else if` |
| 10 | `Ejercicio10` | Facturación escalonada de acueducto | Escalera `else if` |
| 11 | `Ejercicio11` | Comisiones de ventas por metas | Escalera `else if` |
| 12 | `Ejercicio12` | Descuento por día de compra y medio de pago | Condicional anidado |
| 13 | `Ejercicio13` | Aprobación de crédito hipotecario | Condicional anidado |
| 14 | `Ejercicio14` | Triaje de urgencias hospitalarias | Condicional anidado |
| 15 | `Ejercicio15` | Convocatoria de beca internacional | Operadores lógicos `&&` y `||` |
| 16 | `Ejercicio16` | Verificación de año bisiesto | Operadores lógicos |
| 17 | `Ejercicio17` | Validador de triángulos | Operadores lógicos |
| 18 | `Ejercicio18` | Peaje vial automatizado por categoría | `switch` |
| 19 | `Ejercicio19` | Casa de cambio internacional | `switch` |
| 20 | `Ejercicio20` | Cotizador de suscripción a gimnasio | Integrador con `switch` y condicionales |

## Cómo se usa el modelo desde el Main

Todos los ejercicios siguen el mismo patrón. Por ejemplo, para el Ejercicio 9:

```java
case 9: {
    Ejercicio9 ej9 = new Ejercicio9();

    System.out.print("Ingrese el nombre del deportista: ");
    ej9.setDeportista(scanner.nextLine());

    System.out.print("Ingrese el peso en kilogramos: ");
    ej9.setPeso(scanner.nextDouble());

    System.out.print("Ingrese la estatura en metros: ");
    ej9.setEstatura(scanner.nextDouble());
    scanner.nextLine();

    System.out.println(ej9.toString());
    bandera = seguirocerrar(scanner);
    break;
}
```

La clase `Ejercicio9` se encarga del resto:

```java
public double calcularImc() {
    return peso / (estatura * estatura);
}

public String clasificarImc() {
    double imc = calcularImc();
    if (imc < 18.5) {
        return "Bajo peso";
    } else if (imc < 25.0) {
        return "Peso normal";
    } else if (imc < 30.0) {
        return "Sobrepeso";
    } else {
        return "Obesidad";
    }
}

@Override
public String toString() {
    return "Ejercicio9{" +
            "Paciente='" + deportista + '\'' +
            ", IMC Calculado=" + calcularImc() +
            ", Diagnóstico Médico=" + clasificarImc() +
            '}';
}
```

El flujo completo de una ejecución es:

1. El programa muestra el menú del 1 al 20.
2. El usuario escribe el número del ejercicio.
3. El `Main` crea el objeto `EjercicioN` correspondiente.
4. El `Main` pide los datos y los guarda usando los `set`.
5. El objeto calcula el resultado cuando se llama a sus métodos o a `toString()`.
6. El `Main` imprime el reporte.
7. El programa pregunta `SI/NO` para continuar.

### Ejemplo de ejecución

Entrada:

```text
9
Camila Soto
78
1.70
NO
```

Salida aproximada:

```text
Ejercicio9{Paciente='Camila Soto', Peso=78.0 kg, Estatura=1.7 m, IMC Calculado=26.989619377162633, Diagnóstico Médico=Sobrepeso}
```

## Cómo compilar y ejecutar

### Desde IntelliJ IDEA

1. Abrir la carpeta `20Ejercicios` como proyecto.
2. Verificar que el SDK del proyecto sea JDK 27.
3. Ejecutar la clase `Main`.

### Desde la terminal con `javac`

```bash
mkdir -p target/classes
find src/main/java -name "*.java" -print0 | xargs -0 javac -d target/classes
java -cp target/classes uniquindio.edu.co.Main
```

### Con Maven

```bash
mvn clean compile
java -cp target/classes uniquindio.edu.co.Main
```

## Cómo agregar un nuevo ejercicio

1. Crear una clase nueva en `src/main/java/uniquindio/edu/co/model/`, por ejemplo `Ejercicio21.java`.
2. Declarar sus atributos como `private`.
3. Crear los métodos `get` y `set` para cada dato de entrada.
4. Implementar los métodos de cálculo propios del ejercicio.
5. Sobrescribir `toString()` para devolver el reporte final.
6. Agregar la opción al menú del `Main`.
7. Agregar el nuevo `case` en el `switch`, leyendo los datos con `Scanner`, llamando a los `set` e imprimiendo `toString()`.

## Notas importantes

- Los datos se leen en el `Main`; las clases del `model` no deberían pedir datos por teclado. La única excepción actual es `Ejercicio2`, que conserva su lógica original para preguntar por la propina.
- El `Main` usa `scanner.useLocale(Locale.US)` para aceptar decimales escritos con punto, por ejemplo `1.70`.
- Después de leer un número con `nextInt()` o `nextDouble()`, se llama a `nextLine()` para limpiar el salto de línea pendiente.
- Los ejercicios del taller no usan ciclos en el modelo; el único ciclo del proyecto es el menú del `Main` para permitir ejecutar varios ejercicios.
- El PDF del taller está ubicado actualmente en `src/main/java/uniquindio/edu/co/` y sirve como referencia de los enunciados.
