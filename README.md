![Java](https://img.shields.io/badge/Java-Backend-blue)
![Estado](https://img.shields.io/badge/estado-en%20desarrollo-yellow)
![Dominio](https://img.shields.io/badge/dominio-Insurtech-green)
# 🚗 Insurance Quote Engine (Java)
## 📌 Descripción

Motor de cotización de seguros automotores desarrollado en Java que simula reglas reales de tarificación del sector asegurador.

Este proyecto forma parte de mi transición profesional hacia el desarrollo backend dentro del ecosistema **Insurtech**, combinando más de 12 años de experiencia en seguros con habilidades técnicas en programación.

---

## 🆕 Versión 2 – Motor de Cotización Interactivo

Esta versión incorpora un simulador de cotización de seguros por consola que permite ingresar datos reales y obtener una prima estimada basada en factores de riesgo.

### ✨ Funcionalidades

- Ingreso de datos por consola
- Evaluación de riesgo del conductor
- Selección del tipo de cobertura
- Cálculo dinámico de la prima
- Clasificación del nivel de riesgo (BAJO / MEDIO / ALTO)
- Validación básica de opciones ingresadas

### 🧠 Lógica de Negocio Implementada

La prima se calcula en base a:

- Edad del conductor
- Historial de siniestros
- Valor del vehículo
- Tipo de cobertura

Este modelo simula reglas reales de suscripción utilizadas en seguros automotores.

### ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Abrir el proyecto en IntelliJ IDEA
3. Ejecutar `Main.java`
4. Ingresar los datos solicitados en la consola

### 🧪 Ejemplo de ejecución
=== COTIZADOR DE SEGURO AUTOMOTOR ===
Edad del conductor: 30
Cantidad de siniestros: 1
Valor del vehículo: 8000000

Tipo de cobertura:
1 - Responsabilidad Civil
2 - Terceros Completo
3 - Todo Riesgo

👉 Prima mensual estimada: $192000.0
Nivel de riesgo: MEDIO


## 🎯 Objetivo del proyecto

- Modelar entidades del negocio asegurador
- Implementar reglas de riesgo reales
- Aplicar buenas prácticas de arquitectura backend
- Construir un portfolio orientado a Insurtech

---

## 🧠 Reglas de negocio implementadas

- Prima base: 5% del valor del vehículo
- Conductores menores de 25 años → +20%
- Más de 3 siniestros → +30%
- Ajustes por tipo de vehículo:
  - Deportivo → mayor riesgo
  - SUV → riesgo medio
  - Pickup → riesgo moderado
- Cobertura Todo Riesgo → +50%

---

## 🏗️ Arquitectura del proyecto
com.nicocalderon.insurtech
│
├── Main.java → Punto de entrada
├── model → Entidades del dominio
│ ├── Driver.java
│ ├── Vehicle.java
│ ├── VehicleType.java
│ └── CoverageType.java
└── service → Lógica de negocio
└── QuoteService.java

---

## 🛠️ Tecnologías utilizadas

- Java 17
- IntelliJ IDEA
- Programación Orientada a Objetos (OOP)
- Arquitectura por capas
- Git & GitHub

---

## 💡 Ejemplo de uso
Edad del conductor: 22
Siniestros: 1
Vehículo: DEPORTIVO
Valor: 20000
Cobertura: TODO_RIESGO

Prima estimada: $2160

---

## 🚀 Próximas mejoras

- Validación de datos y manejo de errores
- Persistencia de cotizaciones
- API REST con Spring Boot
- Integración con base de datos
- Autenticación de usuarios
- Simulación de scoring de riesgo

---

## 👨‍💻 Sobre mí

Soy Nicolás Calderón, profesional del sector asegurador con más de 12 años de experiencia en:

- Seguros patrimoniales y de personas
- Suscripción y análisis de riesgos
- Asesoramiento financiero y protección patrimonial

Actualmente enfocado en el desarrollo backend orientado a **Insurtech**, con el objetivo de crear soluciones tecnológicas que modernicen el mercado asegurador.

---

## 🌐 Contacto

- LinkedIn: [(agregar)](https://www.linkedin.com/in/nicoo-calderon/)
- Email: calderondpc@gmail.com
- GitHub: https://github.com/CaldeNik
