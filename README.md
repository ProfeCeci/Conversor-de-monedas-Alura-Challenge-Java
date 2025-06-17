# 💱 Conversor de Monedas - Alura Challenge

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Status-Completado-brightgreen?style=for-the-badge" alt="Status"/>
  <img src="https://img.shields.io/badge/Challenge-Alura-blue?style=for-the-badge" alt="Alura"/>
</div>

## 📋 Descripción

Conversor de monedas desarrollado en Java como parte del Challenge de Alura. La aplicación permite realizar conversiones entre diferentes monedas latinoamericanas y el dólar estadounidense, utilizando tasas de cambio en tiempo real obtenidas a través de la API ExchangeRate-API.

## ✨ Características

- 🔄 **Conversiones en tiempo real** - Tasas de cambio actualizadas
- 💰 **6 tipos de conversión** - USD, ARS, BRL, COP
- 🎯 **Interfaz intuitiva** - Menú simple y fácil de usar
- 🏗️ **Arquitectura sólida** - Programación orientada a objetos
- 🌐 **Integración con API** - ExchangeRate-API para datos actualizados
- ⚡ **Manejo de errores** - Validaciones y excepciones controladas

## 🚀 Conversiones Disponibles

| # | Conversión | Código |
|---|------------|--------|
| 1 | Dólar → Peso Argentino | USD → ARS |
| 2 | Peso Argentino → Dólar | ARS → USD |
| 3 | Dólar → Real Brasileño | USD → BRL |
| 4 | Real Brasileño → Dólar | BRL → USD |
| 5 | Dólar → Peso Colombiano | USD → COP |
| 6 | Peso Colombiano → Dólar | COP → USD |

## 🛠️ Tecnologías Utilizadas

- **Java 11+** - Lenguaje de programación
- **Gson** - Deserialización JSON
- **HTTP Client** - Consumo de API REST
- **ExchangeRate-API** - Fuente de tasas de cambio

## 📦 Estructura del Proyecto

```
src/
└── com/cecilialopez/conversormonedas/
    ├── main/
    │   └── ConversorApp.java          # Clase principal
    ├── models/
    │   ├── CambioMoneda.java          # Record para tasas de cambio
    │   ├── ConversionSolicitud.java   # Record para solicitudes
    │   └── OpcionConversion.java      # Enum de opciones
    ├── services/
    │   ├── ConsultaMoneda.java        # Servicio API
    │   └── ServicioConversion.java    # Lógica de conversión
    └── utils/
        ├── CalculadorConversion.java  # Cálculos matemáticos
        └── Conversor.java             # Utilidades UI
```

## 🔧 Instalación y Uso

### Prerrequisitos
- Java 11 o superior
- Conexión a internet
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Pasos de instalación

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/tuusuario/Conversor-de-monedas-Alura-Challenge-Java.git
   ```

2. **Navega al directorio**
   ```bash
   cd Conversor-de-monedas-Alura-Challenge-Java
   ```

3. **Compila el proyecto**
   ```bash
   javac -cp ".:lib/gson-2.8.8.jar" src/com/cecilialopez/conversormonedas/main/ConversorApp.java
   ```

4. **Ejecuta la aplicación**
   ```bash
   java -cp ".:lib/gson-2.8.8.jar:src" com.cecilialopez.conversormonedas.main.ConversorApp
   ```

### Dependencias

Asegúrate de tener la librería Gson en tu classpath:
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
```

## 📱 Ejemplo de Uso

```
************************************************
Sea bienvenido al Conversor de Moneda =]

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dolar
7) Salir

Elija una opción válida:
************************************************

> 1
Ha elegido Dólar => Peso argentino
Ingrese el valor que desee convertir: 
> 100
El valor de 100.00 USD corresponden al valor de =>>> 82500.00 ARS
```

## 🏗️ Arquitectura

El proyecto sigue principios de **programación orientada a objetos** y **separación de responsabilidades**:

- **Models**: Representan las entidades de datos (Records)
- **Services**: Contienen la lógica de negocio
- **Utils**: Funciones auxiliares y utilidades
- **Main**: Punto de entrada de la aplicación

### Patrones Implementados

- **Record Pattern** - Para inmutabilidad de datos
- **Enum Pattern** - Para opciones de conversión
- **Service Layer** - Para separar lógica de negocio
- **Dependency Injection** - Scanner inyectado en servicios

## 🌐 API Utilizada

**ExchangeRate-API**
- URL: `https://v6.exchangerate-api.com/v6/[API_KEY]/latest/[BASE_CURRENCY]`
- Método: GET
- Respuesta: JSON con tasas de cambio actualizadas

## 📝 Mejoras Futuras

- [ ] Agregar más monedas internacionales
- [ ] Implementar historial de conversiones
- [ ] Crear interfaz gráfica (JavaFX)
- [ ] Agregar tests unitarios
- [ ] Implementar cache para tasas de cambio
- [ ] Soporte para conversiones personalizadas

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 👩‍💻 Autora

**Cecilia López**

- GitHub: [@tuusuario](https://github.com/ProfeCeci)
- LinkedIn: [Tu LinkedIn](https://linkedin.com/in/andreacecilialopez)

## 🎓 Agradecimientos

- [Alura](https://www.alura.com.br/) - Por el desafío y la formación
- [ExchangeRate-API](https://exchangerate-api.com/) - Por proporcionar las tasas de cambio
- Comunidad Java - Por el apoyo y recursos

---

<div align="center">
  <p>⭐ ¡No olvides dar una estrella si te gustó el proyecto! ⭐</p>
</div>
